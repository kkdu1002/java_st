package jang11;

import java.util.Scanner;

public class array2_pra08 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int row , col;
		int count = 1;
		
		System.out.print("�� ������ �Է�");
		row = input.nextInt();
		
		System.out.print("�� ������ �Է�");
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
		
		System.out.printf("aa[0][0]���� aa[%d][%d]���� ���\n",row,col);
		
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
