package jang12;

public class Car333_Ex 
{
	public static void main(String[] args) 
	{
		Car333 myCar = new Car333();
		
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		myCar.setSpeed(60);
		if(myCar.isStop()) 
		{
			myCar.setStop(true);
		}
	}
}