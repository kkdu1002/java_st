package jang9;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBC_Pre_Insert_Ex 
{
	public static void main(String[] args) 
	{	// preparedStatement를 사용하는 경우
		StringBuffer sql = new StringBuffer();
		sql.append("insert into professor");
		
		//sysdate() 시스템의 오늘 날짜 가져오는 함수 : 프로그램에서는 '()'사용하지 않음
		sql.append(" values(?,?,?,?,?,sysdate,?,?)");
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con = ConnUtil.getConeConnection();
			pstmt = con.prepareStatement(sql.toString());
			System.out.println("여기까지 진행되는지 확인해봄");
			// 값 세팅
			pstmt.setInt(1, 9902); // 기본키 중복 x , 유일성 , not null 9901
			pstmt.setString(2,"고길동");
			pstmt.setString(3,"dong");
			pstmt.setString(4,"시간교수");
			pstmt.setInt(5,450);
			pstmt.setInt(6,40);
			pstmt.setInt(7,101);
			System.out.println("여기까지-2 진행되는지 확인해봄");
//			쿼리 실행
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이 추가되었습니다.");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage() + "sql실패....");
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
				System.out.println(e.getMessage());
			}
		}
	}
}