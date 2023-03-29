package jang7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_07_03 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int first , second , result;
		
		System.out.print("더할 첫 번째 수 입력 :");
		first = Integer.parseInt(x.readLine());
		System.out.print("더할 두 번째 수 입력 :");
		second = Integer.parseInt(x.readLine());
		
		while(first != 0 || second != 0) 
		{
			result = first + second;
			System.out.printf("%d + %d = %d\n",first,second,result);
			
			System.out.print("더할 첫 번째 수 입력 :");
			first = Integer.parseInt(x.readLine());
			
			System.out.print("더할 두 번째 수 입력 :");
			second = Integer.parseInt(x.readLine());
		}
		System.out.print("0을 입력해서 반복문을 탈출했습니다.");
		/*
		Scanner num = new Scanner(System.in);
		int first , second , result;
		
		System.out.print("더할 첫 번째 수 입력 :");
		first = num.nextInt();
		System.out.print("더할 두 번째 수 입력 :");
		second = num.nextInt();
		
		while(first != 0 || second != 0) 
		{
			result = first + second;
			System.out.printf("%d + %d = %d\n",first,second,result);
			
			System.out.print("더할 첫 번째 수 입력 :");
			first = num.nextInt();
			System.out.print("더할 두 번째 수 입력 :");
			second = num.nextInt();
		}
		System.out.print("0을 입력해서 반복문을 탈출했습니다.");
	*/
	}
}
