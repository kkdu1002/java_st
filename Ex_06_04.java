package jang6;

public class Ex_06_04 
{
	public static void main(String[] args) 
	{
		int  i;
		int odd = 0, even = 0, hap = 0;
		System.out.printf("for�� \n");
		
		for(i = 500 ; i <= 1000;i++) 
		{
			hap += i;
			if(i % 2 == 1)
				odd += i;
			else
				even += i;
		}
		System.out.printf("500���� 1000������ Ȧ���� �� : %d\n",odd);
		System.out.printf("500���� 1000������ ¦���� �� : %d\n",even);
		System.out.printf("500���� 1000������ ��ü�� �� : %d\n",hap);
		
		
		System.out.printf("while�� \n");
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
		System.out.printf("500���� 1000������ Ȧ���� �� : %d\n",odd);
		System.out.printf("500���� 1000������ ¦���� �� : %d\n",even);
		System.out.printf("500���� 1000������ ��ü�� �� : %d\n",hap);
		
		System.out.printf("do while�� \n");
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
		System.out.printf("500���� 1000������ Ȧ���� �� : %d\n",odd);
		System.out.printf("500���� 1000������ ¦���� �� : %d\n",even);
		System.out.printf("500���� 1000������ ��ü�� �� : %d\n",hap);
	}
}
