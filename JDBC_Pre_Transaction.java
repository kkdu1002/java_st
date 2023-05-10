package jang9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
	Transaction : �������� �۾��� �ϳ��� ������ �۾� ������ ���� �ִ� ���� ���Ѵ�.
	�ϳ��� �۾� �������� ��ü �۾����� ��� �ùٸ��� ����ǰų�(commit : database�� �ݿ���)
	�Ǵ� ��ü �۾��� ��� ������� �ʵ��� �Ѵ�(rollback : database�� �ݿ����)
	
	Connection�� Transaction���� �޼ҵ�
	void commit() : Ʈ���������� ������ ��� �ڿ��� db�� �ݿ�
	void rollback() : ���� Ʈ�����ǿ� �������� ��� �۾��� �ǵ�����.
	void rollback(SavePoint s) : Savepoint ���� ������ ��� �۾��� �ǵ���
	void setSavePoint(String name) : ������ Ʈ�����ǳ��� Savepoint ����
	void setAutoCommit(boolean value) : auto-commit ����� ����
	
	���α׷��� �ڵ� Ŀ�Ե�
 */
public class JDBC_Pre_Transaction 
{
	public static void main(String[] args) 
	{
		/*
		 	transaction : ���� �۾�����
		 	insert, delete , update���� �۾����� �ϳ��� ������ �۾������� ���
		 	��������� ��� �۾��� ����ó���� ��쿡 commit�� �����Ͽ� db�� �ݿ��ϰ�
		 	���������� �ϳ��� ����ó������ ���� ���rollback�� �����Ͽ�
		 	�۾��������� ��� �۾��� ����Ѵ�
		 */
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?)");
		
		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname = ? , loc = ? ");
		sql2.append("where deptno = ?");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			// --------------- transaction ���� ---------------
			// �ϳ��� ������ �۾����� ����
			con = ConnUtil.getConnection();
			// autoCommit��� ��Ȱ��ȭ ��Ų��.
			con.setAutoCommit(false);
			// ------------ 1�� �۾� ���� : �����۾� -------------
//			pstmt = con.prepareStatement(sql1.toString());
//			pstmt.setInt(1, 203);
//			pstmt.setString(2, "������а�");
//			pstmt.setInt(3, 200);
//			pstmt.setString(4, "10ȣ��");
//			pstmt.executeUpdate();
			// --------------- 1�� �۾� �� -----------------
			// ------------ 2�� �۾� ���� : �����۾� -------------
			pstmt = con.prepareStatement(sql2.toString());
			pstmt.setString(1, "���ڰ���а�");
			pstmt.setString(2, "5ȣ��");
			pstmt.setInt(3, 101);
			pstmt.executeUpdate();
			// --------------- 2�� �۾� �� -----------------
			
			//������ ���������� ����� ��� db�� �ݿ�
			con.commit();
			System.out.println("db�� �ݿ���");
			// transaction ����
		}
		catch(SQLException e)
		{
			try
			{
				con.rollback();
				System.out.println("db�� �ݿ� ����մϴ�");
			}
			catch(SQLException e1)
			{
				e1.getStackTrace();
			}
		}
		finally
		{
			try
			{
				if(pstmt != null)
					pstmt.close();
			}
			catch(Exception e) {}
			try
			{
				if(con != null)
					con.close();
			}
			catch(Exception e) {}
		}
	}
}