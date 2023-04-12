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
			System.out.println("jee는 student 타입");
		if(jee instanceof Researcher3)
			System.out.println("jee는 Researcher 타입");
		if(kim instanceof Student3)
			System.out.println("kim는 student 타입");
		if(kim instanceof Professor3)
			System.out.println("kim는 Professor 타입");
		if(kim instanceof Researcher3)
			System.out.println("kim는 Researcher 타입");
		if(kim instanceof Person3)
			System.out.println("kim는 Person 타입");
		if(lee instanceof Professor3)
			System.out.println("lee는 Professor 타입");
		if("java" instanceof String)
			System.out.println("\"java\"는 String 타입");
		
//		Person3 jee = new Student3;
//		Person3 kim = new Professor3;
//		Person3 lee = new Researcher3;
			// 다행성
		aa(jee); // Person3 = jee(jee = new Student3());과 같다
		aa(kim);
		aa(lee);
	}; // main
	public static void aa(Person3 p) //부모타입으로 객체를 받아옴
	{ 
		if(p instanceof Student3)
		{
			System.out.println("p는 Studnet3타입");
			Student3 s = (Student3)p; // 다운 캐스팅
		}
		else if(p instanceof Professor3)
		{
			System.out.println("p는 Professor3타입");
			Professor3 s = (Professor3)p;
		}
		else
		{
			System.out.println("p는 Researcher타입");
			Researcher3 s = (Researcher3)p;
		}
	}
}