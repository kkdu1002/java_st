package jang12;

public class Calculator217 
{
	void powerOn()
	{
		System.out.println("������ �մϴ�.");
	}
	int plus(int x , int y)
	{
		int result = x + y;
		return result;
	}
	double divide(int x , int y)
	{
		double result = (double)x / (double)y;
		return result;
	}
	void powerOff()
	{
		System.out.println("������ ���ϴ�.");
	}
	public static void main(String[] args)
	{
		Calculator217 myCalc = new Calculator217();
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();
	}

}
