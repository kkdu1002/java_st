package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex2 
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
			
			// DDL , DML , DCL
			// insert , delete , update / �˻� , ��ȸ :select
			// ���尴ü ����(����) CRUD/exeuteUpdate : ����,����,����
			stmt = conn.createStatement(); // sql�� ������ ��ü����
			
			/*
			sql2 = "insert into GOODSINFO values('10006','������ ������','400000','�Ｚ')";
			int result = stmt.executeUpdate(sql2);
			System.out.println("���� ����" + result);
			*/
			
			// ����
			
			/*
			sql2 = "update goodsinfo set name='�����'where maker ='���̸���'";
			int result = stmt.executeUpdate(sql2);
			System.out.println("���� ����" + result);
			*/
			
			/*
			sql2 = "delete from goodsinfo where code = '10006'";
			int result = stmt.executeUpdate(sql2);
			System.out.println("���� ����" + result);
			*/
			
			/*
			sql2 = "delete from goodsinfo where maker = '���̸���' or price < '250000'";
			int result = stmt.executeUpdate(sql2);
			System.out.println("���� ����" + result);
			*/
			
			// �˻� select/exeuteQuery() �˻��� ���
			sql = "Select * from goodsinfo";
			rs = stmt.executeQuery(sql);
			System.out.println("��ǰ�ڵ�    ��ǰ��  \t\t����\t\t������");
			System.out.println("--------------------------------------------");
			// rs���� �ڷ��о�ͼ� ���
			while(rs.next())
			{
				String code = rs.getString(1); // "Į����" �Ǵ� ��ġ
				String name = rs.getString(2); // ��ġ
				int price = rs.getInt("price"); // "Į����"
				String maker = rs.getString(4); // ��ġ
				
				System.out.printf("%5s    %s  \t%d\t\t%s\n",code,name,price,maker);
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
