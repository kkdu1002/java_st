package jang8;

import java.util.Scanner;

public class Ex_08_14 
{
	public static void main(String[] args) 
	{
		int score ;
		Scanner soc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���.");
		score = soc.nextInt();
		
		if (score >= 90) 
		{
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("A��� �Դϴ�.");
		}
		if(score < 90) 
		{
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("B���� �Դϴ�.");
		}
	}
}