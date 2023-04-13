package jang12;

public class Child_Ex 
{
	public static void main(String[] args) 
	{
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		
//		parent.method3(); // 부모 멤버만 접근 가능
		Child child2 = (Child) parent; // 다운 캐스팅
		child2.method3();
	}
}