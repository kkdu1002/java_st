package jang8;

import java.util.Random;

public class Ex_08_15 
{
	public static void main(String[] args) 
	{
			while(true) 
			{
		//		int num = ((int)(Math.random() * 6) + 1);
				int num;
				Random r = new Random();
				num = r.nextInt(6) + 1;
				System.out.println(num);
				if (num == 1) 
				{
					System.out.println("1���� ���Խ��ϴ�.");
					break;
				} 
				else if (num == 2) 
				{
					System.out.println("2���� ���Խ��ϴ�.");
				} 
				else if (num == 3) 
				{
					System.out.println("3���� ���Խ��ϴ�.");
				} 
				else if (num == 4) 
				{
					System.out.println("4���� ���Խ��ϴ�.");
				} 
				else if (num == 5) 
				{
					System.out.println("5���� ���Խ��ϴ�.");
				} 
				else if (num == 6) 
				{
					System.out.println("6���� ���Խ��ϴ�.");
				}
			}
	}
}

