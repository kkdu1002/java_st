package jang2;

import java.util.Scanner;

public class Scanner_ex {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("����,ü��,������ ��ĭ���� �и��Ͽ� ������� �Է��ϼ���");
		/*
		 * System.out.println("����� ���̴� " + a.nextInt() + "���Դϴ�.");
		 * System.out.println("����� ü���� " + a.nextDouble() + "kg�Դϴ�.");
		 * System.out.println("����� ������ " + a.nextDouble() + "cm�Դϴ�.");
		 */
		System.out.print("����� ���̴� ");
		String age = a.next();
		System.out.print("����� ü���� ");
		Double weight = a.nextDouble();
		System.out.print("����� ������ ");
		Double height = a.nextDouble();
		
		System.out.println("----- �Է� ���� ��� println -----");
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("����� ü���� "+ weight + "kg �Դϴ�.");
		System.out.println("����� ������ " + height + "cm �Դϴ�.");
		
		System.out.println("----- �Է� ���� ��� printf -----");
		System.out.printf("���� : %s�� �Դϴ�.\nü�� : %.1fkg �Դϴ�.\n���� : %.1fcm �Դϴ�. \n",age,weight,height);
		
		a.close();
	}
}