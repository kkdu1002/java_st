package jang3;

public class Ex_04_05 
{
	public static void main(String[] args) 
	{
		int a = -100 , b = -200;
		
		boolean x = (a != 0);
		boolean y = (b != 0);
		
		
		System.out.printf("상수의 AND 연산 : %s\n" , x && y);
		System.out.printf("상수의 OR 연산 : %s\n", x || y);
		System.out.printf("상수의 NOT 연산 : %s\n" , !x);
	}
}
