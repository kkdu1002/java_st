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
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ",i + 1);
			Input_array[i] = input.nextInt();
			sum += Input_array[i];
		}
		*/
		// for each
		for(int i : Input_array) 
		{
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ",count++);
			Input_array[i] = input.nextInt();
			sum += Input_array[i];
		}
		
		System.out.printf("�հ� : %d",sum);
	}
}