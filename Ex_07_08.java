package jang7;

import java.util.Scanner;

public class Ex_07_08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int first , end , mult ,start ,result = 0;
		
		System.out.print("합계의 시작값 == > ");
		first = input.nextInt();
		System.out.print("합계의 끝값 == > ");
		end = input.nextInt();
		System.out.print("배수 == > ");
		mult = input.nextInt();
	
		for (start = first; start <= end ; start++) 
		{
			if(start % mult == 0)
				result += start;
		}
		System.out.printf("%d부터 %d까지의 %d배수의 합계 : %d",first , end , mult , result);
	}
}