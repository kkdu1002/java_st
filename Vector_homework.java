package jang12;

import java.util.Scanner;
import java.util.Vector;

public class Vector_homework 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		double max = 0;
		
		System.out.println("수입력 : ");
		for(int i = 0; i < 5 ; i++)
		{
			v.add(input.nextInt());
			if(max < v.get(i))
			{
				max = v.get(i);
			}
		}
		System.out.println("가장 큰 수는 : " + max);
	}
}