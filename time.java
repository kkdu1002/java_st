package jang2;

import java.util.Scanner;

public class time {
	public static void main(String[] agrs) {
		int input_time , sec , min , hour;
		Scanner time = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		input_time = time.nextInt();
		
		sec = input_time % 60;
		min = (input_time / 60) % 60;
		hour = (input_time / 60) / 60;
		
		System.out.print(input_time + "�ʴ� ");
		System.out.print(hour + "�ð� ");
		System.out.print(min + "�� ");
		System.out.print(sec + "���Դϴ�");
		
		time.close();
	}
}
