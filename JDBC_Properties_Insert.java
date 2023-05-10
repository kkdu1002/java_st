package jang9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/*
	Properties�� �̿��� sql���� �غ���
	 sql���� ������ properties���Ͽ� �����ϰ�,
	 Properties�� �̿��ؼ� properties������
	 �о getProperty(String Key)�� Ȱ���ؼ�
	 ������ sQL���� ���� �� �ִ�.
	 department.properties�� ������
 */



public class JDBC_Properties_Insert 
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/jang9/department.properties"));
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con = ConnUtil.getConnection();
			// department.properties�� ���ǵ� sql�� �����ͼ�
			// prepareStatement ��ü�� �����.
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
			// parameter(���ε������� �� �Ҵ��ϱ�) �����ϱ�
			pstmt.setInt(1, 205);
			pstmt.setString(2, "������а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5ȣ��");
			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� �߰� �Ǿ����ϴ�.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(pstmt != null)
					pstmt.close();
				if(con != null)
					con.close();
			}
			catch(SQLException e)
			{
				System.out.println(e.getStackTrace());
			}
		}
	}
}