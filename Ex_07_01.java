package jang7;

import java.util.Scanner;

public class Ex_07_01 
{
	public static void main(String[] args) 
	{
		Scanner od = new Scanner(System.in);
		int order;
		
		System.out.println("�մ� �ֹ� �Ͻðڽ��ϱ� ?");
		
		System.out.print("<1> ī��� <2> īǪġ�� <3> �Ƹ޸�ī�� <4> �ֹ� �׸��ϱ� == >");
		order = od.nextInt();
		
		while(true) 
		{
			switch(order) 
			{
				case 1:
					System.out.printf("ī��󶼸� �ֹ��Ͽ����ϴ�.\n");
					break;
				case 2:
					System.out.printf("īǪġ�븦 �ֹ��Ͽ����ϴ�.\n");
					break;
				case 3:
					System.out.printf("�Ƹ޸�ī�븦 �ֹ��Ͽ����ϴ�.\n");
					break;
				case 4:
					System.out.printf("�ֹ��Ͻ� Ŀ�� ���Խ��ϴ�.\n");
					break;
				default:
					System.out.printf("���� �޴��Դϴ�.\n");
					break;
			}
			if(order == 4) 
			{
				System.out.printf("�ֹ��� �׸��մϴ�.");
				break;
			}
			System.out.println();
			System.out.println("�մ� �ֹ� �Ͻðڽ��ϱ� ?");
			System.out.print("<1> ī��� <2> īǪġ�� <3> �Ƹ޸�ī�� <4> �ֹ� �׸��ϱ� == >");
			
			order = od.nextInt();
		}
		
		/*
		do 
		{
			if (order == 4) 
			{
				System.out.println("�ֹ��� �׸��մϴ�.");
				break;
			}
			switch(order) 
				{
					case 1:
						System.out.println("ī��󶼸� �ֹ��Ͽ����ϴ�.");
						break;
					case 2:
						System.out.println("īǪġ�븦 �ֹ��Ͽ����ϴ�.");
						break;
					case 3:
						System.out.println("�Ƹ޸�ī�븦 �ֹ��Ͽ����ϴ�.");
						break;
					case 4:
					System.out.printf("�ֹ��Ͻ� Ŀ�� ���Խ��ϴ�.\n");
					break;
				default:
					System.out.printf("���� �޴��Դϴ�.\n");
					break;
			}
			if(order == 4) 
			{
				System.out.printf("�ֹ��� �׸��մϴ�.");
				break;
			}
			System.out.println();
			System.out.println("�մ� �ֹ� �Ͻðڽ��ϱ� ?");
			System.out.print("<1> ī��� <2> īǪġ�� <3> �Ƹ޸�ī�� <4> �ֹ� �׸��ϱ� == >");
			
			order = od.nextInt();
		}
		while(true);*/
	}
}