package jang9;

import java.util.Scanner;

public class Ex_09_10 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String input;
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");

		do 
		{
			System.out.printf(">");
			input = in.nextLine().toLowerCase();
			System.out.printf("%s\n",input);
		}
		while(!(input.equals("q")));
		
		System.out.println("프로그램 종료");
	}
}