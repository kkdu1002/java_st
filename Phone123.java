package jang12;

public abstract class Phone123 
{
	// 필드 , 생성자 , 일반메소드 , 추상메소드 모두 올 수 있다.
	public String owner;
//	생성자는 자식이 상속받아 객체 생성시 자식의 생성자내에서 super()생성자를 호출
//	하게되어 추상 클래스도 객체를 생성한다.
	public Phone123(String owner)
	{
		this.owner = owner;
	}
	
	public void turnOn()
	{
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("폰 전원을 끕니다.");
	}
}
