package jang9;

import java.io.IOException;
import java.util.Scanner;

public class Ex_09_09 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner in = new Scanner(System.in);
		int input = 0 , speed = 0;
		
A:		while(true) 
		{
			if(input != 10 && input != 13) 
			{
				System.out.println("--------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("--------------------");
				System.out.printf("���� : ");
			}
			
			input = System.in.read();
//			input = in.nextInt();
			
			if(input == 1) 
			{
				speed ++;
				System.out.printf("����ӵ� = %d\n",speed);
			}
			else if(input == 2) 
			{
				speed --;
				System.out.printf("����ӵ� = %d\n",speed);
			}
			else if(input == 3) 
			{
				System.out.printf("���α׷� ����\n");
				break A;
			}
		}
	}
}