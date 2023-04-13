package jang12;

public class KumhoTire extends Tire
{
	public KumhoTire(String location, int maxRotation) 
	{
		super(location, maxRotation);
	}
	@Override
	public boolean roll()
	{
		++accumulatedRotation;
		if(maxRotation > accumulatedRotation)
		{
			System.out.println(location + "KumhoTire 남은 회전수 : " + (maxRotation - accumulatedRotation));
			return true;
		}
		else
		{
			System.out.println(location + "KumhoTire 타이어 펑크");
			return false;
		}
	}
}
