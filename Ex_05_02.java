package jang3;

import java.util.Scanner;

public class Ex_05_02 
{
	public static void main(String[] args) 
	{
		int input_num;
		Scanner num = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 종료 [-999 또는 -999 보다 작은 수] : ");
		
		for(input_num = num.nextInt();input_num >= -998;) 
		{
			if(50 > input_num) 
			{
				System.out.printf("%d는 50보다 작군요\n",input_num);
			}
			else if(50 == input_num) 
			{
				System.out.printf("%d는 50과 같군요\n",input_num);
			}
			else if((50 < input_num) && (100 > input_num)) 
			{
				System.out.printf("%d는 50보다 크고 100보다 작군요\n",input_num);
			}
			else if((50 < input_num) && (100 == input_num)) 
			{
				System.out.printf("%d는 50보다 크고 100과 같군요\n",input_num);
			}
			else 
			{
				System.out.printf("%d는 100보다 크군요\n",input_num);
			}
			System.out.print("정수를 입력하세요 종료 [-999 또는 -999 보다 작은 수] : ");
			input_num = num.nextInt();
		}
		System.out.print("----- 종료 -----");
		/*
		System.out.print("정수를 입력하세요 종료 [-999] : ");
		
		input_num = num.nextInt();
		
		while(input_num != -999) 
		{
			if(50 > input_num) 
			{
				System.out.printf("%d는 50보다 작군요\n",input_num);
			}
			else if(50 == input_num) 
			{
				System.out.printf("%d는 50과 같군요\n",input_num);
			}
			else if((50 < input_num) && (100 > input_num)) 
			{
				System.out.printf("%d는 50보다 크고 100보다 작군요\n",input_num);
			}
			else if((50 < input_num) && (100 == input_num)) 
			{
				System.out.printf("%d는 50보다 크고 100이랑 같군요\n",input_num);
			}
			else 
			{
				System.out.printf("%d는 100보다 크군요\n",input_num);
			}
			System.out.print("정수를 입력하세요 종료 [-999] : ");
			input_num = num.nextInt();
		}
		System.out.print("----- 종료 -----");
		*/
		/*
		if(50 > input_num) 
		{
			System.out.printf("%d는 50보다 작군요\n",input_num);
		}
		else if(50 == input_num) 
		{
			System.out.printf("%d는 50과 같군요\n",input_num);
		}
		else if((50 < input_num) && (100 > input_num)) 
		{
			System.out.printf("%d는 50보다 크고 100보다 작군요\n",input_num);
		}
		else if((50 < input_num) && (100 == input_num)) 
		{
			System.out.printf("%d는 50보다 크고 100이랑 같군요\n",input_num);
		}
		else 
		{
			System.out.printf("%d는 100보다 크군요\n",input_num);
		}
		*/
		num.close();
	}
}