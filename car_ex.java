package jang12;
class Car
{
	public Car(String color, int cc)
	{
		System.out.println("매개변수가 있는 생성자");
	}
	public Car() // 상속 x , 매게변수가 있는 생성자가 있으면 jvm이 나타나지않음
	{
		System.out.println("디폴트 생성자");
	}
}
public class car_ex 
{
	public static void main(String[] args) 
	{
		Car myCar = new Car("검정",3000);
		Car myCar2 = new Car();
	}
}
