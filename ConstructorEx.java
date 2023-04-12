package jang12;

class A{
	public A()
	{
		this(2);
		System.out.println("디폴트 생성자A" );
	}
	public A(int a)
	{
		System.out.println("매개변수 생성자A : " + a);
	}
}
class B extends A{
	public B()
	{
		this(2);
		System.out.println("디폴트 생성자B");
	}
	public B(int a)
	{
		System.out.println("매개변수 있는 생성자B : " + a);
	}
}
class C extends B{
	public C()
	{
		super(2);
		System.out.println("디폴트 생성자C");
	}
	public C(int a)
	{
		System.out.println("매개변수 있는 생성자C : " + a);
	}
}
public class ConstructorEx 
{

	public static void main(String[] args) {
		C c,c1;
		c = new C(5);

	}

}
