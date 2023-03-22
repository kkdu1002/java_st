package jang3;

import java.util.Scanner;

public class Whilesample {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int count = 0;
		double average = 0;
		
		for(int input_num = num.nextInt(); input_num !=0 ; count++)
		{
			average += input_num;
			input_num = num.nextInt();
		}
		
		System.out.printf("입력된 개수는 %d개이며 게이머 평균은 %f 입니다",count,average/count);
		
		/*
		int count = 0 , input_num;
		double average = 0;
		
		while((input_num = num.nextInt()) != 0)
		{
			average += input_num;
			count ++;
		}
		System.out.printf("입력된 개수는 %d개이며 게이머 평균은 %f 입니다",count,average/count);
		*/
		num.close();
	}
}
