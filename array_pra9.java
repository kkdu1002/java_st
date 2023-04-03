package jang11;

import java.util.Scanner;

public class array_pra9 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int data , max = 0;
		
		System.out.print("입력할 데이터 갯수 : ");
		data = input.nextInt();
		
		int array[] = new int[data];
		
		System.out.print("데이터 입력 [공백 구분] : ");
		
		
		for(int i = 0; i < array.length; i++) 
		{
			array[i] = input.nextInt();
			if (array[i] > max)
				max = array[i];
		}
		System.out.printf("가장 큰 수 : %d",max);
	}
}