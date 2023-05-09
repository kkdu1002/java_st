package jang9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_Pre_Delete_Ex 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("delete from professor");
		sql.append(" where name = ?");
		try
		{
			con = ConnUtil.getConeConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, "고길동");
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 삭제되었습니다.");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}