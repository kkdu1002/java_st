package jang9;
// 클래스 : 필드 + 메소드()
//객체 만들기
public class Ex_09_test 
{	// 필드 : 전역변수 , 데이터 , 속성 , 멤버변수 , default 초기화 되어있음
	int a; // 동적 멤버 변수 : 객체 생성후 사용 , new 연산자 꼭 사용해서 접근
		   // 접근 : 클래스명 객체명 = new 클래스명();
		   //		객체명.a(o); class명.a; (x)
	static int b; // 정적멤버 변수 : 객체 생성 유무와 관계없다.
				  // 이미 메모리 있음. new연산자 사용 무관		
				  // 접근 : class명.b; / 객체명.b;
	
	// 생성자 : 멤버를 초기화 , 객체를 생성
	// 생성자도 반환형이 없는 메소드이다. 클래스 이름과 똑같이 만들어야함
	/*
	 	public Ex_09_test() 
	{
		System.out.println("default 생성자 호출");
	}
	*/
	// 일반 메소드 정의
	public void disp(int n) 
	{
		System.out.println(n + "나. 불렀니");
	}
	public static void static_disp() 
	{
		System.out.println("나. 불렀니");
	}
// main 메소드 ---> 시작단 , main이 있는 class는 무조건 public 접근지정자야 함.
	public static void main(String[] args) 
	{	// 지역변수 : 사용전에 반드시 초기화 해야함 {}내에서만 사용
		int su1; // 접근지정자 지정자 자료타입 변수명 = 초기화 / 선언
		su1 = 20; // 메모리 확보 , 초기화 , 메모리 값 할당 == 값 초기화 == 값 설정 
		int su2 = 20; // 자료타입선언 , 메모리 확보 , 초기값 설정
		
		
		
		//객체 생성 : non-static : 공적생성 heap영역 차지
		Ex_09_test t1 = new Ex_09_test();// jvm이 디폴트생성자를 넣고 실행함
		Ex_09_test t2 = new Ex_09_test();
		t2.a = 100;
		t1.a = 20;
		b = 30;
		System.out.println("NON-STATIC t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		
		//static 멤버 사용 : class명.멤버변수 , 메모리를 공유(o)
		System.out.println(Ex_09_test.b);
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " +t2.b);
		System.out.println(b); // 같은 클래스 내에서는 멤버변수만 사용 가능
		
		//메소드 호출
		t1.disp(3);
		static_disp();
	}
}