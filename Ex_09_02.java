package jang9;

import java.util.Random;

public class Ex_09_02
{
	public static void main(String[] args) 
	{
		int num;
//		num = ((int)(Math.random() * 6) + 1);
		
		Random r = new Random();
		num = r.nextInt(6) + 1;
		System.out.println(num);
		/* 
		 switch(������ , byte , short , char , in) , String , ������길 ����
		 long , float , double , boolean ������ ��� �� �� ����
		 case ���� X , ���� X : switch���ǳ��� ��� �� �� �ִ� ���� �;���
		 */
		switch(num) 
		{
			case 1:
				System.out.println("1���� ���Խ��ϴ�.");
				break;
			case 2:
				System.out.println("2���� ���Խ��ϴ�.");
				break;
			case 3:
				System.out.println("3���� ���Խ��ϴ�.");
				break;
			case 4:
				System.out.println("4���� ���Խ��ϴ�.");
				break;
			case 5:
				System.out.println("5���� ���Խ��ϴ�.");
				break;
			case 6:
				System.out.println("6���� ���Խ��ϴ�.");
				break;
		}
	}
}

