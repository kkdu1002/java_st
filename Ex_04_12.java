package jang3;

import java.util.Scanner;

public class Ex_04_12 
{
	public static void main(String[] args) 
	{
		int year;
		
		Scanner Y = new Scanner(System.in);
		System.out.printf("������ �Է��ϼ��� : ");
		
//		year = Y.nextInt();
		
//		if (year % 4 == 0 & year % 100 != 0)
//			System.out.printf("%d ���� �����Դϴ�.",year);
//		else if (year % 400 == 0)
//			System.out.printf("%d ���� �����Դϴ�.",year);
//		else
//			System.out.printf("%d ���� ������ �ƴմϴ�.",year);
		
		while(Y.hasNext())
		{
			year = Y.nextInt();
			if (year == 0)
				break;
			if (year % 4 == 0 & year % 100 != 0)
				System.out.printf("%d ���� �����Դϴ�.\n",year);
			else if (year % 400 == 0)
				System.out.printf("%d ���� �����Դϴ�.\n",year);
			else
				System.out.printf("%d ���� ������ �ƴմϴ�.\n",year);
			System.out.printf("������ �Է��ϼ��� : ");
		}
		Y.close();
	}
}