package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Insert_Ex 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		Statement stmt = null;
		String sql = "";
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","hr","hr");
			stmt = conn.createStatement();
			
			sql = "create table department("  
					+"deptno number(3) not null primary key,"
					+"dname varchar2(50) not null,"
					+"college number(3) not null,"
					+"loc varchar2(10) not null,"
					+"constraint deppartment_pk"
					+")";
			stmt.executeQuery(sql);
			System.out.println("���̺� ���� �Ϸ�");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("�ش� Ŭ������ ã���� �����ϴ�.");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(conn != null)
					conn.close();
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