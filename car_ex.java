package jang12;
class Car
{
	public Car(String color, int cc)
	{
		System.out.println("�Ű������� �ִ� ������");
	}
	public Car() // ��� x , �ŰԺ����� �ִ� �����ڰ� ������ jvm�� ��Ÿ��������
	{
		System.out.println("����Ʈ ������");
	}
}
public class car_ex 
{
	public static void main(String[] args) 
	{
		Car myCar = new Car("����",3000);
		Car myCar2 = new Car();
	}
}
