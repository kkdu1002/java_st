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
		myCar1.setColor("����") ;
		myCar1.setSpeed(0);
		
		Car2 myCar2 = new Car2();
		myCar2.setColor("�Ķ�") ;
		myCar2.setSpeed(0);
		
		Car2 myCar3 = new Car2();
		myCar3.setColor("���") ;
		myCar3.setSpeed(0);
		
		myCar1.upSpeed(30);
		System.out.println("�ڵ���1�� ������ " + myCar1.getColor() + "�̸�, ����ӵ��� " + myCar1.getSpeed() + "km�Դϴ�.");
		
		myCar2.upSpeed(60);
		System.out.println("�ڵ���2�� ������ " + myCar2.getColor() + "�̸�, ����ӵ��� " + myCar2.getSpeed() + "km�Դϴ�.");
		
		myCar3.upSpeed(20);
		System.out.println("�ڵ���3�� ������ " + myCar3.getColor() + "�̸�, ����ӵ��� " + myCar3.getSpeed() + "km�Դϴ�.");
	}
}