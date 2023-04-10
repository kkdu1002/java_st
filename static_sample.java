package jang12;

class StaticSample
{
	public int n;
	public void g() 
	{
		m = 20;
	}
	public void h() 
	{
		m = 30;
	}
	public static int m;
	public static void f() 
	{
		m = 5;
	}
}

public class static_sample 
{
	public static void main(String[] args) 
	{
		StaticSample s1 , s2;
		s1 = new StaticSample();
		System.out.println("s1.n : " + s1.n);
		System.out.println("s1.m : " + s1.m);
		
		s1.n = 5;
		s1.g();
		s1.m = 50;
		
		System.out.println("\n\ns1.n : " + s1.n);
		System.out.println("s1.m : " + s1.m);
		
		s2 = new StaticSample();
		System.out.println("\ns2.n : " + s2.n);
		System.out.println("s2.m : " + s2.m);
		s2.n = 8;
		s2.h();
		s2.f();
		System.out.println("\ns2.n : " + s2.n);
		System.out.println("s1.n : " + s1.n);
		System.out.println("\ns2.m : " + s2.m);
		System.out.println("s1.m : " + s1.m);
	}

}
