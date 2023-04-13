package jang12;

public class HankookTire extends Tire
{
	public HankookTire(String location, int maxRotation) 
	{
		super(location, maxRotation);
	}
	@Override
	public boolean roll()
	{
		++accumulatedRotation;
		if(maxRotation > accumulatedRotation)
		{
			System.out.println(location + "HankookTire 남은 회전수 : " + (maxRotation - accumulatedRotation));
			return true;
		}
		else
		{
			System.out.println(location + "HankookTire 타이어 펑크");
			return false;
		}
	}
}
