package jang12;

public class SmartPhone extends PDA implements MobilePhone,MP3
{
	@Override
	public void play() 
	{
		System.out.println("���� ����ϱ�");
	}

	@Override
	public void stop() 
	{
		System.out.println("���� �����ϱ�");
	}

	@Override
	public boolean sendCall() 
	{
		System.out.println("��ȭ�ϱ�");
		return true;
	}

	@Override
	public boolean receiveCall() 
	{
		System.out.println("��ȭ�ޱ�");
		return true;
	}

	@Override
	public boolean sendSMS() 
	{
		System.out.println("���� ������");
		return true;
	}

	@Override
	public boolean receiveSMS() 
	{
		System.out.println("���� �ޱ�");
		return true;
	}
	@Override
	public int calculator(int x , int y) 
	{
		return x + y;
	}
	
	// �޼ҵ� �߰�
	
	public void schedular() 
	{
		System.out.println("��������");
	}
	public void application()
	{
		System.out.println("�������α׷� ��ġ / ����");
	}
	public static void main(String[] args) 
	{
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculator(10, 20));
		p.schedular();
		p.application();
		p.stop();
	}
}