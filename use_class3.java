package jang12;

class Car8
{
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
}


public class use_class3 
{
	public static void main(String[] args) 
	{
		Car8 myCar = new Car8();
		System.out.println("제작 회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
	}
}