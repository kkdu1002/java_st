package jang9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_09_04 
{
	public static void main(String[] args) throws IOException 
	{
//		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		Scanner gr = new Scanner(System.in);
		char grade = ' ';
		
		while(true) 
		{
			System.out.print("ȸ����޸� �Է��ϼ���. : ");
//			grade = x.readLine().toUpperCase().charAt(0);	
			grade = gr.next().toLowerCase().charAt(0);
			switch(grade) 
			{
//				case 'A':
				case 'a':
					System.out.println("��� ȸ���Դϴ�.");
					break;
//				case 'B':
				case 'b':
					System.out.println("�Ϲ� ȸ���Դϴ�.");
					break;
				default:
					System.out.println("�մ� �Դϴ�.");
			}
		}
	}
}