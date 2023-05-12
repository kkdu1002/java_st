package mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
/*
	- �����ͺ��̽��� ������ ���� DBUtilŬ������ �ۼ�
	getConnect() : Class.forName()�� ȣ���Ͽ� Oracle�� JDBC����̹��� ���
	JDBC����̹��� ����� DriverManager.getConnection()�� ȣ���Ͽ� DB�� ���� Ŀ�ؼ��� ����
 */
public class DBUtil 
{
	static final String driver = "oracle.jdbc.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static Connection getConnection() throws Exception
	{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, "hr", "hr");
		return con;
	}
}