package jang6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
 
public class Ex_06_08 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int dan , i , start;
		System.out.print("�� ���� ������� �Է� : ");
		dan = Integer.parseInt(x.readLine());
		System.out.println("for ��");
		
		for(start = 2; start <= dan; start++) 
		{
			System.out.printf("----- %d �� -----\n",start);
			for(i = 1; i < 10; i++)
				System.out.printf("%d * %d = %d\n",start,i,start*i);
		}
		System.out.println("while ��");
		start = 2;
		
		while(start <= dan) 
		{
			System.out.printf("----- %d �� -----\n",start);
			for(i = 1; i < 10; i++)
				System.out.printf("%d * %d = %d\n",start,i,start*i);
			start ++;
		}
		
		System.out.println("do while ��");
		start = 2;
		
		do 
		{
			System.out.printf("----- %d �� -----\n",start);
			for(i = 1; i < 10; i++)
				System.out.printf("%d * %d = %d\n",start,i,start*i);
			start ++;
		}
		while(start <= dan);
	}
}
		/*
		Scanner input = new Scanner(System.in);
		int dan , i , start;
		System.out.print("�� ���� ������� �Է� : ");
		dan = input.nextInt();
		System.out.println("for ��");
		
		for(start = 2; start <= dan; start++) 
		{
			System.out.printf("----- %d �� -----\n",start);
			for(i = 1; i < 10; i++)
				System.out.printf("%d * %d = %d\n",start,i,start*i);
		}
		System.out.println("while ��");
		start = 2;
		
		while(start <= dan) 
		{
			System.out.printf("----- %d �� -----\n",start);
			for(i = 1; i < 10; i++)
				System.out.printf("%d * %d = %d\n",start,i,start*i);
			start ++;
		}
		
		System.out.println("do while ��");
		start = 2;
		
		do 
		{
			System.out.printf("----- %d �� -----\n",start);
			for(i = 1; i < 10; i++)
				System.out.printf("%d * %d = %d\n",start,i,start*i);
			start ++;
		}
		while(start <= dan);
	}
}
*/