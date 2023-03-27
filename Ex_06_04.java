package jang6;

public class Ex_06_04 
{
	public static void main(String[] args) 
	{
		int  i;
		int odd = 0, even = 0, hap = 0;
		System.out.printf("for문 \n");
		
		for(i = 500 ; i <= 1000;i++) 
		{
			hap += i;
			if(i % 2 == 1)
				odd += i;
			else
				even += i;
		}
		System.out.printf("500에서 1000까지의 홀수의 합 : %d\n",odd);
		System.out.printf("500에서 1000까지의 짝수의 합 : %d\n",even);
		System.out.printf("500에서 1000까지의 전체의 합 : %d\n",hap);
		
		
		System.out.printf("while문 \n");
		i = 500;
		odd = 0;
		even = 0;
		hap = 0;
		
		while(i <= 1000) 
		{
			hap += i;
			if(i % 2 == 1)
				odd += i;
			else
				even += i;
			i++;
		}
		System.out.printf("500에서 1000까지의 홀수의 합 : %d\n",odd);
		System.out.printf("500에서 1000까지의 짝수의 합 : %d\n",even);
		System.out.printf("500에서 1000까지의 전체의 합 : %d\n",hap);
		
		System.out.printf("do while문 \n");
		i = 500;
		odd = 0;
		even = 0;
		hap = 0;
		
		do 
		{
			hap += i;
			if(i%2 == 1) 
				odd += i;
			else 
				even += i;
			i++;
		}
		while(i <= 1000);
		System.out.printf("500에서 1000까지의 홀수의 합 : %d\n",odd);
		System.out.printf("500에서 1000까지의 짝수의 합 : %d\n",even);
		System.out.printf("500에서 1000까지의 전체의 합 : %d\n",hap);
	}
}
