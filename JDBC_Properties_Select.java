package jang9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBC_Properties_Select
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/jang9/department.properties"));
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(pro.getProperty("department_select2"));
			int i = pstmt.executeUpdate();
			System.out.println(i + "�� ���� ���õǾ����ϴ�.");
			System.out.println("---------------------------------------");
			System.out.println("�а���ȣ\t�а���\t\t�а��ο�\t����");
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getInt("college") + "\t");
				System.out.println(rs.getString("loc"));
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		finally
		{
			ConnUtil.close(pstmt, con, rs);
		}
	}
}