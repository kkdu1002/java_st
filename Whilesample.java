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
		
		System.out.printf("�Էµ� ������ %d���̸� ���̸� ����� %f �Դϴ�",count,average/count);
		
		/*
		int count = 0 , input_num;
		double average = 0;
		
		while((input_num = num.nextInt()) != 0)
		{
			average += input_num;
			count ++;
		}
		System.out.printf("�Էµ� ������ %d���̸� ���̸� ����� %f �Դϴ�",count,average/count);
		*/
		num.close();
	}
}
