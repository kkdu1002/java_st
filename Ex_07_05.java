package jang7;

public class Ex_07_05 
{
	public static void main(String[] args) 
	{
		int result = 0, hap = 0, x_3_result = 0 , i;
		for(i = 1 ; i <= 100 ; i++) 
		{
			hap += i;
			if(i % 3 == 0) 
			{
				x_3_result += i;
				continue;
			}
			else
				result += i;
		}
		System.out.printf("1 ~ 100의 합(3의 배수 제외) : %d\n",result);
		System.out.printf("1 ~ 100의 합(전체) : %d\n",hap);
		System.out.printf("1 ~ 100의 합(3의 배수 합) : %d\n",x_3_result);
	}
}
