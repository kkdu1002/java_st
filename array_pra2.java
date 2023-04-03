package jang11;

import java.util.Scanner;

public class array_pra2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
	//  1 선언 메모리 할당 디폴트 초기화
		int num[] = new int[5]; // 00000
		num[0] = 20;  // 초기화
	
	//  2 선언 메모리 할당 초기화
		int num1[];
		num1 = new int[5]; // 메모리 할당 디폴트 초기화
		num1[0] = 20;
	
	//  3 선언 메모리 할당 초기화
		int num2[] = {10,20,30,40,50};
	
	//  4 선언 메모리 할당 초기화
		int num3[];
		num3 = new int[] {10,20,30,40,50}; // 메모리 할당 초기화
		
		int max = 0 , min = 999;
		double sum = 0;
		
		
		for (int k = 0;k < num.length; k++) 
		{
			num[k] = input.nextInt();
			sum += num[k];
			if (max < num[k])
				max = num[k];
			else if(min > num[k])
				min = num[k];
		}
		System.out.printf("평균 : %.1f\n",sum/num.length);
		System.out.printf("최대값 : %d\n",max);
		System.out.printf("최소값 : %d\n",min);
	}
}