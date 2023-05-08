package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Ex {

	public static void main(String[] args) throws SQLException 
	{
		Connection conn = null; // 연결객체 초기화
		try
		{	// 드라이브 로딩
			Class.forName("oracle.jdbc.OracleDriver");
		
			// 연결객체 얻기 (url , id , pw)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("데이터베이스 접속 성공");
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		finally
		{
			conn.close();
		}
	}

}
