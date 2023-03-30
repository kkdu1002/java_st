package jang9;

import java.util.Random;

public class Ex_09_03 {

	public static void main(String[] args) 
	{
		int num;
		num = ((int)(Math.random() * 4) + 8);
		
//		Random r = new Random();
//		num = r.nextInt(4) + 8;
		System.out.printf("[현재시간 : %d시]\n",num);

		switch(num) 
		{
			case 8:
				System.out.println("출근을 합니다.\n");
				break;
			case 9:
				System.out.println("회의를 합니다.\n");
				break;

			case 10:
				System.out.println("업무를 봅니다.\n");
				break;
			default:
				System.out.println("외근을 나갑니다.\n");
		}
	}
}