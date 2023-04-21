package jang12;
/*
	static Memberclass : �ܺ�Ŭ������ ������� ������ġ�� ����
	�ܺ� Ŭ������ static��� Ư�� static�޼ҵ忡�� ���� �������� ����ȴ�
 */
public class StaticMember 
{
	int aa = 10; // ��ü����� ���� ���ٺҰ�
	private int b = 10; // ��ü����� ���� ���ٺҰ�
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
//		��� ������ �ʵ�� �޼ҵ� ���𰡴�
//		�ܺ�Ŭ������ ����ν��Ͻ��� �����ϱ� ���� ��ü ����
		StaticMember s = new StaticMember();
		int d = 100;
		static int a = 20;
		
		public void printData()
		{
//			non static error
//			��ü ������ ���ٰ���
			System.out.println("int a = " +s.aa + "," + a);
			System.out.println("private int b = " +s.b); // �Ǵ� s.getB();
			System.out.println("int d = " + d);
			sMethode(); //�ܺ�Ŭ������ static�޼ҵ�
			s.Methode(); // ��ü������ ���ٰ���
		}
	}
	static void sMethode()
	{
		System.out.println("static�޼ҵ�...");
	}
	static void Methode()
	{
		System.out.println("non-static�޼ҵ�...");
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