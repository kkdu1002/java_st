package jang11;

import java.util.Scanner;

public class homework8
{
	public static void main(String[] args) 
	{
		String month[] =  {"January","February","March",
							"April","May","June",
							"July","August","September",
							"October","November","December"};
		Scanner input = new Scanner(System.in);
		int ran_mon , input_mon;
		
		ran_mon = (int)(Math.random() * 12 + 0);
		System.out.printf("������ %s\n",month[ran_mon]);
	
		while(true)
		{
			System.out.print("��� �Դϱ�? : " );
			input_mon = input.nextInt();
			
			if(ran_mon + 1 == input_mon) 
			{
				System.out.print("�����Դϴ�\n");
				break;
			}
			else
				System.out.print("�ƴմϴ�\n");
		}
	}
}