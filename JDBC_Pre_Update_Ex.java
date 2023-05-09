package jang9;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBC_Pre_Update_Ex
{

	public static void main(String[] args)
	{
		StringBuffer sql = new StringBuffer();
		Connection con = null;
		PreparedStatement pstmt = null;
		sql.append("update professor");
		sql.append(" set position = ? where name = ?");
		try
		{
			con = ConnUtil.getConeConnection();
			pstmt = con.prepareStatement(sql.toString());
			//����
			pstmt.setString(1, "�ð�����");
			pstmt.setString(2, "ȫ�浿");
			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� ����Ǿ����ϴ�.");
		}
		catch(Exception e)
		{
			e.getStackTrace();
			System.out.println("�����Դϴ�.");
		}
		finally
		{
			try
			{
				if(con != null)
					con.close();
				if(pstmt != null)
					pstmt.close();
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
	}
}