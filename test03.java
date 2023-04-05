package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test03 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		if (args.length == 0) 
		{
			System.out.print("args를 입력하세요");
		}
		else
		{
			String subject[] = new String[args.length];
			int score[] = new int[subject.length];

			int i;
			char grade = ' ';
			String student_name;
			double sum = 0;

			System.out.print("java Test01 ");
			// 과목 저장
			for (i = 0; i < args.length; i++) 
			{
				subject[i] = args[i];
				System.out.print(" " + subject[i]);
			}

			System.out.println();
			System.out.print("Input your name : ");
			student_name = input.readLine();

			// 점수 저장 , 총점 저장
			for (i = 0; i < score.length; i++) 
			{
				System.out.printf("%s과목 점수 : ", subject[i]);
				score[i] = Integer.parseInt(input.readLine());
				sum += score[i];
			}
			// 학점 계산
			switch (((int) sum / subject.length) / 10) 
			{
				case 10:
				case 9:
					grade = 'A';
					break;
				case 8:
					grade = 'B';
					break;
				case 7:
					grade = 'C';
					break;
				case 6:
					grade = 'D';
					break;
				default:
					grade = 'F';
					break;
			}
			System.out.println("--------성적표----------");
			System.out.printf("이름\t");
			for (i = 0; i < subject.length; i++) 
			{
				subject[i] = args[i];
				System.out.printf("%s\t", subject[i]);
			}
			System.out.printf("총점\t평균\t학점\n");

			System.out.printf("%s\t", student_name);
			for (i = 0; i < score.length; i++) 
			{
				System.out.printf("%d\t", score[i]);
			}
			System.out.printf("%.0f\t%.2f\t%c", sum, sum / subject.length, grade);
		}
	}
}