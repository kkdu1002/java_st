package jang12;

public class void_int 
{
	static void func1() 
	{
		System.out.println("void�� �޼ҵ�� �����ٰ� ����.");
	}
	static int func2() 
	{
		return 100;
	}
	public static void main(String[] args) 
	{
		int a;
		func1();
		
		a = func2();
		System.out.printf("int�� �޼ҵ� ���� ������ �� == > %d", a);
	}
}