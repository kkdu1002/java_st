package jang12;

public class Car232 
{
	String model;
	int speed;
	Car232(String model)
	{
		this.model = model;
	}
	void Speed(int speed)
	{
		this.speed = speed;
	}
	void run()
	{
		for(int i = 10; i <= 50 ; i += 10)
		{
			this.Speed(i);
			System.out.println(this.model + "�� �޸��ϴ�. (�ü� : " + this.speed + "km/h)");
		}
	}
	public static void main(String[] args) 
	{
		Car232 myCar = new Car232("������");
		Car232 yourCar = new Car232("����");
		
		myCar.run();
		yourCar.run();
	}
}