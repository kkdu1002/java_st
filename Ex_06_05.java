package jang6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Ex_06_05 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int input_num , hap = 0 , i;
		
		System.out.print("�� �Է� : ");
		input_num = Integer.parseInt(x.readLine());
		
		for (i = 1; i <= input_num; i++)
			hap += i;
		System.out.printf("1���� %d������ �� : %d\n",input_num,hap);
			
		System.out.println("while ��");
		i = 0;
		hap = 0;
		
		while(i <= input_num) 
		{
			hap += i;
			i++;
		}
		System.out.printf("1���� %d������ �� : %d\n",input_num,hap);
		
		System.out.println("do while ��");
		i = 0;
		hap = 0;
		
		do 
		{
			hap += i;
			i++;
		}
		while(i <= input_num);
		System.out.printf("1���� %d������ �� : %d\n",input_num,hap);
	}
}
		/*
		// ---------- Scanner -----------
		
		Scanner num = new Scanner(System.in);
		System.out.println("for ��");
		System.out.print("�� �Է� : ");
		input_num = num.nextInt();
		
		for (i = 1; i <= input_num; i++)
			hap += i;
		System.out.printf("1���� %d������ �� : %d\n",input_num,hap);
			
		System.out.println("while ��");
		i = 0;
		hap = 0;
		
		while(i <= input_num) 
		{
			hap += i;
			i++;
		}
		System.out.printf("1���� %d������ �� : %d\n",input_num,hap);
		
		System.out.println("do while ��");
		i = 0;
		hap = 0;
		
		do 
		{
			hap += i;
			i++;
		}
		while(i <= input_num);
		System.out.printf("1���� %d������ �� : %d\n",input_num,hap);
	}
}
*/