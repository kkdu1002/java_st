package jang6;

public class Ex_06_01 {
	public static void main(String[] args) {
		System.out.printf("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�. ^^\n");
		System.out.printf("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�. ^^\n");
		System.out.printf("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�. ^^\n");
		System.out.printf("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�. ^^\n");
		System.out.printf("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�. ^^\n");

		
		System.out.println("for��");
		for (int i = 0; i < 5; i++)
			System.out.printf("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�. ^^\n");

		System.out.println("while��");
		int i = 0;
		  
		while (i < 5) 
		{ 
			System.out.printf("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�. ^^\n");
			i++; 
		}
		 
		System.out.println("do while��");
		int j = 0;

		do 
		{
			j++;
			System.out.printf("�ȳ��ϼ���? ���ۺ��� for ���� �������Դϴ�. ^^\n");
		} 
		while (j < 5);
	}
}