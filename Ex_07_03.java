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
		
		System.out.print("���� ù ��° �� �Է� :");
		first = Integer.parseInt(x.readLine());
		System.out.print("���� �� ��° �� �Է� :");
		second = Integer.parseInt(x.readLine());
		
		while(first != 0 || second != 0) 
		{
			result = first + second;
			System.out.printf("%d + %d = %d\n",first,second,result);
			
			System.out.print("���� ù ��° �� �Է� :");
			first = Integer.parseInt(x.readLine());
			
			System.out.print("���� �� ��° �� �Է� :");
			second = Integer.parseInt(x.readLine());
		}
		System.out.print("0�� �Է��ؼ� �ݺ����� Ż���߽��ϴ�.");
		/*
		Scanner num = new Scanner(System.in);
		int first , second , result;
		
		System.out.print("���� ù ��° �� �Է� :");
		first = num.nextInt();
		System.out.print("���� �� ��° �� �Է� :");
		second = num.nextInt();
		
		while(first != 0 || second != 0) 
		{
			result = first + second;
			System.out.printf("%d + %d = %d\n",first,second,result);
			
			System.out.print("���� ù ��° �� �Է� :");
			first = num.nextInt();
			System.out.print("���� �� ��° �� �Է� :");
			second = num.nextInt();
		}
		System.out.print("0�� �Է��ؼ� �ݺ����� Ż���߽��ϴ�.");
	*/
	}
}
