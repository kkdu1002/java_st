package jang2;

import java.util.Scanner;

public class Switch_Season {
	public static void main(String[] args) {
		String weather =" ";
		Scanner mon = new Scanner(System.in);
	
		System.out.print("������ ���� ���� �Է� : ");
		int month = mon.nextInt();
		
		switch(month) 
		{
			case 1:
			case 2:
			case 12:
				weather = "�ܿ�";
				break;
			case 3:
			case 4:
			case 5:
				weather = "��";
				break;
			case 6:
			case 7:
			case 8:
				weather = "����";
				break;
			case 9:
			case 10:
			case 11:
				weather = "����";
				break;
			default:
				weather = "Error";
		}
		if (weather == "Error") 
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
