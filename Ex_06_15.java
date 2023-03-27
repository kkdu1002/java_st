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
				
		System.out.print("글자를 입력 : ");
				
		String input;
		char input_ch;
		input = x.readLine();
				
		System.out.printf("입력된 문자열 : %s\n",input);
		System.out.printf("변환된 문자열 : ");
		for (int i = 1; i <= input.length(); i++) 
		{
			input_ch = input.charAt((input.length() - i));
			System.out.print(input_ch);
		}
	}
}
		// Scanner
	/*
		System.out.print("글자를 입력 : ");
		Scanner input = new Scanner(System.in);
		
		int len;
		String str;
		
		str = input.nextLine();
		len = str.length();
		
		System.out.printf("입력된 문자열 : %s\n",str);
		System.out.printf("변환된 문자열 : ");
		for (int i = 1; i <= len; i++) 
		{
			System.out.printf("%s",str.charAt((len) - i));
		}
	}
}
*/
		