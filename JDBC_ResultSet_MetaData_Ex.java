package jang9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

/*
	ResultSetMetaData : java.sql.ResultSetMetaData/java.sql.Types
	MetaData�� �������� ������Ҹ� ��Ÿ����. ResultSetMetaData�� ResultSet�� �����ϴ� ��� ��Ҹ�
	�˾Ƴ� �� �ִ� �޼ҵ带 �����Ѵ�.
 */
public class JDBC_ResultSet_MetaData_Ex 
{	// ���� select * from professor;
	public static void main(String[] args) throws IOException, SQLException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Ű����� ������ sql������ �Է¹޴� �Է���ġ ����
		System.out.print("sql�Է�");
		String sql = br.readLine();
		Connection con = ConnUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		//���� ������������ �ΰ������� �������ִ� ResultsetMetaData ���
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnType(6));
		System.out.println("Į���� ���� : " + rsmd.getColumnCount());
		
		//Į���� ���
		for(int i = 1; i <= rsmd.getColumnCount(); i++)
		{
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println("\n-------------------------------------------------------");
		//Į�� Ÿ��
		for(int i = 1; i <= rsmd.getColumnCount(); i++)
		{
			System.out.print(rsmd.getColumnTypeName(i) + "\t");
		}
		System.out.println();
		int Į������ =  rsmd.getColumnCount();
		while(rs.next())
		{
			for(int Į����ȣ = 1; Į����ȣ <= Į������; Į����ȣ++)
			{
				int Į��Ÿ�� = rsmd.getColumnType(Į����ȣ);
				switch(Į��Ÿ��)
				{
					case 2: // Types.NUMERIC
						System.out.print(rs.getInt(Į����ȣ) + "\t");
						break;
					case Types.VARCHAR:
						System.out.print(rs.getString(Į����ȣ) + "\t");
						break;
					case 93: //Types.TIMESTAMP
						System.out.print(rs.getDate(Į����ȣ) + "\t");
						break;
					default:
						break;
				}
			}
			System.out.println();
		}
	}
}