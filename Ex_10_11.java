package jang10;

import java.util.Scanner;

public class Ex_10_11 
{
	public static void main(String[] args) 
	{
		int year = 1;
		Scanner y = new Scanner(System.in);
		
		while(year != 0) 
		{
			System.out.print("�⵵�� �Է��ϼ��� : ");
			year = y.nextInt();
			if (year == 0 ) 
			{
				System.out.println("���� �׸�");
				break;
			}
			else if(year % 4 == 0 & year % 100 != 0 || year % 400 == 0)
				System.out.printf("%d���� �����Դϴ�.\n",year);
			else
				System.out.printf("%d���� ����Դϴ�.\n",year);
			System.out.println();
		}
	}
}