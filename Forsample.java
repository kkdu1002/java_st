package jang3;

public class Forsample 
{
	public static void main(String[] args) 
	{
		int i,j;
		
		for (j = 0 , i = 0 ; i <= 10 ; i++) 
		{
			j += i;
			System.out.print(i);
			if(i == 10) 
			{
				System.out.print(" = ");
				System.out.print(j);
			}
			else
				System.out.print(" + ");
		}
	}
}
