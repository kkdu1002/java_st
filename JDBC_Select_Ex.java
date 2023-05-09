package jang9;
/*
	Ŀ�� : ����� (select) , ������ (DML)
	ResultSet : select query�� �������� ����� ��������� �߻�ȭ�Ѱ��̴�.
	ResultSet�� ������տ��� data�� ������ �� �ִ� �پ��� �޼ҵ�� Cursor�� �����ϰ�����
	
	boolean first() : ResultSet���� Ŀ���� ù��° row�� �̵��Ѵ�. row�� ������ true ������ false
			last() : ResultSet���� Ŀ���� ������ row�� �̵��Ѵ�.
			next() : ResultSet���� Ŀ���� ���� row�� �̵��Ѵ�.
			privious() : ResultSet���� Ŀ���� ���� row�� �̵��Ѵ�.
	int getInt(int Į���ε���) : ResultSet���� Ŀ���� ����Ű�� ���� row���� columnIndex���� �ش��ϴ� int�� ��ȯ // columnIndex�� ������ 1���� ����
	String getString(String Į���̸�) : ResultSet���� Ŀ���� ����Ű�� ���� row���� columnName���� �ش��ϴ� int�� ��ȯ // "Į���̸�"
	String ResultSet
	getString(int Į���ε���) : ResultSet���� Ŀ���� ����Ű�� ���� row���� columnIndex�� �ش��ϴ� String���� ��ȯ
	getString(String Į���̸�) : ResultSet���� Ŀ���� ����Ű�� ���� row���� columnName�� �ش��ϴ� String���� ��ȯ
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select_Ex 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		StringBuffer sql = new StringBuffer();
		ResultSet rs = null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			stmt = con.createStatement();
			sql.append("select * from department");
			sql.append(" order by deptno desc");
			rs = stmt.executeQuery(sql.toString());
			System.out.println("�μ���ȣ\t�μ���\t  �����μ���ȣ\t ��ġ");
			System.out.println("--------------------------------------------");
			// rs���� �ڷ��о�ͼ� ���
			while(rs.next())
			{
				int deptno = rs.getInt(1); // "Į����" �Ǵ� ��ġ
				String dname = rs.getString(2); // ��ġ
				int colleget = rs.getInt(3); // "Į����"
				String loc = rs.getString(4); // ��ġ
				
				System.out.printf("%d\t%s   %4d\t%4s\n",deptno,dname,colleget,loc);
			}
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "���� ���� ���õǾ����ϴ�.");
		}
		catch(ClassNotFoundException e)
		{
			e.getMessage();
		}
		catch(SQLException e)
		{
			e.getMessage();
		}
		finally
		{
			try
			{
				if(con != null)
					con.close();
				if(stmt != null)
					stmt.close();
				if(rs != null)
					rs.close();
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
	}

}
