package jang12;

class StaticSamples
{
	public int n;
	// non static메소드 내에서는 멤버필드 모두 접근가능
	public void g() 
	{
//		n = 3; (o)
		m = 20;
	}
	public void h() 
	{
		m = 30;
	}
	public static int m;
	// static메소드 내에서는 static 멤버 필드만 접근가능 , this 사용불가
	public static void f() 
	{
//		n = 3; (x)	this.m = 2; (x)
		m = 5;
	}
}

public class static_sample02 
{
	public static void main(String[] args) 
	{
		StaticSamples.m = 10;
		StaticSamples s1;
		s1 = new StaticSamples();
		System.out.println("호출 전 : " + s1.m); // 10
		
		System.out.println(s1.m);
		s1.f();
		StaticSamples.f();
		System.out.println("호출 후 : " + s1.m); // 5
	}

}
