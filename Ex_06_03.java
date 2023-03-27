package jang6;

public class Ex_06_03 
{
	public static void main(String[] args) 
	{
		int sum , i;
		sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		
		System.out.printf("1에서 10까지의 합 : %d\n",sum);
		
		System.out.printf("for문\n");
		sum = 0;
		
		for(i = 1 ;i <= 10 ; i++) 
		{
			if(i != 10) 
			{
				System.out.printf("%d + ",i);
			}
			else
				System.out.printf("%d\n",i);
			sum += i;
		}
		System.out.printf("1에서 10까지의 합 : %d\n",sum);
		
		System.out.printf("while문\n");
		i = 1;
		sum = 0;
		
		while(i <= 10) 
		{
			if(i != 10) 
			{
				System.out.printf("%d + ",i);
			}
			else
				System.out.printf("%d\n",i);
			sum += i;
			i++;
		}
		System.out.printf("1에서 10까지의 합 : %d\n",sum);
		
		System.out.printf("do while문\n");
		i = 1;
		sum = 0;
		
		do 
		{
			if(i != 10) 
			{
				System.out.printf("%d + ",i); 
			}
			else
				System.out.printf("%d\n",i);
			sum += i;
			i++;
		}
		while(i <= 10);
		System.out.printf("1에서 10까지의 합 : %d\n",sum);
	}
}