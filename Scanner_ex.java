package jang2;

import java.util.Scanner;

public class Scanner_ex {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("나이,체중,신장을 빈칸으로 분리하여 순서대로 입력하세요");
		/*
		 * System.out.println("당신의 나이는 " + a.nextInt() + "살입니다.");
		 * System.out.println("당신의 체중은 " + a.nextDouble() + "kg입니다.");
		 * System.out.println("당신의 신장은 " + a.nextDouble() + "cm입니다.");
		 */
		System.out.print("당신의 나이는 ");
		String age = a.next();
		System.out.print("당신의 체중은 ");
		Double weight = a.nextDouble();
		System.out.print("당신의 신장은 ");
		Double height = a.nextDouble();
		
		System.out.println("----- 입력 내용 출력 println -----");
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		System.out.println("당신의 체중은 "+ weight + "kg 입니다.");
		System.out.println("당신의 신장은 " + height + "cm 입니다.");
		
		System.out.println("----- 입력 내용 출력 printf -----");
		System.out.printf("나이 : %s살 입니다.\n체중 : %.1fkg 입니다.\n신장 : %.1fcm 입니다. \n",age,weight,height);
		
		a.close();
	}
}