package jang12;

import java.util.Scanner;

public class array_calendar 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int mon_len []= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day[] = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		
		System.out.print("�� >> ");
		int mon = input.nextInt();
		System.out.println("\t\t [2023��" + mon + "��]");
		System.out.println(" ��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("======================================================");
		
		// ������ġ��ŭ ���� ó��
		for(int i = 0; i < day[mon - 1]; i++) 
		{
			System.out.printf("\t");
		}
		 // 4���� �Է¹����� 1~30�� ���� ��� (�ݺ�) , mon_len[mon - 1] �Է´��� ������ �ϼ�
		for(int i = 0; i < mon_len[mon - 1]; i++) 
		{
			System.out.printf(" %d\t",i + 1);
			if(i  % 7 == 6 - day[mon - 1])
			{
				System.out.println();
			}	
		}	
		System.out.println("\n======================================================");
	}
}