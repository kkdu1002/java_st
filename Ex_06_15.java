package jang6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;


public class Ex_06_15 
{
	public static void main(String[] args) throws IOException 
	{
		// BuuferedReader
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.print("���ڸ� �Է� : ");
				
		String input;
		char input_ch;
		input = x.readLine();
				
		System.out.printf("�Էµ� ���ڿ� : %s\n",input);
		System.out.printf("��ȯ�� ���ڿ� : ");
		for (int i = 1; i <= input.length(); i++) 
		{
			input_ch = input.charAt((input.length() - i));
			System.out.print(input_ch);
		}
	}
}
		// Scanner
	/*
		System.out.print("���ڸ� �Է� : ");
		Scanner input = new Scanner(System.in);
		
		int len;
		String str;
		
		str = input.nextLine();
		len = str.length();
		
		System.out.printf("�Էµ� ���ڿ� : %s\n",str);
		System.out.printf("��ȯ�� ���ڿ� : ");
		for (int i = 1; i <= len; i++) 
		{
			System.out.printf("%s",str.charAt((len) - i));
		}
	}
}
*/
		