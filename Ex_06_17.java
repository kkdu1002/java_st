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
			System.out.print("����� ù��° ���� �Է� : ");
			first = Integer.parseInt(z.readLine());
			
			System.out.print("����� �ι�° ���� �Է� : ");
			second = Integer.parseInt(z.readLine());
			
			System.out.print("����� �����ڸ� �Է� : ");
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
					System.out.print("����� �����ڰ� �߸� �ԷµǾ����ϴ�\n. ");
			}
			System.out.printf("%d %s %d = %d �Դϴ�.\n",first , mult , second , end);
		}
		
		/*
		String mult = " ";
		
		while(true) 
		{
			System.out.print("����� ù��° ���� �Է� : ");
			first = Integer.parseInt(z.readLine());
			
			System.out.print("����� �ι�° ���� �Է� : ");
			second = Integer.parseInt(z.readLine());
			
			System.out.print("����� �����ڸ� �Է� : ");
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
					System.out.print("����� �����ڰ� �߸� �ԷµǾ����ϴ�\n. ");
			}
			System.out.printf("%d %s %d = %d �Դϴ�.\n",first , mult , second , end);
		}
		*/
		
		
/*		Scanner x = new Scanner(System.in);
		int first ,  second , end = 0;
		String mult = " ";
		
		while(true) 
		{
			System.out.print("����� ù��° ���� �Է� : ");
			first = x.nextInt();
			
			System.out.print("����� �ι�° ���� �Է� : ");
			second = x.nextInt();
			
			System.out.print("����� �����ڸ� �Է� : ");
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
					System.out.print("����� �����ڰ� �߸� �ԷµǾ����ϴ�\n. ");
			}
			System.out.printf("%d %s %d = %d �Դϴ�.\n",first , mult , second , end);
		}
		*/
		
		/*
		char mult = ' ';
		
		while(true) 
		{
			System.out.print("����� ù��° ���� �Է� : ");
			first = x.nextInt();
			
			System.out.print("����� �ι�° ���� �Է� : ");
			second = x.nextInt();
			
			System.out.print("����� �����ڸ� �Է� : ");
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
					System.out.print("����� �����ڰ� �߸� �ԷµǾ����ϴ�\n. ");
			}
			System.out.printf("%d %s %d = %d �Դϴ�.\n",first , mult , second , end);
		}*/
	}
}