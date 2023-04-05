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
			System.out.print("args�� �Է��ϼ���");
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
			// ���� ����
			for (i = 0; i < args.length; i++) 
			{
				subject[i] = args[i];
				System.out.print(" " + subject[i]);
			}

			System.out.println();
			System.out.print("Input your name : ");
			student_name = input.readLine();

			// ���� ���� , ���� ����
			for (i = 0; i < score.length; i++) 
			{
				System.out.printf("%s���� ���� : ", subject[i]);
				score[i] = Integer.parseInt(input.readLine());
				sum += score[i];
			}
			// ���� ���
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
			System.out.println("--------����ǥ----------");
			System.out.printf("�̸�\t");
			for (i = 0; i < subject.length; i++) 
			{
				subject[i] = args[i];
				System.out.printf("%s\t", subject[i]);
			}
			System.out.printf("����\t���\t����\n");

			System.out.printf("%s\t", student_name);
			for (i = 0; i < score.length; i++) 
			{
				System.out.printf("%d\t", score[i]);
			}
			System.out.printf("%.0f\t%.2f\t%c", sum, sum / subject.length, grade);
		}
	}
}