package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex3 
{
	public static void main(String[] args)
	{
		// 연결객체 정의
		Connection conn = null;
		// 문장객체 정의
		Statement stmt = null;
		// ResultSet 객체 정의
		ResultSet rs = null;
		String sql = "";
		String sql2 = "";
		try
		{
			// 드라이브 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//연결객체 얻어오기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","hr","hr");
			
			
			stmt = conn.createStatement(); // sql문 수행할 객체생성
			
			sql2 = "insert into stock values('10006','130')";
			int result = stmt.executeUpdate(sql2);
			System.out.println("삽입 성공" + result);
			
			// 검색 select/exeuteQuery() 검색만 사용
			sql = "Select * from stock";
			rs = stmt.executeQuery(sql);
			System.out.println("상품코드    재고수량");
			System.out.println("--------------------------");
			
			
			// rs에서 자료읽어와서 출력
			while(rs.next())
			{
				String code = rs.getString(1); // "칼럼명" 또는 위치
				int quantity = rs.getInt("quantity"); // "칼럼명"
				
				System.out.printf("%5s      %d\n",code,quantity);
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("해당 클래스를 찾을수 없습니다.");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				//conn , stmt , rs자원 반납
				if(conn != null)
					conn.close();
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
