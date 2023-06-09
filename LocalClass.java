package jang12;
/*
	3. Local class : 외부클래스의 메서드나 초기화블럭 안에 선언하여, 선언된 영역 내부에서만 사용 될 수 있다.
 */
public class LocalClass 
{
	int a = 100;
//	메소드 정의
	public void innerTest(int k)
	{
//		final 생략가능(JDK1.8부터 가능해짐 , 이전버전은 꼭 final써야함)
		int b = 200; // == final int b = 200;
		final int c = k;
		
//		내부 로컬 클래스 선언
		class localInner
		{
//			상수, 전역변수
//			내부 클래스를 포함한 메소드내에 정의된 지역변수 접근
			public void getData()
			{
				System.out.println("int a = " + a);
				System.out.println("int b = " + b); // 재할당 불가
				System.out.println("final int c = " + c);
				System.out.println("method = " + method());
			}	
		};
		localInner i = new localInner(); // 로컬의 메소드 접근 위해 생성
		i.getData();
		
	}
	public int method()
	{
		int m = 2;
		return m;
	}
	public static void main(String[] args) 
	{
		LocalClass outer = new LocalClass(); // 외부클래스 객체생성
		outer.innerTest(1000); // 외부클래스 메소드 호출
		
	}
}