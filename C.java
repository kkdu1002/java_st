package jang12;
import package1.A;

public class C extends A
{
	public C()
	{
		super();
		this.field = "value";
		this.method();
	}
}
/*
	// Error
public class C 
{
	public void method()
	{
		A a = new A();
		a.field = "value";
		a.method();
	}
}
*/