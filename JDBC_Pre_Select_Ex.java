package jang9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Pre_Select_Ex 
{
	public static void main(String[] args) 
	{
		StringBuffer sql = new StringBuffer();
		sql.append("select a.name, a.profno, a.position, b.dname ");
		sql.append("from professor a , department b ");
		sql.append("where a.deptno = b.deptno "); // ����
		sql.append("and a.deptno = 101");
		// like '%' || ? || '%' "); // �κ���ġ like '%����%'
		// || -> ���ڿ� ���� , �������� (���� OR ����) && -> �Է� -> AND (�ڹ��� Scanner ����)
	
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			// 101����
			con = ConnUtil.getConeConnection();
			pstmt = con.prepareStatement(sql.toString());
			//���� ����
			rs = pstmt.executeQuery();
			System.out.println("�̸�\t������ȣ\t�����а�\t��å");
			System.out.println("-----------------------------");
			while(rs.next())
			{
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getInt("profno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("position"));
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}

	}
}