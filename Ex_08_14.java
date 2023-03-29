package jang8;

import java.util.Scanner;

public class Ex_08_14 
{
	public static void main(String[] args) 
	{
		int score ;
		Scanner soc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요.");
		score = soc.nextInt();
		
		if (score >= 90) 
		{
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("A등급 입니다.");
		}
		if(score < 90) 
		{
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("B학점 입니다.");
		}
	}
}