package jang11;

import java.util.Scanner;

public class homework7 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int student , score , sum = 0;
		System.out.printf("�л� �� �Է� : ");
		student = input.nextInt();
		
		int student_score[] = new int[student];
		
		for(int i = 0; i < student; i++)
		{
			System.out.printf("%d�� �л� ���� �Է� : ",i + 1);
			score = input.nextInt();
			student_score[i] = score;
			sum += student_score[i];
		}
		
		System.out.printf("�� : %d\n",sum);
		System.out.printf("��� : %d\n",sum / student);
		System.out.println("����");
		System.out.println("--------------");
		
		for(int i = 0; i < student; i++) 
		{
			System.out.printf("%d : %d\n",student_score[i],student_score[i] - sum / student);
		}
	}
}