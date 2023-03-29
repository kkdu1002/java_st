package jang8;

import java.util.Random;

public class homework 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int big , small, i;

		for(i = 1; i <= 15; i++) 
		{	// 대문자 = 65 ~ 90
			big = r.nextInt(26) + 65;
			System.out.printf("%s\t",(char)big);
			if(i % 5 == 0) 
			{
				System.out.println();
			}		
		}
		
		System.out.printf("\n");
		
		for(i = 1; i <= 15; i++) 
		{	// 소문자 97 ~ 122
			small = r.nextInt(26) + 97;
			System.out.printf("%s\t",(char)small);
			if(i % 5 == 0) 
			{
				System.out.println();
			}
		}
	}
}