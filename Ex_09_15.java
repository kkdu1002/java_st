package jang9;

public class Ex_09_15 
{
	public static void main(String[] args) 
	{
		int i = 1 , sum = 0;
		while(i <= 100) 
		{
			if(i % 2 == 0 && i % 3 == 0 && i % 4 == 0) 
			//if(i % 12 == 0)
			{
				System.out.printf("%d ", i);
				sum += i;
			}
			i++;
		}
		System.out.printf("\nÇÕ : %d", sum);
	}
}