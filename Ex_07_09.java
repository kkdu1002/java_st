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
		
		System.out.print("문자열을 입력 : ");
		input = x.readLine();
		
		for (i = 0; i < input.length(); i++) 
		{
			 // 대문자 65 ~ 90
			if((input.charAt(i)) >= 'A' && (input.charAt(i)) <= 'Z') 
			{
				count_big++;
			} // 소문자 97 ~ 122
			else if((input.charAt(i)) >= 'a' && (input.charAt(i)) <= 'z') 
			{
				count_small++;
			} //숫자 48 ~ 57
			else if((input.charAt(i)) >= '0' && (input.charAt(i)) <= '9') 
			{
				count_num++;
			}
		}
		System.out.printf("대문자 %d개 , 소문자 %d개 , 숫자 %d개",count_big , count_small , count_num);
	}
}			
		/*
		for (i = 0; i < input.length(); i++) 
		{
			 // 대문자 65 ~ 90
			if((int)(input.charAt(i)) >= 65 && (int)(input.charAt(i)) <= 90) 
			{
				count_big++;
			} // 소문자 97 ~ 122
			else if((int)(input.charAt(i)) >= 97 && (int)(input.charAt(i)) <= 122) 
			{
				count_small++;
			} //숫자 48 ~ 57
			else if((int)(input.charAt(i)) >= 48 && (int)(input.charAt(i)) <= 57) 
			{
				count_num++;
			}
		}
		System.out.printf("대문자 %d개 , 소문자 %d개 , 숫자 %d개",count_big , count_small , count_num);
	}
}
*/
		/*
		Scanner y = new Scanner(System.in);
		String input;
		int i , count_big = 0, count_small = 0, count_num = 0;
		System.out.print("문자열을 입력 : ");
		input = y.nextLine();

		System.out.print(input);
		for (i = 0; i < input.length(); i++) 
		{
			 // 대문자 65 ~ 90
			if((input.charAt(i)) >= 'A' && (input.charAt(i)) <= 'Z') 
			{
				count_big++;
			} // 소문자 97 ~ 122
			else if((input.charAt(i)) >= 'a' && (input.charAt(i)) <= 'z') 
			{
				count_small++;
			} //숫자 48 ~ 57
			else if((input.charAt(i)) >= '0' && (input.charAt(i)) <= '9') 
			{
				count_num++;
			}
		}
		
		for (i = 0; i < input.length(); i++) 
		{
			 // 대문자 65 ~ 90
			if((int)(input.charAt(i)) >= 65 && (int)(input.charAt(i)) <= 90) 
			{
				count_big++;
			} // 소문자 97 ~ 122
			else if((int)(input.charAt(i)) >= 97 && (int)(input.charAt(i)) <= 122) 
			{
				count_small++;
			} //숫자 48 ~ 57
			else if((int)(input.charAt(i)) >= 48 && (int)(input.charAt(i)) <= 57) 
			{
				count_num++;
			}
		}
		
		System.out.printf("대문자 %d개 , 소문자 %d개 , 숫자 %d개",count_big , count_small , count_num);
	}
}
	*/	
		
		
