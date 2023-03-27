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
			System.out.print("더할 첫 번째 수 입력 : ");
			num1 = Integer.parseInt(x.readLine());
			System.out.print("더할 두 번째 수 입력 : ");
			num2 = Integer.parseInt(x.readLine());
			sum = num1 + num2;
			System.out.printf("%d + %d = %d\n",num1,num2,sum);
		}
		/*
		while(true)
		{
			System.out.print("더할 첫 번째 수 입력 : ");
			num1 = Integer.parseInt(x.readLine());
			System.out.print("더할 두 번째 수 입력 : ");
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
			System.out.print("더할 첫 번째 수 입력 : ");
			num1 = num.nextInt();
			System.out.print("더할 두 번째 수 입력 : ");
			num2 = num.nextInt();
			sum = num1 + num2;
			System.out.printf("%d + %d = %d\n",num1,num2,sum);
		}
		
		while(true)
		{
			System.out.print("더할 첫 번째 수 입력 : ");
			num1 = num.nextInt();
			System.out.print("더할 두 번째 수 입력 : ");
			num2 = num.nextInt();
			sum = num1 + num2;
			System.out.printf("%d + %d = %d\n",num1,num2,sum);
		}
	}
}
		*/