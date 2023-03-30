package jang9;

public class Ex_09_13 
{
	public static void main(String[] args) 
	{
		int i = 1;
		for (i = 1; i <= 10 ; i++) 
		{
			if(i % 2 != 0) 
			{
				continue;
			}
			System.out.println("for" +i);
		}
		i = 1;
		while(i <= 10) 
		{
			i++;
			if(i % 2 != 0) 
			{	
				continue;
			}
			System.out.println("while" + i);
		}
	}
}