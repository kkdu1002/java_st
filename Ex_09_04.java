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
			System.out.print("회원등급를 입력하세요. : ");
//			grade = x.readLine().toUpperCase().charAt(0);	
			grade = gr.next().toLowerCase().charAt(0);
			switch(grade) 
			{
//				case 'A':
				case 'a':
					System.out.println("우수 회원입니다.");
					break;
//				case 'B':
				case 'b':
					System.out.println("일반 회원입니다.");
					break;
				default:
					System.out.println("손님 입니다.");
			}
		}
	}
}