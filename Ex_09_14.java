package jang9;

import java.io.IOException;

public class Ex_09_14 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.print("�� ���� �Է� : ");
		char alpa = (char) System.in.read();
		
		System.in.skip(2);
		/*
		System.in.read();
		System.in.read();
		*/
		System.out.print("�� �ڸ� ���� �Է� : ");
		int num = System.in.read();
	
		System.out.println();
		
		System.out.printf("�Է��� ����: %c\n",alpa);
		System.out.printf("�Է��� ���� : %c\n",num);
		System.out.printf("�Է��� ����: %d\n",num);
	}
}
