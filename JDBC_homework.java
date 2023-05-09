package jang9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_homework 
{
	public static void main(String[] args) throws SQLException, IOException 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		StringBuffer sql = new StringBuffer();
		StringBuffer sql2 = new StringBuffer();
		sql.append("insert into Score_DataBase");
		sql.append(" values(?,?,?,?)");
		
		ResultSet rs = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name ="";
		int kor,eng,math,count = -1;
		boolean x = true;
		
		try
		{
			con = ConnUtil.getConeConnection();
			pstmt = con.prepareStatement(sql.toString());
A:			while(x)
			{
				System.out.print("�̸� : ");
				name = br.readLine();
				if(name.equals("0"))
					break A;
				System.out.print("���� : ");
				kor = Integer.parseInt(br.readLine());
				System.out.print("���� : ");
				eng = Integer.parseInt(br.readLine());
				System.out.print("���� : ");
				math = Integer.parseInt(br.readLine());
				
				pstmt.setString(1, name);
				pstmt.setInt(2, kor);
				pstmt.setInt(3, eng);
				pstmt.setInt(4, math);
				
				int i = pstmt.executeUpdate();
				count++;
				System.out.println((i+count) + "�� ���� �߰��Ǿ����ϴ�.");
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		sql2.append("select * from Score_DataBase ");
		sql2.append("order by '"+ name +"' ");
		pstmt2 = con.prepareStatement(sql2.toString());
		System.out.println("----------------- ����ϱ� -------------------");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println("--------------------------------------");
		rs = pstmt2.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getString("name") + "\t");
			System.out.print(rs.getInt("kor") + "\t");
			System.out.print(rs.getInt("eng") + "\t");
			System.out.print(rs.getInt("math")+ "\t");
			System.out.print((rs.getInt("kor") + rs.getInt("math") + rs.getInt("eng")) + "\t");
			System.out.println((rs.getInt("kor") + rs.getInt("math") + rs.getInt("eng"))/3 + "\t");
		}	
	}
}