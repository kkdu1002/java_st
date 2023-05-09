package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_insert_Ex2
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		StringBuffer sql = null;
		try
		{
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 커넥션 얻어오기
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			//Statement 객체 얻기
			stmt = con.createStatement();
			sql = new StringBuffer();
			// insert
//			sql.append("insert into department ");
//			sql.append("values(203,'제어계측공학과',200,'7호관')");
			sql.append("insert into department ");
			sql.append("values(101,'컴퓨터학과',200,'1호관')");
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "개의 행이 추가되었습니다. ");
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
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
	}
}