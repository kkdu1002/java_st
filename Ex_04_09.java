package jang3;

public class Ex_04_09 
{
	public static void main(String[] args) 
	{
		int num = 100;
		for (int i = 1; i <= 5; i++ ) 
		{
			System.out.printf("%d << %d = %d\n", num, i, num << i);
		}
		for (int j = 1; j <= 5; j++)
		{
			System.out.printf("%d >> %d = %d\n", num, j, num >> j);
		}
	}
}