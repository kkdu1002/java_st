package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete_Ex 
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		StringBuffer sql = new StringBuffer();
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			stmt = con.createStatement();
			sql.append("delete from department");
			sql.append(" where dname = '컴퓨터학과'");
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "개의 행이 삭제되었습니다.");
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
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
	}
}