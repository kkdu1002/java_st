package jang12;

import java.util.Scanner;

public class test07 
{		// n���� ����,ü��,���̸� �Է� �޾� �ִ밪
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("�л��� �Է� : ");
		int student = input.nextInt();
		
		int student_high,student_weight,student_age;
		int high_max = 0 , weight_max = 0 , age_max = 0;
		
		int high[] = new int[student];
		int weight[] = new int[student];
		int age[] = new int[student];
		
		for(int i = 0; i < student; i++) 
		{
			System.out.printf("[%d] ���� : ",i + 1);
			student_high = input.nextInt();
			high[i] = student_high;
			
			System.out.print("    ü�� : ");
			student_weight = input.nextInt();
			weight[i] = student_weight;
			
			System.out.print("    ���� : ");
			student_age = input.nextInt();
			age[i] = student_age;
		
			if(high_max < high[i])
				high_max = high[i];
			
			if(weight_max < weight[i])
				weight_max = weight[i];
			
			if(age_max < age[i])
				age_max = age[i];
		}
		System.out.printf("������ �ִ밪�� %d �Դϴ�.\n",high_max);
		System.out.printf("ü���� �ִ밪�� %d �Դϴ�.\n",weight_max);
		System.out.printf("������ �ִ밪�� %d �Դϴ�.\n",age_max);
	}
}