package jang12;

public interface RemoteControl 
{
//	��� ------ �⺻ ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume); // -------�⺻ ��
	
	//����Ʈ �޼ҵ� : jdk8���� �߰�
	default void setMute(boolean mute)
	{
		if(mute)
		{
			System.out.println("������ ó���մϴ�.");
		}
		else
		{
			System.out.println("������ �����մϴ�.");
		}
	}
	// ���� �޼ҵ� : jdk8���� �߰� : �������̽���.�޼ҵ�();
	static void changeBattery()
	{
		System.out.println("�������� ��ȯ�մϴ�.");
	}
// jdk 9 ���� �߰�
	private void method()
	{
		System.out.println("private method()");
//		���� : ���� �������̽��� �ִ� ����Ʈ �޼ҵ�� ���� �ڵ带 ���� ������ �� �ִٴ°�
//		���� �������̽����� �ִ� ����Ʈ �޼ҵ峪 �ٸ� �����̺� �޼ҵ忡 ���ؼ��� ȣ�� ������.
	}
}
