package jang3;

public class Ex_04_02 
{
	public static void main(String[] args)
	{
		int num1 = 2, num2 = 3 , num3 = 4;
		
		int result = num1 + num2 - num3;
		System.out.printf("%d + %d - %d = %d\n",num1,num2,num3,result);
		
		result = num1 + num2 * num3;
		System.out.printf("%d + %d * %d = %d\n",num1,num2,num3,result);
		
		float result1 = num1 * num2 / (float) num3;
		System.out.printf("%d * %d / %d = %f\n",num1,num2,num3,result1);
		
		System.out.printf("%d / %d 의 몫은 %d\n",num3,num2,num3 / num2);
		System.out.printf("%d %% %d 의 나머지는 %d",num3,num2,num3 % num2);
	}
}