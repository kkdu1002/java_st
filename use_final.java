package jang12;
// class�� final : ��ӺҰ�
public
//final 
class use_final // �θ�
{
	String name = "ȫ�浿"; //String final name = "ȫ�浿"; ���̸� ���Ҵ� �Ұ� , �ݵ�� ������� �ʱ�ȭ �ؾ���
	public void disp() 
	{
		System.out.println("��� ");
	}
	public 
	//final 
	void disp2() 
	{
		System.out.println("���2 ");
	}
}

class DerivedClass extends use_final // �ڽ�
{	
	//@Override // �����Ϸ��� �����ϴ� �ּ�
	DerivedClass d = new DerivedClass();

	public void disp() 
	{
		System.out.println("������ ���");
		d.name = "ȫ���"; // ���Ҵ� o
	}
	
	@Override // �����Ϸ��� �����ϴ� �ּ�
	public void disp2()  // �޼ҵ� ������ �Ұ�
	{
		System.out.println("������ ���");
	}
}
