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
		
		// 3. ����
//		vo.setNo("00008"); // --- ���ڵ� ����
//		vo.setName("ȫ��");
//		vo.setScore(31);
//		vo.setSubject("��ǻ���а�"); // --- ���ڵ� ��
		
		// DB�� �ֱ�
//		dao.insertStudent(vo);
		
		
		// 5. ����
		dao.deleteStudent("00003");
		// 4. ����
		/*
		vo.setSubject("�ɸ�");
		vo.setNo("00008");
		vo.setScore(31);
		dao.updateStudent(vo);
		*/
		 
		/*
		// 4. ��ȸ
		
		List<StudentVO> list = dao.getStudentList();
		System.out.println("�й�\t�̸�\t����\t�а�");
		System.out.println("-------------------------------------");
		for(StudentVO svo : list)
		{
			System.out.println(svo.getNo() + "\t" + svo.getName() + "\t" +
								svo.getScore() + "\t" + svo.getSubject());
		}
		*/
	}
}