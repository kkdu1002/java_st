package jang7;

import java.util.Scanner;

public class Ex_07_08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int first , end , mult ,start ,result = 0;
		
		System.out.print("�հ��� ���۰� == > ");
		first = input.nextInt();
		System.out.print("�հ��� ���� == > ");
		end = input.nextInt();
		System.out.print("��� == > ");
		mult = input.nextInt();
	
		for (start = first; start <= end ; start++) 
		{
			if(start % mult == 0)
				result += start;
		}
		System.out.printf("%d���� %d������ %d����� �հ� : %d",first , end , mult , result);
	}
}