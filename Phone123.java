package jang12;

public abstract class Phone123 
{
	// �ʵ� , ������ , �Ϲݸ޼ҵ� , �߻�޼ҵ� ��� �� �� �ִ�.
	public String owner;
//	�����ڴ� �ڽ��� ��ӹ޾� ��ü ������ �ڽ��� �����ڳ����� super()�����ڸ� ȣ��
//	�ϰԵǾ� �߻� Ŭ������ ��ü�� �����Ѵ�.
	public Phone123(String owner)
	{
		this.owner = owner;
	}
	
	public void turnOn()
	{
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff()
	{
		System.out.println("�� ������ ���ϴ�.");
	}
}
