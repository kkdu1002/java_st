package jang3;

import java.util.Scanner;

public class Ex_05_05 
{
	public static void main(String[] args) 
	{
		Scanner y = new Scanner(System.in);
		int year;
		
		System.out.print("������ �Է��ϼ��� : ");
		year = y.nextInt();
		
		// �������� / �����ι� / �������
		while(year > 0) 
		{
			switch(year % 12) 
			{
				case 0:
					System.out.printf("%d�� �����̶� �Դϴ�.\n",year);
					break;
				case 1:
					System.out.printf("%d�� �߶� �Դϴ�.\n",year);
					break;
				case 2:
					System.out.printf("%d�� ���� �Դϴ�.\n",year);
					break;
				case 3:
					System.out.printf("%d�� ������ �Դϴ�.\n",year);
					break;
				case 4:
					System.out.printf("%d�� ��� �Դϴ�.\n",year);
					break;
				case 5:
					System.out.printf("%d�� �Ҷ� �Դϴ�.\n",year);
					break;
				case 6:
					System.out.printf("%d�� ȣ���̶� �Դϴ�.\n",year);
					break;
				case 7:
					System.out.printf("%d�� �䳢�� �Դϴ�.\n",year);
					break;
				case 8:
					System.out.printf("%d�� ��� �Դϴ�.\n",year);
					break;
				case 9:
					System.out.printf("%d�� ��� �Դϴ�.\n",year);
					break;
				case 10:
					System.out.printf("%d�� ���� �Դϴ�.\n",year);
					break;
				case 11:
					System.out.printf("%d�� ��� �Դϴ�.\n",year);
					break;
			}
			System.out.print("������ �Է��ϼ��� : ");
			year = y.nextInt();
		}
		System.out.print("----- ���� -----");
	}
}
