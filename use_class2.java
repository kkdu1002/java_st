package jang12;

class Car7
{
	String color;
	int speed;
	static int count = 0;
	Car7()
	{
		count++;
	}
	public static int getCount() {
		return count; // static���� static��
	}
}


public class use_class2 
{
	public static void main(String[] args) 
	{
		Car7 myCar1 = new Car7();
		System.out.println("���� ����� �ڵ��� ���� == > " + myCar1.count);
		
		Car7 myCar2 = new Car7();
		System.out.println("���� ����� �ڵ��� ���� == > " + myCar2.count);
		
		Car7 myCar3 = new Car7();
		System.out.println("���� ����� �ڵ��� ���� == > " + myCar3.count);
		
		System.out.println(Car7.count);
	}

}
