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
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("--------------------");
				System.out.printf("선택 : ");
			}
			
			input = System.in.read();
//			input = in.nextInt();
			
			if(input == 1) 
			{
				speed ++;
				System.out.printf("현재속도 = %d\n",speed);
			}
			else if(input == 2) 
			{
				speed --;
				System.out.printf("현재속도 = %d\n",speed);
			}
			else if(input == 3) 
			{
				System.out.printf("프로그램 종료\n");
				break A;
			}
		}
	}
}