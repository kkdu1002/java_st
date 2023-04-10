package jang12;
// class에 final : 상속불가
public
//final 
class use_final // 부모
{
	String name = "홍길동"; //String final name = "홍길동"; 붙이면 재할당 불가 , 반드시 사용전에 초기화 해야함
	public void disp() 
	{
		System.out.println("출력 ");
	}
	public 
	//final 
	void disp2() 
	{
		System.out.println("출력2 ");
	}
}

class DerivedClass extends use_final // 자식
{	
	//@Override // 컴파일러가 이해하는 주석
	DerivedClass d = new DerivedClass();

	public void disp() 
	{
		System.out.println("재정의 출력");
		d.name = "홍길순"; // 재할당 o
	}
	
	@Override // 컴파일러가 이해하는 주석
	public void disp2()  // 메소드 재정의 불가
	{
		System.out.println("재정의 출력");
	}
}
