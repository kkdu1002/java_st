package jang9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
	Transaction : 여러개의 작업을 하나의 논리적인 작업 단위로 묶어 주는 것을 말한다.
	하나의 작업 단위내의 전체 작업들이 모두 올바르게 수행되거나(commit : database에 반영함)
	또는 전체 작업이 모두 수행되지 않도록 한다(rollback : database에 반영취소)
	
	Connection의 Transaction관련 메소드
	void commit() : 트랜젝션으로 설정된 모든 자원을 db에 반영
	void rollback() : 현재 트랜젝션에 설정내의 모든 작업을 되돌린다.
	void rollback(SavePoint s) : Savepoint 설정 이후의 모든 작업을 되돌림
	void setSavePoint(String name) : 현재의 트랜젝션내의 Savepoint 설정
	void setAutoCommit(boolean value) : auto-commit 기능을 설정
	
	프로그램은 자동 커밋됨
 */
public class JDBC_Pre_Transaction 
{
	public static void main(String[] args) 
	{
		/*
		 	transaction : 논리적 작업단위
		 	insert, delete , update등의 작업들을 하나의 논리적인 작업단위로 묶어서
		 	쿼리실행시 모든 작업이 정상처리된 경우에 commit을 실행하여 db에 반영하고
		 	쿼리실행중 하나라도 정상처리되지 않은 경우rollback을 싱행하여
		 	작업단위내의 모든 작업을 취소한다
		 */
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?)");
		
		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname = ? , loc = ? ");
		sql2.append("where deptno = ?");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			// --------------- transaction 시작 ---------------
			// 하나의 논리적인 작업단위 시작
			con = ConnUtil.getConnection();
			// autoCommit기능 비활성화 시킨다.
			con.setAutoCommit(false);
			// ------------ 1번 작업 시작 : 삽입작업 -------------
//			pstmt = con.prepareStatement(sql1.toString());
//			pstmt.setInt(1, 203);
//			pstmt.setString(2, "국어국문학과");
//			pstmt.setInt(3, 200);
//			pstmt.setString(4, "10호관");
//			pstmt.executeUpdate();
			// --------------- 1번 작업 끝 -----------------
			// ------------ 2번 작업 시작 : 수정작업 -------------
			pstmt = con.prepareStatement(sql2.toString());
			pstmt.setString(1, "전자계산학과");
			pstmt.setString(2, "5호관");
			pstmt.setInt(3, 101);
			pstmt.executeUpdate();
			// --------------- 2번 작업 끝 -----------------
			
			//쿼리가 정상적으로 실행된 경우 db에 반영
			con.commit();
			System.out.println("db에 반영됨");
			// transaction 종료
		}
		catch(SQLException e)
		{
			try
			{
				con.rollback();
				System.out.println("db에 반영 취소합니다");
			}
			catch(SQLException e1)
			{
				e1.getStackTrace();
			}
		}
		finally
		{
			try
			{
				if(pstmt != null)
					pstmt.close();
			}
			catch(Exception e) {}
			try
			{
				if(con != null)
					con.close();
			}
			catch(Exception e) {}
		}
	}
}