package jang2;

import java.util.Scanner;

public class time {
	public static void main(String[] agrs) {
		int input_time , sec , min , hour;
		Scanner time = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		input_time = time.nextInt();
		
		sec = input_time % 60;
		min = (input_time / 60) % 60;
		hour = (input_time / 60) / 60;
		
		System.out.print(input_time + "초는 ");
		System.out.print(hour + "시간 ");
		System.out.print(min + "분 ");
		System.out.print(sec + "초입니다");
		
		time.close();
	}
}
