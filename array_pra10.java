package jang11;

import java.util.Scanner;

public class array_pra10 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int student;
		System.out.print("�Է� ó���� �л� ��(��) : ");
		student = input.nextInt();
		
		String name[] = new String[student];
		String phone[] = new String[student];
		
		for(int i = 0; i < student; i++) 
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�(%d)[���鱸��] : ",i + 1);
			name[i] = input.next(); //���鹮�� ������
			phone[i] = input.next();
		}
		System.out.println("-----------------");
		System.out.printf("��ü �л� �� : %d\n",student);
		System.out.println("-----------------");
		
		System.out.println("�̸�	��ȭ��ȣ");
		for(int i = 0; i < name.length; i++) 
		{
			System.out.printf("%s	%s\n",name[i],phone[i]);
		}
	}
}