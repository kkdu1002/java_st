package jang3;

import java.util.Scanner;

public class Ex_04_10 
{
	public static void main(String[] args) 
	{
		float num1 , num2 ;
		Scanner num = new Scanner(System.in);
		System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
		
		while(num.hasNext())
		{
			num1 = num.nextFloat();
			System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
			num2 = num.nextFloat();
			if(num1 == 0 | num2 == 0)
				break;
			
			System.out.printf("%.2f + %.2f = %.2f\n",num1, num2, num1 + num2);
			System.out.printf("%.2f - %.2f = %.2f\n",num1, num2, num1 - num2);
			System.out.printf("%.2f * %.2f = %.2f\n",num1, num2, num1 * num2);
			System.out.printf("%.2f / %.2f = %.2f\n",num1, num2, num1 / num2);
//			System.out.printf("%.0f %% %.0f = %.0f\n",num1, num2, num1 % num2);
			System.out.printf("%d %% %d = %d\n", (int)num1 , (int)num2 , (int)(num1 % num2));
			System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
		}
		num.close();
	}
}
