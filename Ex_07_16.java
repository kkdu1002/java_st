package jang7;

public class Ex_07_16 
{
	public static void main(String[] args) 
	{
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // float 부호 1, 지수 8, 가수부 23
		num2 = (int) num3; // double 부호 1 , 지수 11 , 가수 52
		
		int result = num1 - num2;
		System.out.println(result);
	}
}