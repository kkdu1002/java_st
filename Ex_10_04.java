package jang10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_10_04 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{	
		// BufferedReader
		int first = 0 , second= 0 ,result = 0;
		String mult = " ";
		BufferedReader in_num = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�Ѵ� 999�� �ԷµǸ� ��������.");
		
A:		while(true) 
		{
			System.out.print("ù ��° ���� �Է� : ");
			first = Integer.parseInt(in_num.readLine());
		
			System.out.print("�� ��° ���� �Է� : ");
			second = Integer.parseInt(in_num.readLine());
		
			System.out.print("������ �Է�[+ - * /] : ");
			mult = in_num.readLine();
			
			if(first == 999 && second == 999) 
			{
				break A;
			}
			else if(mult.charAt(0) == '+') 
			{
				result = first + second;
			}
			else if(mult.charAt(0) == '-')
			{
				result = first - second;
			}
			else if(mult.charAt(0) == '*') 
			{
				result = first * second;
			}
			else if(mult.charAt(0) == '/') 
			{
			result = first / second;
			}
			else
				System.out.println("�߸��� ������ �Դϴ�.");
			System.out.printf("%d %s %d = %d\n", first , mult , second , result);
		}
	}
}
		// Scanner
/*		
		int first_s = 0, second_s = 0, result_s = 0;
		char mult_s;
	
		Scanner input_s = new Scanner(System.in);
		
		System.out.println("�Ѵ� 999�� �ԷµǸ� ��������.");
		
		while(first_s != 999 && second_s != 999) 
		{
			
			System.out.print("ù ��° ���� �Է� : ");
			first_s = input_s.nextInt();
			
			System.out.print("�� ��° ���� �Է� : ");
			second_s = input_s.nextInt();
			
			System.out.print("������ �Է�[+ - * /] : ");
			mult_s =  input_s.next().charAt(0);
			
			switch(mult_s) 
			{
				case '+':
					result_s = first_s + second_s;
					break;
				case '-':
					result_s = first_s - second_s;
					break;
				case '*':
					result_s = first_s * second_s;
					break;
				case '/':
					result_s = first_s / second_s;
					break;
				default
					System.out.println("�߸��� ������ �Դϴ�.");
					break;
			}
			System.out.printf("%d %c %d = %d\n", first_s , mult_s , second_s , result_s);
		}
	}
}*/