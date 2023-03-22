package jang2;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		int input_num;
		Scanner num = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		input_num = num.nextInt();
		
		if (input_num % 3 == 0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		
		System.out.println("--------- 삼항 연산자 ---------");
		System.out.println((input_num % 3 == 0)?("3의 배수입니다."):("3의 배수가 아닙니다."));
		
		num.close();
	}
}
