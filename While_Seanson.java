package jang2;

import java.util.Scanner;

public class While_Seanson {
	public static void main(String[] args) {
		String weather =" ";
		Scanner mon = new Scanner(System.in);
	
		System.out.print("������ ���� ���� �Է� : ");
		
		while(mon.hasNext()) 
		{
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
			if(weather == "Error")
			{
				System.out.print("�߸� �Էµ� ��¥ �Դϴ�.\n");
				System.out.print("������ ���� ���� �Է� : ");	
			}
			else
			{
				System.out.printf("%d���� %s�Դϴ�\n",month,weather);
				System.out.print("������ ���� ���� �Է� : ");	
			}
		}
		System.out.print("\n ----- ���� ----");	
		mon.close();
	}
}
