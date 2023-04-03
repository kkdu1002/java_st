package jang10;

public class Ex_10_13 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 5; i++) //ÁÙ³Ñ±è
		{
			for(int j = 4 ; j > i; j--) 
			{
				System.out.print(" ");
			}
			for(int k = 0 ; k <= i ; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
