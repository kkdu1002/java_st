package jang9;

import java.util.Scanner;

public class Ex_09_10 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String input;
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");

		do 
		{
			System.out.printf(">");
			input = in.nextLine().toLowerCase();
			System.out.printf("%s\n",input);
		}
		while(!(input.equals("q")));
		
		System.out.println("���α׷� ����");
	}
}