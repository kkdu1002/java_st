package jang6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Ex_06_17 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
		int first ,  second , end = 0;
		char mult = ' ';
		
		while(true) 
		{
			System.out.print("계산할 첫번째 수를 입력 : ");
			first = Integer.parseInt(z.readLine());
			
			System.out.print("계산할 두번째 수를 입력 : ");
			second = Integer.parseInt(z.readLine());
			
			System.out.print("계산할 연산자를 입력 : ");
			mult = z.readLine().charAt(0);
			
			switch(mult) 
			{
				case '+':
					end = first + second;
					break;
				case '-':
					end = first - second;
					break;
				case '*':
					end = first * second;
					break;
				case '/':
					end = first / second;
					break;
				case '%':
					end = first % second;
					break;
				default:
					System.out.print("계산할 연산자가 잘못 입력되었습니다\n. ");
			}
			System.out.printf("%d %s %d = %d 입니다.\n",first , mult , second , end);
		}
		
		/*
		String mult = " ";
		
		while(true) 
		{
			System.out.print("계산할 첫번째 수를 입력 : ");
			first = Integer.parseInt(z.readLine());
			
			System.out.print("계산할 두번째 수를 입력 : ");
			second = Integer.parseInt(z.readLine());
			
			System.out.print("계산할 연산자를 입력 : ");
			mult = z.readLine();
			
			switch(mult) 
			{
				case "+":
					end = first + second;
					break;
				case "-":
					end = first - second;
					break;
				case "*":
					end = first * second;
					break;
				case "/":
					end = first / second;
					break;
				case "%":
					end = first % second;
					break;
				default:
					System.out.print("계산할 연산자가 잘못 입력되었습니다\n. ");
			}
			System.out.printf("%d %s %d = %d 입니다.\n",first , mult , second , end);
		}
		*/
		
		
/*		Scanner x = new Scanner(System.in);
		int first ,  second , end = 0;
		String mult = " ";
		
		while(true) 
		{
			System.out.print("계산할 첫번째 수를 입력 : ");
			first = x.nextInt();
			
			System.out.print("계산할 두번째 수를 입력 : ");
			second = x.nextInt();
			
			System.out.print("계산할 연산자를 입력 : ");
			mult = x.next();
			
			switch(mult) 
			{
				case "+":
					end = first + second;
					break;
				case "-":
					end = first - second;
					break;
				case "*":
					end = first * second;
					break;
				case "/":
					end = first / second;
					break;
				case "%":
					end = first % second;
					break;
				default:
					System.out.print("계산할 연산자가 잘못 입력되었습니다\n. ");
			}
			System.out.printf("%d %s %d = %d 입니다.\n",first , mult , second , end);
		}
		*/
		
		/*
		char mult = ' ';
		
		while(true) 
		{
			System.out.print("계산할 첫번째 수를 입력 : ");
			first = x.nextInt();
			
			System.out.print("계산할 두번째 수를 입력 : ");
			second = x.nextInt();
			
			System.out.print("계산할 연산자를 입력 : ");
			mult = x.next().charAt(0);
			
			switch(mult) 
			{
				case '+':
					end = first + second;
					break;
				case '-':
					end = first - second;
					break;
				case '*':
					end = first * second;
					break;
				case '/':
					end = first / second;
					break;
				case '%':
					end = first % second;
					break;
				default:
					System.out.print("계산할 연산자가 잘못 입력되었습니다\n. ");
			}
			System.out.printf("%d %s %d = %d 입니다.\n",first , mult , second , end);
		}*/
	}
}