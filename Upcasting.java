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
		super(name); // 부모생성자 호출
	}
}
public class Upcasting 
{
	public static void main(String[] args) 
	{
		Person2 p;
		Student2 s = new Student2("이재문");
		// 부모타입을 하면 자식의 멤버들을 사용 할 수 없음
		// 다향성을 지원하기 위해 업캐스팅함
		p = s; // 업캐스팅 , 자동캐스팅 , 부모타입 = 자식타입 , 다형성때문에 업캐스팅함 , 상속관계일떄
		System.out.println(p.name);

		// 부모객체는 부모가 가지고있는 요소만 접근가능
//		p.grade = "A";
//		p.department = "Com";
		
		// 자식의 특성들을 사용하기 위해 다시 다운 캐스팅을 함
		s = (Student2)p; // 다운캐스팅 , 강제형변환 , 명시적형변환 , 자식타입 = (자식타입)부모객체
		
		s.grade = "1학년";
		s.department = "컴퓨터학과";
		System.out.println("학년 : " + s.grade);
		System.out.println("과 : " + s.department);
		System.out.println("이름 : " + s.name);
	}

}
