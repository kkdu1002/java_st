package jang12;

public class Calculator238 
{
	static double pi = 3.141592;
	
	static int plus(int x, int y)
	{
		return x + y;
	}
	static int minus(int x , int y)
	{
		return x - y;
	}
	public static void main(String[] args) 
	{
		double result1 = 10 * 10 * Calculator238.pi;
		int result2 = Calculator238.plus(10, 5);
		int result3 = Calculator238.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
