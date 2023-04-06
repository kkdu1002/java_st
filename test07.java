package jang12;

import java.util.Scanner;

public class test07 
{		// n명의 신장,체중,나이를 입력 받아 최대값
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("학생수 입력 : ");
		int student = input.nextInt();
		
		int student_high,student_weight,student_age;
		int high_max = 0 , weight_max = 0 , age_max = 0;
		
		int high[] = new int[student];
		int weight[] = new int[student];
		int age[] = new int[student];
		
		for(int i = 0; i < student; i++) 
		{
			System.out.printf("[%d] 신장 : ",i + 1);
			student_high = input.nextInt();
			high[i] = student_high;
			
			System.out.print("    체중 : ");
			student_weight = input.nextInt();
			weight[i] = student_weight;
			
			System.out.print("    나이 : ");
			student_age = input.nextInt();
			age[i] = student_age;
		
			if(high_max < high[i])
				high_max = high[i];
			
			if(weight_max < weight[i])
				weight_max = weight[i];
			
			if(age_max < age[i])
				age_max = age[i];
		}
		System.out.printf("신장의 최대값은 %d 입니다.\n",high_max);
		System.out.printf("체중의 최대값은 %d 입니다.\n",weight_max);
		System.out.printf("나이의 최대값은 %d 입니다.\n",age_max);
	}
}