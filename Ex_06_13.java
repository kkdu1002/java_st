package jang6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Ex_06_13 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int num1 , num2 , sum = 0;
		
		// BufferReader
		for(;;) 
		{
			System.out.print("���� ù ��° �� �Է� : ");
			num1 = Integer.parseInt(x.readLine());
			System.out.print("���� �� ��° �� �Է� : ");
			num2 = Integer.parseInt(x.readLine());
			sum = num1 + num2;
			System.out.printf("%d + %d = %d\n",num1,num2,sum);
		}
		/*
		while(true)
		{
			System.out.print("���� ù ��° �� �Է� : ");
			num1 = Integer.parseInt(x.readLine());
			System.out.print("���� �� ��° �� �Է� : ");
			num2 = Integer.parseInt(x.readLine());
			sum = num1 + num2;
			System.out.printf("%d + %d = %d\n",num1,num2,sum);
		}
		*/
	}
}
		// Scanner
		/*
		Scanner num = new Scanner(System.in);
		int num1 , num2 , sum = 0;
		
		for(;;) 
		{
			System.out.print("���� ù ��° �� �Է� : ");
			num1 = num.nextInt();
			System.out.print("���� �� ��° �� �Է� : ");
			num2 = num.nextInt();
			sum = num1 + num2;
			System.out.printf("%d + %d = %d\n",num1,num2,sum);
		}
		
		while(true)
		{
			System.out.print("���� ù ��° �� �Է� : ");
			num1 = num.nextInt();
			System.out.print("���� �� ��° �� �Է� : ");
			num2 = num.nextInt();
			sum = num1 + num2;
			System.out.printf("%d + %d = %d\n",num1,num2,sum);
		}
	}
}
		*/