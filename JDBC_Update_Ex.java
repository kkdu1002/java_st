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
			// ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// Ŀ�ؼ� ������
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			//Statement ��ü ���
			stmt = con.createStatement();
			sql.append("update department set dname = '���ڰ���а�'");
			sql.append(" where deptno = '101'");
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "���� ���� ����Ǿ����ϴ�.");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage() + "Ŭ������ �����.");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage() + "insert�� Ʋ���ϴ�.");
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