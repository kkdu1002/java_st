package jang9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_09_05 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader po = new BufferedReader(new InputStreamReader(System.in));
		Scanner Po = new Scanner(System.in);
		String position = " ";
		char Position = ' ';

A:		while(true)
		{
			System.out.print("������ �Է��ϼ��� [����,����,���,��]: ");
			position = Po.nextLine();
			Position = position.charAt(0);
			switch(Position) 
			{
				case '��':
					System.out.printf("%s�� ������ 700���� �Դϴ�.\n",position);
					break;
				case '��':
					System.out.printf("%s�� ������ 500���� �Դϴ�.\n",position);
					break;
				case '��':
					System.out.printf("�����մϴ�. \n");
					break A;
				default:
					System.out.printf("������ 300���� �Դϴ�.\n");
					break;
			}
		}

		/*
A:		while(true)
		{
			System.out.print("������ �Է��ϼ��� [����,����,���,��]: ");
			position = po.readLine();
//			position.substring(start, end)   ------ > ���۰� ��ġ  ~ ���� ��ġ���� ����
			switch(position.substring(0, 1)) 
			{
				case "��":
					System.out.printf("%s�� ������ 700���� �Դϴ�.\n",position);
					break;
				case "��":
					System.out.printf("%s�� ������ 500���� �Դϴ�.\n",position);
					break;
				case "��":
					System.out.printf("�����մϴ�. \n");
					break A;
				default:
					System.out.printf("������ 300���� �Դϴ�.\n");
					break;
			}
		}*/
	}
}