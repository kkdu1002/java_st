package jang11;

import java.util.Scanner;

public class array_pra2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
	//  1 ���� �޸� �Ҵ� ����Ʈ �ʱ�ȭ
		int num[] = new int[5]; // 00000
		num[0] = 20;  // �ʱ�ȭ
	
	//  2 ���� �޸� �Ҵ� �ʱ�ȭ
		int num1[];
		num1 = new int[5]; // �޸� �Ҵ� ����Ʈ �ʱ�ȭ
		num1[0] = 20;
	
	//  3 ���� �޸� �Ҵ� �ʱ�ȭ
		int num2[] = {10,20,30,40,50};
	
	//  4 ���� �޸� �Ҵ� �ʱ�ȭ
		int num3[];
		num3 = new int[] {10,20,30,40,50}; // �޸� �Ҵ� �ʱ�ȭ
		
		int max = 0 , min = 999;
		double sum = 0;
		
		
		for (int k = 0;k < num.length; k++) 
		{
			num[k] = input.nextInt();
			sum += num[k];
			if (max < num[k])
				max = num[k];
			else if(min > num[k])
				min = num[k];
		}
		System.out.printf("��� : %.1f\n",sum/num.length);
		System.out.printf("�ִ밪 : %d\n",max);
		System.out.printf("�ּҰ� : %d\n",min);
	}
}