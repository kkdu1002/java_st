package jang12;

public class call_by_value 
{
	static void func1(int a)
	{
		a = a + 1;
		System.out.printf("전달받은 a ==> %d\n", a);
	}
	public static void main(String[] args) 
	{
		int a = 10;
		
		func1(a); // call by value : 값 전달 방식, 값만 복사해서 처리하기 때문에 원래 변수에 값의 변화가 없음
		//기본형은 모두 값 전달 방식이다.
		System.out.printf("func1() 실행 후의 a ==> %d\n", a);
	}
}