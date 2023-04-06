package jang12;

import java.util.Scanner;

public class test04
{  // 배열 요소 반대로 바꾸기
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int array_num;
		System.out.print("요소 수 : ");
		array_num = input.nextInt();
		
		int array[] = new int[array_num];
		int ran_num;
		int stack; // 값 저장

		for(int i = 0; i < array_num; i++) //배열에 랜덤값 저장하기
		{
			ran_num = (int) (Math.random() * 100 + 1);
			array[i] = ran_num;
			System.out.printf("array[%d] = %d\n",i,array[i]);
		}
		
		for(int i = 0; i < (array_num / 2) ; i++) //요소를 반대로 바꾸기
		{
				stack = array[array_num - i - 1];
				array[array_num - i - 1] = array[i];
				array[i] = stack;
		}
		
		System.out.printf("-------------------\n");
		System.out.printf("요소의 나열을 반대로 바꾸었습니다.\n");
		
		for(int i = 0; i < array_num; i++)
		{
			System.out.printf("array[%d] = %d\n",i,array[i]);
		}
	}
}