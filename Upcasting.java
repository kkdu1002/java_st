package jang12;
class Person2
{
	String name;
	String id;
	
	public Person2(String name)
	{
		this.name = name;
	}
}
class Student2 extends Person2
{
	String grade;
	String department;
	
	public Student2(String name)
	{
		super(name); // �θ������ ȣ��
	}
}
public class Upcasting 
{
	public static void main(String[] args) 
	{
		Person2 p;
		Student2 s = new Student2("���繮");
		// �θ�Ÿ���� �ϸ� �ڽ��� ������� ��� �� �� ����
		// ���⼺�� �����ϱ� ���� ��ĳ������
		p = s; // ��ĳ���� , �ڵ�ĳ���� , �θ�Ÿ�� = �ڽ�Ÿ�� , ������������ ��ĳ������ , ��Ӱ����ϋ�
		System.out.println(p.name);

		// �θ�ü�� �θ� �������ִ� ��Ҹ� ���ٰ���
//		p.grade = "A";
//		p.department = "Com";
		
		// �ڽ��� Ư������ ����ϱ� ���� �ٽ� �ٿ� ĳ������ ��
		s = (Student2)p; // �ٿ�ĳ���� , ��������ȯ , ���������ȯ , �ڽ�Ÿ�� = (�ڽ�Ÿ��)�θ�ü
		
		s.grade = "1�г�";
		s.department = "��ǻ���а�";
		System.out.println("�г� : " + s.grade);
		System.out.println("�� : " + s.department);
		System.out.println("�̸� : " + s.name);
	}

}
