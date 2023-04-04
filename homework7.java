package jang11;

import java.util.Scanner;

public class homework7 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int student , score , sum = 0;
		System.out.printf("학생 수 입력 : ");
		student = input.nextInt();
		
		int student_score[] = new int[student];
		
		for(int i = 0; i < student; i++)
		{
			System.out.printf("%d번 학생 점수 입력 : ",i + 1);
			score = input.nextInt();
			student_score[i] = score;
			sum += student_score[i];
		}
		
		System.out.printf("합 : %d\n",sum);
		System.out.printf("평균 : %d\n",sum / student);
		System.out.println("편차");
		System.out.println("--------------");
		
		for(int i = 0; i < student; i++) 
		{
			System.out.printf("%d : %d\n",student_score[i],student_score[i] - sum / student);
		}
	}
}