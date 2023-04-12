package jang12;

import java.util.Scanner;

abstract class Calc
{
	protected int a,b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public abstract int calculate();
}
class plus extends Calc
{
	@Override
	public int calculate() 
	{
		return a + b;
	}
}
class minus extends Calc
{
	@Override
	public int calculate() 
	{
		return a - b;
	}
}
class multy extends Calc
{
	@Override
	public int calculate() 
	{
		return a * b;
	}
}
class div extends Calc
{
	@Override
	public int calculate() 
	{
		return a / b;
	}
}
public class Abstract_Calc
{	
	public static void main(String[] args) 
	{
		Scanner x = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = x.nextInt();
		System.out.print("정수2 : ");
		int num2 = x.nextInt();

		Abstract_Calc c = new Abstract_Calc();
		System.out.print("연산자 : ");
		String o = x.next();
		
		switch(o)
		{
			case ("+"):
				plus p = new plus();
				p.setValue(num1, num2);
				System.out.printf("%d %s %d = %d",num1,o,num2,p.calculate());
				break;
			case ("-"):
				minus m = new minus();
				m.setValue(num1, num2);
			System.out.printf("%d %s %d = %d",num1,o,num2,m.calculate());
				break;
			case ("*"):
				multy mu = new multy();
				mu.setValue(num1, num2);
			System.out.printf("%d %s %d = %d",num1,o,num2,mu.calculate());
				break;
			case ("/"):
				div d = new div();
				d.setValue(num1, num2);
			System.out.printf("%d %s %d = %d",num1,o,num2,d.calculate());
				break;
			default:
				System.out.println("잘못된 연산자 입력입니다.");
				break;
		}
	}
}