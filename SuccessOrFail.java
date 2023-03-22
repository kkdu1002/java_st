package jang2;

import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요");
		score = sc.nextInt();
		
		if (score >= 80) 
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
		
		System.out.println("----------삼항 연산자---------");
		System.out.println((score >= 80)?("합격입니다."):("불합격입니다."));
		
		sc.close();
	}
}
