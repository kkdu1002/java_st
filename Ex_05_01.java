package jang3;

import java.util.Scanner;

public class Ex_05_01 
{
	public static void main(String[] args) 
	{
		int input_num;
		Scanner num = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		/*
		for(input_num = num.nextInt();input_num >= 0;)
		{
			if (input_num % 2 == 0)
			{
				System.out.printf("%d는 짝수 입니다.\n",input_num);
				System.out.print("정수를 입력하세요 : ");
			}
			else
			{
				System.out.printf("%d는 홀수 입니다.\n",input_num);
				System.out.print("정수를 입력하세요 : ");
			}
			input_num = num.nextInt();
		}
		System.out.print("----- 종료 -----");
		*/
		/*
		 *input_num = num.nextInt();
		 *if (input_num % 2 == 0)
			System.out.printf("%d는 짝수 입니다.\n",input_num);
		  else
			System.out.printf("%d는 홀수 입니다.\n",input_num);
		 */
		/*
		input_num = num.nextInt();
		while(input_num >= 0)
		{
			if (input_num % 2 == 0)
			{
				System.out.printf("%d는 짝수 입니다.\n",input_num);
				System.out.print("정수를 입력하세요 : ");
			}
			else
			{
				System.out.printf("%d는 홀수 입니다.\n",input_num);
				System.out.print("정수를 입력하세요 : ");
			}
			input_num = num.nextInt();
		}
		System.out.print("----- 종료 -----");
		*/
		num.close();
	}
}