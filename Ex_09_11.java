package jang9;

import java.util.Random;

public class Ex_09_11 {

	public static void main(String[] args) 
	{
		int num = 0;
//		Random i = new Random();

		while(num != 6) 
		{
			num = (int)(Math.random() * 6) + 1;
//			num = i.nextInt(6) + 1;
			System.out.printf("�ֻ��� ���� : %d\n",num);
		}
		System.out.print("���α׷� ����");
	}
}