package jang9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/*
	Properties를 이용한 sql문을 해보자
	 sql문을 별도의 properties파일에 정의하고,
	 Properties를 이용해서 properties파일을
	 읽어서 getProperty(String Key)를 활용해서
	 각각의 sQL문을 얻을 수 있다.
	 department.properties를 만들자
 */



public class JDBC_Properties_Insert 
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
			// department.properties에 정의된 sql을 가져와서
			// prepareStatement 객체를 만든다.
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
			// parameter(바인딩변수에 값 할당하기) 셋팅하기
			pstmt.setInt(1, 205);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 추가 되었습니다.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(pstmt != null)
					pstmt.close();
				if(con != null)
					con.close();
			}
			catch(SQLException e)
			{
				System.out.println(e.getStackTrace());
			}
		}
	}
}