package jang9;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBC_Pre_Insert_Ex 
{
	public static void main(String[] args) 
	{	// preparedStatement�� ����ϴ� ���
		StringBuffer sql = new StringBuffer();
		sql.append("insert into professor");
		
		//sysdate() �ý����� ���� ��¥ �������� �Լ� : ���α׷������� '()'������� ����
		sql.append(" values(?,?,?,?,?,sysdate,?,?)");
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con = ConnUtil.getConeConnection();
			pstmt = con.prepareStatement(sql.toString());
			System.out.println("������� ����Ǵ��� Ȯ���غ�");
			// �� ����
			pstmt.setInt(1, 9902); // �⺻Ű �ߺ� x , ���ϼ� , not null 9901
			pstmt.setString(2,"��浿");
			pstmt.setString(3,"dong");
			pstmt.setString(4,"�ð�����");
			pstmt.setInt(5,450);
			pstmt.setInt(6,40);
			pstmt.setInt(7,101);
			System.out.println("�������-2 ����Ǵ��� Ȯ���غ�");
//			���� ����
			int i = pstmt.executeUpdate();
			System.out.println(i + "�� ���� �߰��Ǿ����ϴ�.");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage() + "sql����....");
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
				System.out.println(e.getMessage());
			}
		}
	}
}