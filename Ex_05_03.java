package jang3;

import java.util.Scanner;

public class Ex_05_03 
{
	public static void main(String[] args) 
	{
		Scanner num = new Scanner(System.in);
		
		int input_num;
		
		System.out.printf("������ �Է��ϼ��� [0�� �̸� ����] : ");
		
//for switch
		for(input_num = num.nextInt();input_num >= 0;) 
		{
			switch(input_num / 10) 
			{
				case(10):
				case(9):
					System.out.printf("A");
					break;
				case(8):
					System.out.printf("B");
					break;
				case(7):
					System.out.printf("C");
					break;
				case(6):
					System.out.printf("D");
					break;
				default:
					System.out.printf("F"); 
			}
			System.out.printf("���� �Դϴ�.\n");
			System.out.printf("������ �Է��ϼ��� [0�� �̸� ����] : ");
			input_num = num.nextInt();
		}
		System.out.printf("----- ���� -----");
		num.close();
		/*
// while switch
 * input_num = num.nextInt();
		while(input_num >= 0)
		{
			switch(input_num / 10) 
			{
				case(10):
				case(9):
					System.out.printf("A");
					break;
				case(8):
					System.out.printf("B");
					break;
				case(7):
					System.out.printf("C");
					break;
				case(6):
					System.out.printf("D");
					break;
				default:
					System.out.printf("F");
			}
			System.out.printf("���� �Դϴ�.\n");
			System.out.printf("������ �Է��ϼ��� [0�� �̸� ����] : ");
			input_num = num.nextInt();
		}
		System.out.printf("----- ���� -----");
		*/
		
		/*
// while hasNext
		while(num.hasNext()) 
		{
			input_num = num.nextInt();
			if(input_num < 0) 
			{
				System.out.printf("----- ���� -----");
				break;
			}
			else if(input_num >= 90) 
			{
				System.out.printf("A");
			}
			else if(input_num >= 80) 
			{
				System.out.printf("B");
			}
			else if(input_num >= 70) 
			{
				System.out.printf("C");
			}
			else if(input_num >= 60) 
			{
				System.out.printf("D");
			}
			else
			{
				System.out.printf("F");
			}
			System.out.printf("���� �Դϴ�.\n");
			System.out.printf("������ �Է��ϼ��� [0�� �̸� ����] : ");
		}
		*/
		
		/*
// while no hasNext
 * input_num = num.nextInt();
		while(input_num > 0) 
		{
			if(input_num >= 90) 
			{
				System.out.printf("A");
			}
			else if(input_num >= 80) 
			{
				System.out.printf("B");
			}
			else if(input_num >= 70) 
			{
				System.out.printf("C");
			}
			else if(input_num >= 60) 
			{
				System.out.printf("D");
			}
			else
			{
				System.out.printf("F");
			}
			System.out.printf("���� �Դϴ�.\n");
			System.out.printf("������ �Է��ϼ��� [0�� �̸� ����] : ");
			input_num = num.nextInt();
		}
		System.out.printf("----- ���� -----");
		*/

		/*
		if (input_num >= 90) 
		{
			System.out.printf("A");
		} 
		else if (input_num >= 80) 
		{
			System.out.printf("B");
		} 
		else if (input_num >= 70) 
		{
			System.out.printf("C");
		} 
		else if (input_num >= 60) 
		{
			System.out.printf("D");
		} 
		else
			System.out.printf("F");

		System.out.printf("���� �Դϴ�.\n");
		 */
	}
}