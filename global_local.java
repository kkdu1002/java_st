package jang12;

public class global_local 
{
	static int a = 100; // 클래스 정적 멤버변수 : 이미 메모리가 있음
	int b = 500; // 클래스 동적 멤버변수 = 인스턴스 변수 : new 연산자로 메모리 생성후 사용가능
	// 정적멤버메소드 : 이미 메모리가 있음
	static void func1() // 메소드의 정의 = 프로토타입 = 메소드 원형
	{
		int a = 200;
		System.out.printf("func1()에서 a의 값 ==> %d\n",a);
	}
	// 동적 멤버 메소드 : 메모리 없음 , new 연산자로 메모리 생성후 사용가능
	void func2() // 메소드의 정의 = 프로토타입 = 메소드 원형
	{
		int a = 200;
		System.out.printf("func2()에서 a의 값 ==> %d\n",a);
		return;
	}
	
	public static void main(String[] args) 
	{
		global_local num2 = new global_local();
		num2.b = 1000;
		num2.func2();
		
		func1(); // 메소드 호출 , 메소드 사용
		System.out.printf("main()에서의 a의 값 == > %d\n", a);
	}
}