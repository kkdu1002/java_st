package jang12;

class Car8
{
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
}


public class use_class3 
{
	public static void main(String[] args) 
	{
		Car8 myCar = new Car8();
		System.out.println("���� ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("������ �ӵ� : " + myCar.speed);
	}
}