package jang2;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		int input_num;
		Scanner num = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���");
		input_num = num.nextInt();
		
		if (input_num % 3 == 0)
			System.out.println("3�� ����Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");
		
		System.out.println("--------- ���� ������ ---------");
		System.out.println((input_num % 3 == 0)?("3�� ����Դϴ�."):("3�� ����� �ƴմϴ�."));
		
		num.close();
	}
}
