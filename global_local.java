package jang12;

public class global_local 
{
	static int a = 100; // Ŭ���� ���� ������� : �̹� �޸𸮰� ����
	int b = 500; // Ŭ���� ���� ������� = �ν��Ͻ� ���� : new �����ڷ� �޸� ������ ��밡��
	// ��������޼ҵ� : �̹� �޸𸮰� ����
	static void func1() // �޼ҵ��� ���� = ������Ÿ�� = �޼ҵ� ����
	{
		int a = 200;
		System.out.printf("func1()���� a�� �� ==> %d\n",a);
	}
	// ���� ��� �޼ҵ� : �޸� ���� , new �����ڷ� �޸� ������ ��밡��
	void func2() // �޼ҵ��� ���� = ������Ÿ�� = �޼ҵ� ����
	{
		int a = 200;
		System.out.printf("func2()���� a�� �� ==> %d\n",a);
		return;
	}
	
	public static void main(String[] args) 
	{
		global_local num2 = new global_local();
		num2.b = 1000;
		num2.func2();
		
		func1(); // �޼ҵ� ȣ�� , �޼ҵ� ���
		System.out.printf("main()������ a�� �� == > %d\n", a);
	}
}