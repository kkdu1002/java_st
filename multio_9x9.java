package jang3;

public class multio_9x9 
{
	public static void main(String[] args) 
	{
		for (int num1 = 1; num1 < 10 ; num1++) 
		{
			System.out.printf("%d´Ü :\t",num1);
			for (int num2 = 1;num2 < 10 ; num2++)
			{
				System.out.printf("%d * %d = %d \t" , num1 , num2 , num1 * num2);
			}
			System.out.println();
		}
	}
}