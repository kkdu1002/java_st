package jang12;

public class person 
{
	// �ʵ� = ������ = ������� = �������� = Ŭ�������� = �Ұͤ� : ��� , ����
	// ������� : 1. static(x) : �ν��Ͻ�������� : �� ��ü����(new)�� ��� , �޸𸮰� ����
	//		   2. static(o) : Ŭ���� ������� : ��ü�������� ��� ,  �̹� �޸𸮰� ����
	public String name; // null ������ �ʱ�ȭ // public String name = "" , ����� �ʱ�ȭ
	private int age;
	// ������ , ���ڰ� ���� �����ڸ� �⺻������
	// ������ : �������� ���� �޼ҵ��̸� , �⺻�� public, ���� : ��ü����, ������� �ʱ�ȭ
	// ����Ʈ ������ : person ��ü�� = new person(); //������ �ڵ� ȣ���
	// ����Ʈ �����ڰ� ������ jvm�� �ڵ����� �־���, (��, �Ǵٸ� �����ڰ� ������ �ڵ����� �־���)
	//�Ǵٸ� �����ڸ� ȣ���ϰ�, ����Ʈ �����ڸ� ȣ���� �� ����Ʈ�� jvm�� �ڵ����� �־����� �ʱ�
	//������ �� �־� �־�� �Ѵ�. ��� x
	public person()  // �⺻ ������ person��ü�� = new person();
	{
		System.out.println("�⺻ ������ ȣ��");
	}
	// overloading �޼ҵ� �ߺ� : x �޼ҵ��(���� / Ÿ�� / ������ �޶���Ѵ�.){}
	public person(String s) // person��ü�� = new person("ȫ�浿");
	{
		name = s;
		System.out.println("���ڰ��� �ִ� ������ ȣ��");
	}
	// getter() : �б�, setter() : ����
	public String getName()  //���� String n = aperson.getName();
	{
		return name;
	}
	public void setName(String name)  //���� aperson.setName("ȫ�浿");
	{
		this.name = name; // ���� ��ü �ڽ� == this
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) 
	{
		//��ü �ڽ�
		this.age = age; // ����ä�� age�� ���� ����
	}
	public static void main(String[] args) 
	{
		person aperson; // ��ü ����
		//�����ڸ� ���� name�� �ʱ�ȭ
		aperson = new person("��̳�"); // ��ü ����

		//�ʵ带 ���ؼ� �ʱ�ȭ
		aperson.age = 30; // �ʵ尪(���� ����) �ʱ�ȭ = ���� = ����
		int i = aperson.age; // �ʵ尪(���� ����) ������ = ����
		
		//�޼ҵ带 ���ؼ� �ʱ�ȭ
		aperson.setName("ȫ�浿"); // �ʵ尪 �޼ҵ�(��������)�� �̿��� �����ϱ�
		
		String s = aperson.getName();
		
		System.out.println("�̸� : " + s);
		System.out.println("���� : " + i);
		
		person aperson2 = new person("----");
		aperson2.age = 27;
		System.out.println("��������");
		System.out.println("�̸� : " + aperson2.name);
		System.out.printf("���� : %d\n",aperson2.age);
		
		aperson2.setName("----");
		aperson2.setAge(23);
		System.out.println("��������");
		System.out.println("�̸� : " + aperson2.name);
		System.out.printf("���� : %d",aperson2.age);
	}
}