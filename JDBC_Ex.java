package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Ex {

	public static void main(String[] args) throws SQLException 
	{
		Connection conn = null; // ���ᰴü �ʱ�ȭ
		try
		{	// ����̺� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
		
			// ���ᰴü ��� (url , id , pw)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("�����ͺ��̽� ���� ����");
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
