package jang7;

public class Ex_07_16 
{
	public static void main(String[] args) 
	{
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // float ��ȣ 1, ���� 8, ������ 23
		num2 = (int) num3; // double ��ȣ 1 , ���� 11 , ���� 52
		
		int result = num1 - num2;
		System.out.println(result);
	}
}