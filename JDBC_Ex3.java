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
		// ���ᰴü ����
		Connection conn = null;
		// ���尴ü ����
		Statement stmt = null;
		// ResultSet ��ü ����
		ResultSet rs = null;
		String sql = "";
		String sql2 = "";
		try
		{
			// ����̺� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			//���ᰴü ������
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","hr","hr");
			
			
			stmt = conn.createStatement(); // sql�� ������ ��ü����
			
			sql2 = "insert into stock values('10006','130')";
			int result = stmt.executeUpdate(sql2);
			System.out.println("���� ����" + result);
			
			// �˻� select/exeuteQuery() �˻��� ���
			sql = "Select * from stock";
			rs = stmt.executeQuery(sql);
			System.out.println("��ǰ�ڵ�    ������");
			System.out.println("--------------------------");
			
			
			// rs���� �ڷ��о�ͼ� ���
			while(rs.next())
			{
				String code = rs.getString(1); // "Į����" �Ǵ� ��ġ
				int quantity = rs.getInt("quantity"); // "Į����"
				
				System.out.printf("%5s      %d\n",code,quantity);
			}
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
				//conn , stmt , rs�ڿ� �ݳ�
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
