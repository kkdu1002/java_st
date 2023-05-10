package jang9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
	DAO (Data Access Object) 클래스 - CRUD 작성
	데이터처리의 궁극적인 단계. 비지니스 로직에서 처리된 자료를 받아 데이터베이스에 입력과 조회를 한다.
	
	VO(value Object) == DTO : 데이터를 담는 컨테이너 역할을 하는 클래스. 목적으로 만들어진 클래스이다.
	VO클래스는 어플리케이션 구조에서 각 단계의 입출력 정보를 전달하는 역할을 수행. 속성(attribute) , setter/getter로 구분한다.
	
	속성 : VO클래스에 입력되는 정보를 저장
	setter : 정보를 VO클래스에 저장할 때 사용
	getter : VO클래스의 정보를 조회할 때 사용
 */
public class Student_DAO 
{	// JDBC 관련 변수
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// STUDENT 테이블 관련 SQL 명령어
	String sel = "select * from student";
	String ins = "insert into student values(?,?,?,?)";
	String upd = "update student set score = ? , subject = ? where no = ?";
	String del = "delete from student where no = ?";
	
	// STUDENT 테이블 관련 CRUD 메소드 -- 삭제
	public void deleteStudent(String no)
	{
		try
		{
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(del);
			pstmt.setString(1, no);
			pstmt.executeUpdate();
			System.out.println("삭제됨");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			ConnUtil.close(pstmt, conn, null);
		}
	}
	// 수정
	public void updateStudent(StudentVO vo)
	{
		try
		{
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(upd);
			pstmt.setInt(1, vo.getScore());
			pstmt.setString(2, vo.getSubject());
			pstmt.setString(3, vo.getNo());
			pstmt.executeUpdate();
			System.out.println("변경됨");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			ConnUtil.close(pstmt, conn, null);
		}
	}
	public void insertStudent(StudentVO vo)
	{
		try
		{
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(ins);
			pstmt.setString(1, vo.getNo());
			pstmt.setString(2, vo.getName());
			pstmt.setInt(3, vo.getScore());
			pstmt.setString(4, vo.getSubject());
			pstmt.executeUpdate();
			System.out.println("추가됨");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			ConnUtil.close(pstmt, conn, null);
		}
	}
	public List<StudentVO> getStudentList()
	{
		List<StudentVO> studentList = new ArrayList<StudentVO>();
		try
		{
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sel);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				StudentVO student = new StudentVO();
				student.setNo(rs.getString("no"));
				student.setName(rs.getString("name"));
				student.setScore(rs.getInt("score"));
				student.setSubject(rs.getString("subject"));
				studentList.add(student);
				System.out.println(studentList.toString());
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			ConnUtil.close(pstmt, conn, rs);
		}
		System.out.println();
		return studentList;
	}
}