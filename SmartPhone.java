package jang12;

public class SmartPhone extends PDA implements MobilePhone,MP3
{
	@Override
	public void play() 
	{
		System.out.println("음악 재생하기");
	}

	@Override
	public void stop() 
	{
		System.out.println("음악 중지하기");
	}

	@Override
	public boolean sendCall() 
	{
		System.out.println("전화하기");
		return true;
	}

	@Override
	public boolean receiveCall() 
	{
		System.out.println("전화받기");
		return true;
	}

	@Override
	public boolean sendSMS() 
	{
		System.out.println("문자 보내기");
		return true;
	}

	@Override
	public boolean receiveSMS() 
	{
		System.out.println("문자 받기");
		return true;
	}
	@Override
	public int calculator(int x , int y) 
	{
		return x + y;
	}
	
	// 메소드 추가
	
	public void schedular() 
	{
		System.out.println("일정관리");
	}
	public void application()
	{
		System.out.println("응용프로그램 설치 / 삭제");
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