package jang3;

import java.util.Scanner;

public class Ex_05_01 
{
	public static void main(String[] args) 
	{
		int input_num;
		Scanner num = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		/*
		for(input_num = num.nextInt();input_num >= 0;)
		{
			if (input_num % 2 == 0)
			{
				System.out.printf("%d�� ¦�� �Դϴ�.\n",input_num);
				System.out.print("������ �Է��ϼ��� : ");
			}
			else
			{
				System.out.printf("%d�� Ȧ�� �Դϴ�.\n",input_num);
				System.out.print("������ �Է��ϼ��� : ");
			}
			input_num = num.nextInt();
		}
		System.out.print("----- ���� -----");
		*/
		/*
		 *input_num = num.nextInt();
		 *if (input_num % 2 == 0)
			System.out.printf("%d�� ¦�� �Դϴ�.\n",input_num);
		  else
			System.out.printf("%d�� Ȧ�� �Դϴ�.\n",input_num);
		 */
		/*
		input_num = num.nextInt();
		while(input_num >= 0)
		{
			if (input_num % 2 == 0)
			{
				System.out.printf("%d�� ¦�� �Դϴ�.\n",input_num);
				System.out.print("������ �Է��ϼ��� : ");
			}
			else
			{
				System.out.printf("%d�� Ȧ�� �Դϴ�.\n",input_num);
				System.out.print("������ �Է��ϼ��� : ");
			}
			input_num = num.nextInt();
		}
		System.out.print("----- ���� -----");
		*/
		num.close();
	}
}