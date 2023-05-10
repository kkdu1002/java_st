package jang9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

public class JDBC_Properties_Delete
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/jang9/department.properties"));
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(pro.getProperty("department_delete"));
			pstmt.setInt(1,205);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이 삭제되었습니다.");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		finally
		{
			ConnUtil.close(pstmt, con, null);
		}
	}
}