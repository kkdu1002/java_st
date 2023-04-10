package jang12;

class Car6
{
	String color;
	int speed;
	static int count = 0;
	Car6(){
		count++;
	}
}

public class use_class 
{
	public static void main(String[] args) 
	{
		Car6 myCar1 = new Car6();
		System.out.println("현재 생산된 자동차 숫자 == > " + myCar1.count);
		
		Car6 myCar2 = new Car6();
		System.out.println("현재 생산된 자동차 숫자 == > " + myCar2.count);
		
		Car6 myCar3 = new Car6();
		System.out.println("현재 생산된 자동차 숫자 == > " + myCar3.count);
		
		System.out.println(Car6.count);
	}

}
