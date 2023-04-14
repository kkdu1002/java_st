package jang12;

public class RemoteControl_Ex 
{
	public static void main(String[] args) 
	{
		/*
		RemoteControl rc;
		rc = new Television();
		*/
		// 일회용 객체
		RemoteControl rc = new RemoteControl() 
		{	// 
			public void turnOn() {System.out.println("익명");}
			public void turnOff() {/*실행문*/
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
		// 디폴트
		rc.setMute(false);
		rc.turnOff();
		
		// 정적메소드 호출
		RemoteControl.changeBattery();
	}
}
