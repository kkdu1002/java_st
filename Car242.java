package jang12;

public class Car242 
{
	int speed;
	void run() 
	{ 
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args)
	{
		Car242 myCar = new Car242();
		myCar.speed = 60;
		myCar.run();
	}
}