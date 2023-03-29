package jang7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_07_10
{
	public static void main(String[] args) throws IOException
	{
		Scanner y = new Scanner(System.in);
		String input;
		int start , i , j;
		
		System.out.print("입력");
		input = y.nextLine();
		
		for(i = 0; i < input.length(); i++) 
		{
			start = input.charAt(i) - '0';
			// 아스키값으로 바꾼후 빼서 입력값과 같게 한 후에 start에 넣음
			for(j = 0; j < start; j++)
			{
				System.out.printf("*");
			}
			System.out.println("");
		}
		/*
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int start , i , j;
		
		System.out.print("입력");
		input = x.readLine();
		
		for(i = 0; i < input.length(); i++) 
		{
			start = input.charAt(i) - '0';
			// 아스키값으로 바꾼후 빼서 입력값과 같게 한 후에 start에 넣음
			for(j = 0; j < start; j++)
			{
				System.out.printf("*");
			}
			System.out.println("");
		}*/
	}
}
		