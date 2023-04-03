package jang10;

public class Ex_10_08 
{
	public static void main(String[] args) 
	{
		int count = 0 , result = 0;
		
		while(count < 10) 
		{
			count ++;
			for(int i = 1 ; i <= (10*count); i++) 
			{
				result += i;
			}
			System.out.printf("1 ~ %d까지의 합 : %d\n",(10*count) , result);	
			result = 0;
		}
	}
}