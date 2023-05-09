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
			sql.append(" where dname = '��ǻ���а�'");
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "���� ���� �����Ǿ����ϴ�.");
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