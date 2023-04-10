package jang12;

class Car2
{
	String color;
	int speed;
	
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public int getSpeed()
	{
		return speed;
	}
	
	void upSpeed(int value) 
	{
		speed = speed + value;
	}
	void downSpeed(int value) 
	{
		speed = speed - value;
	}
}
public class create_car2 
{
	public static void main(String[] args)
	{
		Car2 myCar1 = new Car2();
		myCar1.setColor("빨강") ;
		myCar1.setSpeed(0);
		
		Car2 myCar2 = new Car2();
		myCar2.setColor("파랑") ;
		myCar2.setSpeed(0);
		
		Car2 myCar3 = new Car2();
		myCar3.setColor("노랑") ;
		myCar3.setSpeed(0);
		
		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km입니다.");
		
		myCar2.upSpeed(60);
		System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km입니다.");
		
		myCar3.upSpeed(20);
		System.out.println("자동차3의 색상은 " + myCar3.getColor() + "이며, 현재속도는 " + myCar3.getSpeed() + "km입니다.");
	}
}