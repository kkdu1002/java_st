package jang6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Ex_06_07 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{	
		// BufferedReader 
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int dan , i;
		System.out.print("�� ���� ������� �Է� : ");
		dan = Integer.parseInt(x.readLine());
		
		System.out.println("----- for �� -----");
		for (i = 1; i < 10; i++)
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
		
		System.out.println("----- while �� -----");
		i = 1;
		
		while(i < 10) 
		{
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
			i++;
		}
			
		System.out.println("----- do while �� -----");
		i = 1;
		
		do 
		{
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
			i++;
		}
		while(i < 10);
	}
}
		// Scanner
/*		Scanner input = new Scanner(System.in);
		int dan , i;
		System.out.print("�� ���� ������� �Է� : ");
		dan = input.nextInt();
		
		System.out.println("----- for �� -----");
		for (i = 1; i < 10; i++)
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
		
		System.out.println("----- while �� -----");
		i = 1;
		while(i < 10) 
		{
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
			i++;
		}
			
		System.out.println("----- do while �� -----");
		i = 1;
		do 
		{
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
			i++;
		}
		while(i < 10);
	}
}
*/