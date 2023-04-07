package jang12;

class Myint
{
	int a;
}
// call by reference == call by address : 주소 전달 방식 : 참조형에 해당함
// 호출하고 처리한 후에 기억장소 변화 있다.
public class address 
{
	static void func1(Myint m) // 실인자 (parameter)
	{
		m.a = m.a + 1;
		System.out.printf("전달받은 a ==> %d\n", m.a);
	}
	public static void main(String[] args) 
	{
		Myint m = new Myint();
		m.a = 10;
		
		func1(m); //형식인자(argument)
		System.out.printf("실행 후의 a ==> %d\n", m.a);
	}
}