package jang3;

import java.util.Scanner;

public class Ex_05_02 
{
	public static void main(String[] args) 
	{
		int input_num;
		Scanner num = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� ���� [-999 �Ǵ� -999 ���� ���� ��] : ");
		
		for(input_num = num.nextInt();input_num >= -998;) 
		{
			if(50 > input_num) 
			{
				System.out.printf("%d�� 50���� �۱���\n",input_num);
			}
			else if(50 == input_num) 
			{
				System.out.printf("%d�� 50�� ������\n",input_num);
			}
			else if((50 < input_num) && (100 > input_num)) 
			{
				System.out.printf("%d�� 50���� ũ�� 100���� �۱���\n",input_num);
			}
			else if((50 < input_num) && (100 == input_num)) 
			{
				System.out.printf("%d�� 50���� ũ�� 100�� ������\n",input_num);
			}
			else 
			{
				System.out.printf("%d�� 100���� ũ����\n",input_num);
			}
			System.out.print("������ �Է��ϼ��� ���� [-999 �Ǵ� -999 ���� ���� ��] : ");
			input_num = num.nextInt();
		}
		System.out.print("----- ���� -----");
		/*
		System.out.print("������ �Է��ϼ��� ���� [-999] : ");
		
		input_num = num.nextInt();
		
		while(input_num != -999) 
		{
			if(50 > input_num) 
			{
				System.out.printf("%d�� 50���� �۱���\n",input_num);
			}
			else if(50 == input_num) 
			{
				System.out.printf("%d�� 50�� ������\n",input_num);
			}
			else if((50 < input_num) && (100 > input_num)) 
			{
				System.out.printf("%d�� 50���� ũ�� 100���� �۱���\n",input_num);
			}
			else if((50 < input_num) && (100 == input_num)) 
			{
				System.out.printf("%d�� 50���� ũ�� 100�̶� ������\n",input_num);
			}
			else 
			{
				System.out.printf("%d�� 100���� ũ����\n",input_num);
			}
			System.out.print("������ �Է��ϼ��� ���� [-999] : ");
			input_num = num.nextInt();
		}
		System.out.print("----- ���� -----");
		*/
		/*
		if(50 > input_num) 
		{
			System.out.printf("%d�� 50���� �۱���\n",input_num);
		}
		else if(50 == input_num) 
		{
			System.out.printf("%d�� 50�� ������\n",input_num);
		}
		else if((50 < input_num) && (100 > input_num)) 
		{
			System.out.printf("%d�� 50���� ũ�� 100���� �۱���\n",input_num);
		}
		else if((50 < input_num) && (100 == input_num)) 
		{
			System.out.printf("%d�� 50���� ũ�� 100�̶� ������\n",input_num);
		}
		else 
		{
			System.out.printf("%d�� 100���� ũ����\n",input_num);
		}
		*/
		num.close();
	}
}