package jang10;

import java.util.Scanner;

public class Ex_10_03 {

	public static void main(String[] args) 
	{
		int front , end;
		
		System.out.print("-�� ������ �ֹι�ȣ�� �Է��Ͻÿ�.");
		Scanner s = new Scanner(System.in).useDelimiter("\\s|-");
		
		front = s.nextInt();
		end = s.nextInt();
		System.out.printf("�ֹι�ȣ �չ�ȣ : %d",front);
		System.out.printf("�ֹι�ȣ �޹�ȣ : %d",end);
	}
}