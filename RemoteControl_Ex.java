package jang12;

public class RemoteControl_Ex 
{
	public static void main(String[] args) 
	{
		/*
		RemoteControl rc;
		rc = new Television();
		*/
		// ��ȸ�� ��ü
		RemoteControl rc = new RemoteControl() 
		{	// 
			public void turnOn() {System.out.println("�͸�");}
			public void turnOff() {/*���๮*/
			}
			public void setVolume(int volume) {};
		};
		
		rc.turnOn();
		rc.setVolume(rc.MAX_VOLUME);
		rc.setMute(true);
		rc.turnOff();
		
		System.out.println("------------------");
		
//		rc = new Audio();
		rc.turnOn();
		rc.setVolume(13);
		// ����Ʈ
		rc.setMute(false);
		rc.turnOff();
		
		// �����޼ҵ� ȣ��
		RemoteControl.changeBattery();
	}
}
