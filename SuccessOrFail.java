package jang2;

import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���");
		score = sc.nextInt();
		
		if (score >= 80) 
			System.out.println("�հ��Դϴ�.");
		else
			System.out.println("���հ��Դϴ�.");
		
		System.out.println("----------���� ������---------");
		System.out.println((score >= 80)?("�հ��Դϴ�."):("���հ��Դϴ�."));
		
		sc.close();
	}
}
