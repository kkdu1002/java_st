package jang6;

public class Ex_06_10 
{
	public static void main(String[] args) 
	{
		int k = 2;
		for(int i = 1; i < 10; i++) 
		{
			for (int j = 2; j < 10; j++) 
			{
				if(k < 10) 
				{
					System.out.printf("%d ´Ü\t\t",k);
					k++;
				}
				else
					System.out.printf("%d * %d = %d\t",j,i,j*i);
			}
			System.out.println();
		}
		
		/*
		for(int i = 2; i < 10; i++) 
		{
			System.out.printf("%d ´Ü : ",i);
			for (int j = 1; j  < 10; j++) {
				System.out.printf("%d * %d = %d\t",i,j,j*i);
			}
			System.out.println();
		}
		*/
	}
}