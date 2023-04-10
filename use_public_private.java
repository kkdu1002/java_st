package jang12;

class Car3
{
	private int speed = 0;
	public void upSpeed(int value) 
	{
		if(speed + value > 200) 
		{
			speed = 200;
		}
		else
		{
			speed += value;
		}
		System.out.println("현재 속도 : " + getSpeed());
	}
	public void downSpeed(int value) 
	{
		if(speed - value < 0) 
		{
			speed = 0;
		}
		else
		{
			speed -= value;
		}
		System.out.println("현재 속도 : " + getSpeed());
	}
	public int getSpeed() 
	{
		return speed;
	}
}

public class use_public_private 
{
	public static void main(String[] args) 
	{
		Car3 myCar1 = new Car3();
		
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		
		myCar1.downSpeed(50);
		myCar1.downSpeed(160);
	}
}