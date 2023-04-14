package jang12;

public interface RemoteControl 
{
//	상수 ------ 기본 시작
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume); // -------기본 끝
	
	//디폴트 메소드 : jdk8에서 추가
	default void setMute(boolean mute)
	{
		if(mute)
		{
			System.out.println("무음을 처리합니다.");
		}
		else
		{
			System.out.println("무음을 해제합니다.");
		}
	}
	// 정적 메소드 : jdk8에서 추가 : 인터페이스명.메소드();
	static void changeBattery()
	{
		System.out.println("건전지를 교환합니다.");
	}
// jdk 9 이후 추가
	private void method()
	{
		System.out.println("private method()");
//		장점 : 같은 인터페이스에 있는 디폴트 메소드들 끼리 코드를 쉽게 공유할 수 있다는것
//		같은 인터페이스내에 있는 디폴트 메소드나 다른 프라이빗 메소드에 의해서만 호출 가능함.
	}
}
