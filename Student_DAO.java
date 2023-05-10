package jang9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
	DAO (Data Access Object) Ŭ���� - CRUD �ۼ�
	������ó���� �ñ����� �ܰ�. �����Ͻ� �������� ó���� �ڷḦ �޾� �����ͺ��̽��� �Է°� ��ȸ�� �Ѵ�.
	
	VO(value Object) == DTO : �����͸� ��� �����̳� ������ �ϴ� Ŭ����. �������� ������� Ŭ�����̴�.
	VOŬ������ ���ø����̼� �������� �� �ܰ��� ����� ������ �����ϴ� ������ ����. �Ӽ�(attribute) , setter/getter�� �����Ѵ�.
	
	�Ӽ� : VOŬ������ �ԷµǴ� ������ ����
	setter : ������ VOŬ������ ������ �� ���
	getter : VOŬ������ ������ ��ȸ�� �� ���
 */
public class Student_DAO 
{	// JDBC ���� ����
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// STUDENT ���̺� ���� SQL ��ɾ�
	String sel = "select * from student";
	String ins = "insert into student values(?,?,?,?)";
	String upd = "update student set score = ? , subject = ? where no = ?";
	String del = "delete from student where no = ?";
	
	// STUDENT ���̺� ���� CRUD �޼ҵ� -- ����
	public void deleteStudent(String no)
	{
		try
		{
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(del);
			pstmt.setString(1, no);
			pstmt.executeUpdate();
			System.out.println("������");
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
	// ����
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
			System.out.println("�����");
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
			System.out.println("�߰���");
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