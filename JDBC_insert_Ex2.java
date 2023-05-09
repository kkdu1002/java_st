package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_insert_Ex2
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		StringBuffer sql = null;
		try
		{
			// ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// Ŀ�ؼ� ������
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			//Statement ��ü ���
			stmt = con.createStatement();
			sql = new StringBuffer();
			// insert
//			sql.append("insert into department ");
//			sql.append("values(203,'����������а�',200,'7ȣ��')");
			sql.append("insert into department ");
			sql.append("values(101,'��ǻ���а�',200,'1ȣ��')");
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "���� ���� �߰��Ǿ����ϴ�. ");
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