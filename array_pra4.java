package jang11;

import java.util.Scanner;

public class array_pra4 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int Input_array[] = new int [4];
		int sum = 0 , count = 1;
		
		/*
		for (int i = 0; i < Input_array.length; i++) 
		{
			System.out.printf("%d번째 숫자를 입력하세요 : ",i + 1);
			Input_array[i] = input.nextInt();
			sum += Input_array[i];
		}
		*/
		// for each
		for(int i : Input_array) 
		{
			System.out.printf("%d번째 숫자를 입력하세요 : ",count++);
			Input_array[i] = input.nextInt();
			sum += Input_array[i];
		}
		
		System.out.printf("합계 : %d",sum);
	}
}