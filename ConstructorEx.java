package jang12;

class A{
	public A()
	{
		this(2);
		System.out.println("����Ʈ ������A" );
	}
	public A(int a)
	{
		System.out.println("�Ű����� ������A : " + a);
	}
}
class B extends A{
	public B()
	{
		this(2);
		System.out.println("����Ʈ ������B");
	}
	public B(int a)
	{
		System.out.println("�Ű����� �ִ� ������B : " + a);
	}
}
class C extends B{
	public C()
	{
		super(2);
		System.out.println("����Ʈ ������C");
	}
	public C(int a)
	{
		System.out.println("�Ű����� �ִ� ������C : " + a);
	}
}
public class ConstructorEx 
{

	public static void main(String[] args) {
		C c,c1;
		c = new C(5);

	}

}
