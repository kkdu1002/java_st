package jang9;

import java.util.Random;

public class Ex_09_03 {

	public static void main(String[] args) 
	{
		int num;
		num = ((int)(Math.random() * 4) + 8);
		
//		Random r = new Random();
//		num = r.nextInt(4) + 8;
		System.out.printf("[����ð� : %d��]\n",num);

		switch(num) 
		{
			case 8:
				System.out.println("����� �մϴ�.\n");
				break;
			case 9:
				System.out.println("ȸ�Ǹ� �մϴ�.\n");
				break;

			case 10:
				System.out.println("������ ���ϴ�.\n");
				break;
			default:
				System.out.println("�ܱ��� �����ϴ�.\n");
		}
	}
}