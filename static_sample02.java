package jang12;

class StaticSamples
{
	public int n;
	// non static�޼ҵ� �������� ����ʵ� ��� ���ٰ���
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
	// static�޼ҵ� �������� static ��� �ʵ常 ���ٰ��� , this ���Ұ�
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
		System.out.println("ȣ�� �� : " + s1.m); // 10
		
		System.out.println(s1.m);
		s1.f();
		StaticSamples.f();
		System.out.println("ȣ�� �� : " + s1.m); // 5
	}

}
