package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnUtil 
{
	static
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage() + "클래스 실패");
		}
	}
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	}
	public static void close(PreparedStatement pstmt , Connection con , ResultSet rs)
	{
		try
		{
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				con.close();
			if(rs != null)
				rs.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
	}
}
