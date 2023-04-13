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
			System.out.println(location + "KumhoTire ���� ȸ���� : " + (maxRotation - accumulatedRotation));
			return true;
		}
		else
		{
			System.out.println(location + "KumhoTire Ÿ�̾� ��ũ");
			return false;
		}
	}
}
