package jang12;

import java.util.Scanner;

public class test06 
{		//  난수가 : 짝수이면 ♬ , 홀수이면 * 로 표시하시오.
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = input.nextInt();
		int array[] = new int[num];
		int ran_num;
		
		for(int i = 0; i < num; i++) 
		{
			ran_num = (int) (Math.random() * 10 + 1);
			array[i] = ran_num;
			System.out.printf("array[%d] : ",i);
			
			for(int j = 0; j < ran_num; j++) 
			{
				if(array[i] % 2 == 0) 
				{
					System.out.printf("♬");
				}
				else 
				{
				System.out.printf("*");
				}
			}
			System.out.println();
		}
	}
}