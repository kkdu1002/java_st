package jang12;

abstract class Calculator
{
	public abstract int add(int a ,int b);
	public abstract int subtract(int a , int b);
	public abstract double avg(int x[]);
}

public class GoodCalc extends Calculator
{	
	public int add(int a,int b)
	{
		return a + b;
	}
	public int subtract(int a, int b)
	{
		return a - b;
	}
	public double avg(int x[])
	{
		double sum = 0;
		for(int i = 0; i < x.length; i++) 
		{
			sum += x[i];
		}
		return sum / x.length;
	}
	public static void main(String[] args) 
	{
		Calculator c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.avg(new int[] {2,3,4}));
	}

}
