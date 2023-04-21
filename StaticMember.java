package jang12;
/*
	static Memberclass : 외부클래스의 멤버변수 선언위치에 선언
	외부 클래스의 static멤버 특히 static메소드에서 사용될 목적으로 선언된다
 */
public class StaticMember 
{
	int aa = 10; // 객체만들기 전에 접근불가
	private int b = 10; // 객체만들기 전에 접근불가
	static int c = 200;
	
	public int getB()
	{
		return b;
	}
	public void setB(int b)
	{
		this.b = b;
	}
	static class Inner
	{
//		모든 종류의 필드와 메소드 선언가능
//		외부클래스의 멤버인스턴스를 접근하기 위해 객체 생성
		StaticMember s = new StaticMember();
		int d = 100;
		static int a = 20;
		
		public void printData()
		{
//			non static error
//			객체 생성후 접근가능
			System.out.println("int a = " +s.aa + "," + a);
			System.out.println("private int b = " +s.b); // 또는 s.getB();
			System.out.println("int d = " + d);
			sMethode(); //외부클래스에 static메소드
			s.Methode(); // 객체생성후 접근가능
		}
	}
	static void sMethode()
	{
		System.out.println("static메소드...");
	}
	static void Methode()
	{
		System.out.println("non-static메소드...");
	}
	public static void main(String[] args) 
	{
		StaticMember.Inner inner = new StaticMember.Inner();
		inner.printData();
		
		System.out.println("--------------------");
		Inner in = new Inner();
		in.printData();
	}
}