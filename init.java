/*
 �����ڿ� �ʱ�ȭ ��
 Ŭ���� ������ �ʱ�ȭ ���� : Ŭ������ ó���ε��ɶ� �� �ѹ� �ʱ�ȭ �ȴ�.
 �ν��Ͻ������� �ʱ�ȭ ���� : �ν��Ͻ��� ������ �� ���� �� �ν��Ͻ����� �ʱ�ȭ�� �̷������
 
 Ŭ���� ������ �ʱ�ȭ ���� : �⺻��(�������ʱ�ȭ) - ����� �ʱ�ȭ - Ŭ�����ʱ�ȭ �� - �ν��Ͻ� �ʱ�ȭ ��
 �ν��Ͻ� ������ �ʱ�ȭ ���� : �⺻��(�������ʱ�ȭ) - ����� �ʱ�ȭ - �ν��Ͻ� �ʱ�ȭ �� - ������

��� )
�����ʱ�ȭ
�ν��Ͻ� �ʱ�ȭ
n : 0 , m : 0 , s : 200
����Ʈ������
ob1.m = 0
ob1.n = 3
n : 3 , m : 0 , s : 200
�ν��Ͻ� �ʱ�ȭ
n : 0 , m : 0 , s : 200
����Ʈ ������
ob1.m = 0
ob1.n = 3
n : 3 , m : 0 , s : 200
 */
package jang12;

public class init {
	int n;
	int m;
	static int  s;
	init()
	{
	//	 n = 1000;
	//	 m = 3000;
		System.out.println("\n����Ʈ ������");
	}
	
	// �ν��Ͻ� �ʱ�ȭ ��
	{ // ���(����/���� : �޼ҵ�,�ʵ�) ���
	//	 s = 300; //static
	// n = 500;
	// m = 300;
	System.out.println("\n�ν��Ͻ� �ʱ�ȭ");
	write(); // ����(�ν��Ͻ�)�޼ҵ�
	write2(); // ����(static)�޼ҵ� o
	this.n = 3; // this o
	}
	
	// �����ʱ�ȭ ��
	static 
	{
		s = 900;
		// n = 500; // error �����ʵ�/�޼ҵ常 �;���
		// m = 300; // error �����ʵ�/�޼ҵ常 �;���
		System.out.println("\n���� �ʱ�ȭ " + s);
	//	write(); // ����(�ν��Ͻ�)�޼ҵ� x
		write2();
	//	this.n = 3; this x
	}
	
	init(int n, int m)
	{
		this.n = n;
		this.m = m;
	}
	
	void write()
	{
		System.out.println("n :" + n +", m : " + m + ", s : " + s);
	}
	
	static void write2() {}
	
	public static void main(String[] args) 
	{
		init ob1 = new init();
		System.out.println("ob1.m = " + ob1.m);
		System.out.println("ob1.n = " + ob1.n);
		ob1.write();
		
		init ob2 = new init();
		System.out.println("ob2.m = " + ob2.m);
		System.out.println("ob2.n = " + ob2.n);
		ob2.write();
	}

}
