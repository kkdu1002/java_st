package jang3;

public class homework 
{
	public static void main(String[] args) 
	{

		for(int i = 0; i < 5;i++) 
		{
			for(int j = 5;j > i; j--)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}