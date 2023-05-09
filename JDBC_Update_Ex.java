package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Update_Ex 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		StringBuffer sql = new StringBuffer();
		try
		{
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 커넥션 얻어오기
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			//Statement 객체 얻기
			stmt = con.createStatement();
			sql.append("update department set dname = '전자계산학과'");
			sql.append(" where deptno = '101'");
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "개의 행이 변경되었습니다.");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage() + "클래스가 없어요.");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage() + "insert문 틀립니다.");
		}
		finally
		{
			try
			{
				if(con != null)
					con.close();
				if(stmt != null)
					stmt.close();
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
	}
}