package jang6;

public class Ex_06_14 
{
	public static void main(String[] args) 
	{
		int i;
		
		// for
		for (i = 0; i <= 127; i++) 
		{
			if (i % 16 == 0) 
			{
				System.out.printf("-------------------\n");
				System.out.printf("10진수\t16진수\t문자\n");
				System.out.printf("-------------------\n");
			}
			System.out.printf("%d\t%x\t%c\n",i,i,i);
		}

		// while
		/*
		i = 0;
		while(i <= 127) 
		{
			if (i % 16 == 0) 
			{
				System.out.printf("-------------------\n");
				System.out.printf("10진수\t16진수\t문자\n");
				System.out.printf("-------------------\n");
			}
			System.out.printf("%d\t%x\t%c\n",i,i,i);
			i++;
		}
		*/
		// do while
		/*
		i = 0;
		do 
		{
			if (i % 16 == 0) 
			{
				System.out.printf("-------------------\n");
				System.out.printf("10진수\t16진수\t문자\n");
				System.out.printf("-------------------\n");
			}
			System.out.printf("%d\t%x\t%c\n",i,i,i);
			i++;
		}
		while(i <= 127);
		*/
	}
}