package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
	JDBC �̿��� �����ͺ��̽� ���� ���
1�ܰ� : Driver �ε� Class.forName("oracle.jdbc.OracleDriver");
2�ܰ� : DataBase���� Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
																	ip�ּ� : ��Ʈ��ȣ : �������� , ������ = user , ��й�ȣ
3�ܰ� : Query�� �ۼ�
Statement stmt = con.createStatement(); // ����
PreparedStatement pstmt = con.PreparedStatement(sql); // ����

4�ܰ� : ������
ResultSet rs = stmt.excuteQurey("������"); // select
stmt.excuteUpdate("������"); //insert , delete , update

5�ܰ� : resource����� �ݱ�
con.close();
stmt.close();
re.close();

PreparedStatement��ü�� ���� �� ���ε� ������ ���
String sql = "insert into department values()";
PreparedStatement pstmt = con.PreparedStatement(sql);
���ε� ������ ������ŭ ������� �ش� ������ ��ü�� ���� �������ش�
pstmt.setInt(1,203);
pstmt.setString(2,"��ǻ�Ͱ���");
pstmt.setInt(3,200);
pstmt.setString(4,"4ȣ��");
���ε� ������ Į���� ��� �Ұ�

Primary key
���̺��� �� ���� �ٸ� ��� ������ �ִ� ������ �ϴ� �ʵ�
���ϼ�, �ݵ�� ���� �־���ϰ� �ߺ��ȵ�
not null , unique ���������� ����

Foreign key
�� ���̺��� �⺻Ű�� ���踦 ���� �� ���� ���̺��� �ִ� ��츦 ���� ��
�ܺ�Ű�� ���̺� ���� �� ���� �ʵ��� ���ÿ� �ٸ� ���̺�(�θ�:����Ű)�� �⺻Ű�� ���� �ʵ带 ���Ѵ�.
 */
public class ConnUtil 
{
	static
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage() + "not class");
		}
	}
	public static Connection getConeConnection() throws SQLException
	{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	}
}
