package jang9;
/*
	커서 : 명시적 (select) , 묵시적 (DML)
	ResultSet : select query의 수행결과로 얻어진 결과집합을 추상화한것이다.
	ResultSet은 결과집합에서 data를 가져올 수 있는 다양한 메소드와 Cursor를 포함하고있음
	
	boolean first() : ResultSet에서 커서를 첫번째 row로 이동한다. row가 있으면 true 없으면 false
			last() : ResultSet에서 커서를 마지막 row로 이동한다.
			next() : ResultSet에서 커서를 다음 row로 이동한다.
			privious() : ResultSet에서 커서를 이전 row로 이동한다.
	int getInt(int 칼럼인덱스) : ResultSet에서 커서가 가르키는 현재 row에서 columnIndex에서 해당하는 int값 반환 // columnIndex는 무조건 1부터 시작
	String getString(String 칼럼이름) : ResultSet에서 커서가 가르키는 현재 row에서 columnName에서 해당하는 int값 반환 // "칼럼이름"
	String ResultSet
	getString(int 칼럼인덱스) : ResultSet에서 커서가 가르키는 현재 row에서 columnIndex에 해당하는 String값을 반환
	getString(String 칼럼이름) : ResultSet에서 커서가 가르키는 현재 row에서 columnName에 해당하는 String값을 반환
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select_Ex 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		StringBuffer sql = new StringBuffer();
		ResultSet rs = null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			stmt = con.createStatement();
			sql.append("select * from department");
			sql.append(" order by deptno desc");
			rs = stmt.executeQuery(sql.toString());
			System.out.println("부서번호\t부서명\t  상위부서번호\t 위치");
			System.out.println("--------------------------------------------");
			// rs에서 자료읽어와서 출력
			while(rs.next())
			{
				int deptno = rs.getInt(1); // "칼럼명" 또는 위치
				String dname = rs.getString(2); // 위치
				int colleget = rs.getInt(3); // "칼럼명"
				String loc = rs.getString(4); // 위치
				
				System.out.printf("%d\t%s   %4d\t%4s\n",deptno,dname,colleget,loc);
			}
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "개의 행이 선택되었습니다.");
		}
		catch(ClassNotFoundException e)
		{
			e.getMessage();
		}
		catch(SQLException e)
		{
			e.getMessage();
		}
		finally
		{
			try
			{
				if(con != null)
					con.close();
				if(stmt != null)
					stmt.close();
				if(rs != null)
					rs.close();
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
	}

}
