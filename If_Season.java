package jang2;

import java.util.Scanner;

public class If_Season {
	public static void main(String[] args) {
		String weather =" ";
		Scanner mon = new Scanner(System.in);
	
		System.out.print("������ ���� ���� �Է� : ");
		int month = mon.nextInt();
		
		if (month == 1 | month == 2 | month == 12)
			weather = "�ܿ�";
		else if (month == 3 | month == 4 | month == 5)
			weather = "��";
		else if (month == 6 | month == 7 | month == 8)
			weather = "����";
		else if (month == 9 | month == 10 | month == 11)
			weather = "����";
		if(month <= 0 | month > 12) 
		{
			System.out.printf("��¥�� �߸� �ԷµǾ����ϴ�.");
		}
		else 
		{
		System.out.printf("%d���� %s�Դϴ�\n",month,weather);
		}
		mon.close();
	}
}