package jang12;
class Person3{}
class Student3 extends Person3{}
class Researcher3 extends Person3{}
class Professor3 extends Researcher3{}
public class Instanceof 
	{
	public static void main(String[] args) 
	{
		Person3 jee = new Student3();
		Person3 kim = new Professor3();
		Person3 lee = new Researcher3();
		if(jee instanceof Student3)
			System.out.println("jee�� student Ÿ��");
		if(jee instanceof Researcher3)
			System.out.println("jee�� Researcher Ÿ��");
		if(kim instanceof Student3)
			System.out.println("kim�� student Ÿ��");
		if(kim instanceof Professor3)
			System.out.println("kim�� Professor Ÿ��");
		if(kim instanceof Researcher3)
			System.out.println("kim�� Researcher Ÿ��");
		if(kim instanceof Person3)
			System.out.println("kim�� Person Ÿ��");
		if(lee instanceof Professor3)
			System.out.println("lee�� Professor Ÿ��");
		if("java" instanceof String)
			System.out.println("\"java\"�� String Ÿ��");
		
//		Person3 jee = new Student3;
//		Person3 kim = new Professor3;
//		Person3 lee = new Researcher3;
			// ���༺
		aa(jee); // Person3 = jee(jee = new Student3());�� ����
		aa(kim);
		aa(lee);
	}; // main
	public static void aa(Person3 p) //�θ�Ÿ������ ��ü�� �޾ƿ�
	{ 
		if(p instanceof Student3)
		{
			System.out.println("p�� Studnet3Ÿ��");
			Student3 s = (Student3)p; // �ٿ� ĳ����
		}
		else if(p instanceof Professor3)
		{
			System.out.println("p�� Professor3Ÿ��");
			Professor3 s = (Professor3)p;
		}
		else
		{
			System.out.println("p�� ResearcherŸ��");
			Researcher3 s = (Researcher3)p;
		}
	}
}