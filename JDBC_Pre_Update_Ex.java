package jang9;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBC_Pre_Update_Ex
{

	public static void main(String[] args)
	{
		StringBuffer sql = new StringBuffer();
		Connection con = null;
		PreparedStatement pstmt = null;
		sql.append("update professor");
		sql.append(" set position = ? where name = ?");
		try
		{
			con = ConnUtil.getConeConnection();
			pstmt = con.prepareStatement(sql.toString());
			//세팅
			pstmt.setString(1, "시간강사");
			pstmt.setString(2, "홍길동");
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 변경되었습니다.");
		}
		catch(Exception e)
		{
			e.getStackTrace();
			System.out.println("오류입니다.");
		}
		finally
		{
			try
			{
				if(con != null)
					con.close();
				if(pstmt != null)
					pstmt.close();
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
	}
}