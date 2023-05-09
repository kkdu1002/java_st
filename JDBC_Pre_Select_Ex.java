package jang9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Pre_Select_Ex 
{
	public static void main(String[] args) 
	{
		StringBuffer sql = new StringBuffer();
		sql.append("select a.name, a.profno, a.position, b.dname ");
		sql.append("from professor a , department b ");
		sql.append("where a.deptno = b.deptno "); // 조인
		sql.append("and a.deptno = 101");
		// like '%' || ? || '%' "); // 부분일치 like '%교수%'
		// || -> 문자열 결합 , 논리연산자 (조건 OR 조건) && -> 입력 -> AND (자바의 Scanner 가능)
	
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			// 101셋팅
			con = ConnUtil.getConeConnection();
			pstmt = con.prepareStatement(sql.toString());
			//쿼리 실행
			rs = pstmt.executeQuery();
			System.out.println("이름\t교수번호\t전공학과\t직책");
			System.out.println("-----------------------------");
			while(rs.next())
			{
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getInt("profno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("position"));
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}

	}
}