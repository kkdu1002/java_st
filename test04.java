package jang12;

import java.util.Scanner;

public class test04
{  // �迭 ��� �ݴ�� �ٲٱ�
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int array_num;
		System.out.print("��� �� : ");
		array_num = input.nextInt();
		
		int array[] = new int[array_num];
		int ran_num;
		int stack; // �� ����

		for(int i = 0; i < array_num; i++) //�迭�� ������ �����ϱ�
		{
			ran_num = (int) (Math.random() * 100 + 1);
			array[i] = ran_num;
			System.out.printf("array[%d] = %d\n",i,array[i]);
		}
		
		for(int i = 0; i < (array_num / 2) ; i++) //��Ҹ� �ݴ�� �ٲٱ�
		{
				stack = array[array_num - i - 1];
				array[array_num - i - 1] = array[i];
				array[i] = stack;
		}
		
		System.out.printf("-------------------\n");
		System.out.printf("����� ������ �ݴ�� �ٲپ����ϴ�.\n");
		
		for(int i = 0; i < array_num; i++)
		{
			System.out.printf("array[%d] = %d\n",i,array[i]);
		}
	}
}