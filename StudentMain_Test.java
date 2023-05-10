package jang9;

import java.util.List;

public class StudentMain_Test 
{
	public static void main(String[] args) 
	{
		// 1.DAO select, insert , update , delete(DML) , CRUD
		Student_DAO dao = new Student_DAO();
		
		// 2. VO
		StudentVO vo = new StudentVO();
		
		// 3. 삽입
//		vo.setNo("00008"); // --- 레코드 시작
//		vo.setName("홍길");
//		vo.setScore(31);
//		vo.setSubject("컴퓨터학과"); // --- 레코드 끝
		
		// DB에 넣기
//		dao.insertStudent(vo);
		
		
		// 5. 삭제
		dao.deleteStudent("00003");
		// 4. 수정
		/*
		vo.setSubject("심리");
		vo.setNo("00008");
		vo.setScore(31);
		dao.updateStudent(vo);
		*/
		 
		/*
		// 4. 조회
		
		List<StudentVO> list = dao.getStudentList();
		System.out.println("학번\t이름\t점수\t학과");
		System.out.println("-------------------------------------");
		for(StudentVO svo : list)
		{
			System.out.println(svo.getNo() + "\t" + svo.getName() + "\t" +
								svo.getScore() + "\t" + svo.getSubject());
		}
		*/
	}
}