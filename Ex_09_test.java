package jang9;
// Ŭ���� : �ʵ� + �޼ҵ�()
//��ü �����
public class Ex_09_test 
{	// �ʵ� : �������� , ������ , �Ӽ� , ������� , default �ʱ�ȭ �Ǿ�����
	int a; // ���� ��� ���� : ��ü ������ ��� , new ������ �� ����ؼ� ����
		   // ���� : Ŭ������ ��ü�� = new Ŭ������();
		   //		��ü��.a(o); class��.a; (x)
	static int b; // ������� ���� : ��ü ���� ������ �������.
				  // �̹� �޸� ����. new������ ��� ����		
				  // ���� : class��.b; / ��ü��.b;
	
	// ������ : ����� �ʱ�ȭ , ��ü�� ����
	// �����ڵ� ��ȯ���� ���� �޼ҵ��̴�. Ŭ���� �̸��� �Ȱ��� ��������
	/*
	 	public Ex_09_test() 
	{
		System.out.println("default ������ ȣ��");
	}
	*/
	// �Ϲ� �޼ҵ� ����
	public void disp(int n) 
	{
		System.out.println(n + "��. �ҷ���");
	}
	public static void static_disp() 
	{
		System.out.println("��. �ҷ���");
	}
// main �޼ҵ� ---> ���۴� , main�� �ִ� class�� ������ public ���������ھ� ��.
	public static void main(String[] args) 
	{	// �������� : ������� �ݵ�� �ʱ�ȭ �ؾ��� {}�������� ���
		int su1; // ���������� ������ �ڷ�Ÿ�� ������ = �ʱ�ȭ / ����
		su1 = 20; // �޸� Ȯ�� , �ʱ�ȭ , �޸� �� �Ҵ� == �� �ʱ�ȭ == �� ���� 
		int su2 = 20; // �ڷ�Ÿ�Լ��� , �޸� Ȯ�� , �ʱⰪ ����
		
		
		
		//��ü ���� : non-static : �������� heap���� ����
		Ex_09_test t1 = new Ex_09_test();// jvm�� ����Ʈ�����ڸ� �ְ� ������
		Ex_09_test t2 = new Ex_09_test();
		t2.a = 100;
		t1.a = 20;
		b = 30;
		System.out.println("NON-STATIC t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		
		//static ��� ��� : class��.������� , �޸𸮸� ����(o)
		System.out.println(Ex_09_test.b);
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " +t2.b);
		System.out.println(b); // ���� Ŭ���� �������� ��������� ��� ����
		
		//�޼ҵ� ȣ��
		t1.disp(3);
		static_disp();
	}
}