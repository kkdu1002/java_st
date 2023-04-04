package jang11;

import java.util.Scanner;

public class array2_pra10 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int row , col , ran , array[][];
		
		System.out.print("행수 : ");
		row = input.nextInt();
		
		System.out.print("열수 : ");
		col = input.nextInt();
		
		array = new int [row][col];
		
		for(int i = 0; i < row ; i++) 
		{
			for(int j = 0; j < col ; j++) 
			{
				ran = (int) (Math.random()*100 + 0);
				array[i][j] = ran;
				System.out.printf("x[%d][%d] = %d\n",i,j,ran);
			}	
		}
	}
}