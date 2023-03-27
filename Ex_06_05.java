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
		
		System.out.print("값 입력 : ");
		input_num = Integer.parseInt(x.readLine());
		
		for (i = 1; i <= input_num; i++)
			hap += i;
		System.out.printf("1에서 %d까지의 합 : %d\n",input_num,hap);
			
		System.out.println("while 문");
		i = 0;
		hap = 0;
		
		while(i <= input_num) 
		{
			hap += i;
			i++;
		}
		System.out.printf("1에서 %d까지의 합 : %d\n",input_num,hap);
		
		System.out.println("do while 문");
		i = 0;
		hap = 0;
		
		do 
		{
			hap += i;
			i++;
		}
		while(i <= input_num);
		System.out.printf("1에서 %d까지의 합 : %d\n",input_num,hap);
	}
}
		/*
		// ---------- Scanner -----------
		
		Scanner num = new Scanner(System.in);
		System.out.println("for 문");
		System.out.print("값 입력 : ");
		input_num = num.nextInt();
		
		for (i = 1; i <= input_num; i++)
			hap += i;
		System.out.printf("1에서 %d까지의 합 : %d\n",input_num,hap);
			
		System.out.println("while 문");
		i = 0;
		hap = 0;
		
		while(i <= input_num) 
		{
			hap += i;
			i++;
		}
		System.out.printf("1에서 %d까지의 합 : %d\n",input_num,hap);
		
		System.out.println("do while 문");
		i = 0;
		hap = 0;
		
		do 
		{
			hap += i;
			i++;
		}
		while(i <= input_num);
		System.out.printf("1에서 %d까지의 합 : %d\n",input_num,hap);
	}
}
*/