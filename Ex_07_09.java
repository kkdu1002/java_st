package jang7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
public class Ex_07_09 
{
	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int i , count_big = 0, count_small = 0, count_num = 0;
		
		System.out.print("���ڿ��� �Է� : ");
		input = x.readLine();
		
		for (i = 0; i < input.length(); i++) 
		{
			 // �빮�� 65 ~ 90
			if((input.charAt(i)) >= 'A' && (input.charAt(i)) <= 'Z') 
			{
				count_big++;
			} // �ҹ��� 97 ~ 122
			else if((input.charAt(i)) >= 'a' && (input.charAt(i)) <= 'z') 
			{
				count_small++;
			} //���� 48 ~ 57
			else if((input.charAt(i)) >= '0' && (input.charAt(i)) <= '9') 
			{
				count_num++;
			}
		}
		System.out.printf("�빮�� %d�� , �ҹ��� %d�� , ���� %d��",count_big , count_small , count_num);
	}
}			
		/*
		for (i = 0; i < input.length(); i++) 
		{
			 // �빮�� 65 ~ 90
			if((int)(input.charAt(i)) >= 65 && (int)(input.charAt(i)) <= 90) 
			{
				count_big++;
			} // �ҹ��� 97 ~ 122
			else if((int)(input.charAt(i)) >= 97 && (int)(input.charAt(i)) <= 122) 
			{
				count_small++;
			} //���� 48 ~ 57
			else if((int)(input.charAt(i)) >= 48 && (int)(input.charAt(i)) <= 57) 
			{
				count_num++;
			}
		}
		System.out.printf("�빮�� %d�� , �ҹ��� %d�� , ���� %d��",count_big , count_small , count_num);
	}
}
*/
		/*
		Scanner y = new Scanner(System.in);
		String input;
		int i , count_big = 0, count_small = 0, count_num = 0;
		System.out.print("���ڿ��� �Է� : ");
		input = y.nextLine();

		System.out.print(input);
		for (i = 0; i < input.length(); i++) 
		{
			 // �빮�� 65 ~ 90
			if((input.charAt(i)) >= 'A' && (input.charAt(i)) <= 'Z') 
			{
				count_big++;
			} // �ҹ��� 97 ~ 122
			else if((input.charAt(i)) >= 'a' && (input.charAt(i)) <= 'z') 
			{
				count_small++;
			} //���� 48 ~ 57
			else if((input.charAt(i)) >= '0' && (input.charAt(i)) <= '9') 
			{
				count_num++;
			}
		}
		
		for (i = 0; i < input.length(); i++) 
		{
			 // �빮�� 65 ~ 90
			if((int)(input.charAt(i)) >= 65 && (int)(input.charAt(i)) <= 90) 
			{
				count_big++;
			} // �ҹ��� 97 ~ 122
			else if((int)(input.charAt(i)) >= 97 && (int)(input.charAt(i)) <= 122) 
			{
				count_small++;
			} //���� 48 ~ 57
			else if((int)(input.charAt(i)) >= 48 && (int)(input.charAt(i)) <= 57) 
			{
				count_num++;
			}
		}
		
		System.out.printf("�빮�� %d�� , �ҹ��� %d�� , ���� %d��",count_big , count_small , count_num);
	}
}
	*/	
		
		
