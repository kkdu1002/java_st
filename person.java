package jang12;

public class person 
{
	// 필드 = 데이터 = 멤버변수 = 전역변수 = 클래스변수 = 소것ㅇ : 명사 , 형사
	// 멤버변수 : 1. static(x) : 인스턴스멤버변수 : 꼭 객체생성(new)후 사용 , 메모리가 없음
	//		   2. static(o) : 클래스 멤버변수 : 객체생성없이 사용 ,  이미 메모리가 있음
	public String name; // null 묵시적 초기화 // public String name = "" , 명시적 초기화
	private int age;
	// 생성자 , 인자가 없는 생성자를 기본생정자
	// 생성자 : 리턴형이 없는 메소드이며 , 기본이 public, 목적 : 객체생성, 멤버변수 초기화
	// 디폴트 생성자 : person 객체명 = new person(); //했을때 자동 호출됨
	// 디폴트 생성자가 없으면 jvm이 자동으로 넣어줌, (단, 또다른 생성자가 없을떄 자동으로 넣어줌)
	//또다른 생성자를 호출하고, 디폴트 생성자를 호출할 때 디폴트를 jvm이 자동으로 넣어주지 않기
	//때문에 꼭 넣어 주어야 한다. 상속 x
	public person()  // 기본 생성자 person객체명 = new person();
	{
		System.out.println("기본 생성자 호출");
	}
	// overloading 메소드 중복 : x 메소드명(순서 / 타입 / 개수가 달라야한다.){}
	public person(String s) // person객체명 = new person("홍길동");
	{
		name = s;
		System.out.println("인자값이 있는 생성자 호출");
	}
	// getter() : 읽기, setter() : 저장
	public String getName()  //인출 String n = aperson.getName();
	{
		return name;
	}
	public void setName(String name)  //저장 aperson.setName("홍길동");
	{
		this.name = name; // 현재 객체 자신 == this
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) 
	{
		//객체 자신
		this.age = age; // 현쟈객채애 age에 값을 저장
	}
	public static void main(String[] args) 
	{
		person aperson; // 객체 선언
		//생성자를 통해 name값 초기화
		aperson = new person("김미남"); // 객체 생성

		//필드를 통해서 초기화
		aperson.age = 30; // 필드값(직접 접근) 초기화 = 설정 = 저장
		int i = aperson.age; // 필드값(직접 접근) 얻어오기 = 인출
		
		//메소드를 통해서 초기화
		aperson.setName("홍길동"); // 필드값 메소드(간접접근)을 이용해 저장하기
		
		String s = aperson.getName();
		
		System.out.println("이름 : " + s);
		System.out.println("나이 : " + i);
		
		person aperson2 = new person("----");
		aperson2.age = 27;
		System.out.println("직접접근");
		System.out.println("이름 : " + aperson2.name);
		System.out.printf("나이 : %d\n",aperson2.age);
		
		aperson2.setName("----");
		aperson2.setAge(23);
		System.out.println("간접접근");
		System.out.println("이름 : " + aperson2.name);
		System.out.printf("나이 : %d",aperson2.age);
	}
}