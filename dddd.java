package jang12;

import java.util.Scanner;

public class dddd 
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		int n, x , count = 0 , g[] ;
		n = a.nextInt();
		x = a.nextInt();
		g = new int [n];
		for (int i = 0; i < n; i++) 
		{
			g[i] = a.nextInt();
		}
		for (int i = 0; i < n; i++) 
		{
			if(g[i] < n) 
			{
				System.out.printf("%d",g[i]);
			}
		}
	}
}