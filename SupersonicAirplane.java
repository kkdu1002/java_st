package jang12;

public class SupersonicAirplane extends Airplane
{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	public void fly()
	{
		if(flyMode == SUPERSONIC)
		{
			System.out.println("초음속 비행합니다.");
		}
		else
		{
		// Airplane객체의 fly() 메소드 호출
			super.fly();
		}
	}
}