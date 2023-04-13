package jang12;

public class Tire 
{
	public int maxRotation; //최대 회전수
	public int accumulatedRotation; // 누적회전수
	public String location; // 타이어 위치
	
	public Tire(String location , int maxRotation)
	{
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll()
	{
		++accumulatedRotation;
		if(maxRotation > accumulatedRotation)
		{
			System.out.println(location + "남은 회전수 : " + (maxRotation - accumulatedRotation));
			return true;
		}
		else
		{
			System.out.println(location + "타이어 펑크");
			return false;
		}
	}
}