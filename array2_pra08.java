package jang11;

import java.util.Scanner;

public class array2_pra08 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int row , col;
		int count = 1;
		
		System.out.print("행 개수를 입력");
		row = input.nextInt();
		
		System.out.print("열 개수를 입력");
		col = input.nextInt();
		
		int array[][] = new int[row][col];
		
		for(int i = 0; i < row; i++) 
		{
			for(int j = 0 ; j < col; j++) 
			{
				array[i][j] = count;
				count++;
			}
		}
		
		System.out.printf("aa[0][0]부터 aa[%d][%d]까지 출력\n",row,col);
		
		for(int i = 0; i < row; i++) 
		{
			for(int j = 0 ; j < col; j++) 
			{
				System.out.printf("%d\t",array[i][j]);
			}
			System.out.println();
		}
	}
}
