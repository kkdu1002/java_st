package jang12;

import java.util.Scanner;

public class array_calendar 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int mon_len []= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day[] = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		
		System.out.print("월 >> ");
		int mon = input.nextInt();
		System.out.println("\t\t [2023년" + mon + "월]");
		System.out.println(" 일\t월\t화\t수\t목\t금\t토");
		System.out.println("======================================================");
		
		// 시작위치만큼 공백 처리
		for(int i = 0; i < day[mon - 1]; i++) 
		{
			System.out.printf("\t");
		}
		 // 4월을 입력받으면 1~30일 까지 출력 (반복) , mon_len[mon - 1] 입력달의 마지막 일수
		for(int i = 0; i < mon_len[mon - 1]; i++) 
		{
			System.out.printf(" %d\t",i + 1);
			if(i  % 7 == 6 - day[mon - 1])
			{
				System.out.println();
			}	
		}	
		System.out.println("\n======================================================");
	}
}