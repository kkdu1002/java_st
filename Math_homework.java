package jang12;

import java.util.Scanner;

public class Math_homework 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int replay , answer;
		
		System.out.println("�ϻ��Ʒ�!!!\n");
A:		while(true)
		{
			boolean x = true;
			int ran_sum = 0;
			int ran1 = (int)(Math.random() * 10) + 1;
			int ran2 = (int)(Math.random() * 10) + 1;
			int ran3 = (int)(Math.random() * 10) + 1;
			
			ran_sum = ran1 + ran2 + ran3;
			System.out.printf("%d + %d + %d = ",ran1,ran2,ran3);
			
			answer = input.nextInt();
			if(ran_sum == answer)
			{
				System.out.println("�� �߾��");
			}
			else
			{
				System.out.println("Ʋ�Ƚ��ϴ�!!");
			}
			System.out.println();
			
			while(x)
			{
				System.out.print("�ٽ� �ѹ�? <Yes-1 / NO-0> : ");
				replay = input.nextInt();
				if(replay == 0)
				{
					System.out.println("�׸�~~");
					break A;
				}
				else if(replay != 1)
				{
					System.out.println("�߸��� �Է��Դϴ�.");
				}
				else if(replay == 1)
				{
					x = false;
				}
			}
		}	
	}
}