package jang2;

import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) {
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���.");
		while(sc.hasNext()) 
		{
			int score = sc.nextInt();
			switch(score / 10) 
			{
				case 10:
					if (score > 100) 
					{
						grade = 'E';
						break;
					}
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
			}
			if (grade == 'E')
				System.out.println("������ �߸� �ԷµǾ����ϴ�.");
			else
				System.out.println("������ " + grade + "�Դϴ�.");
			System.out.print("������ �Է��ϼ���.");
		}
		sc.close();
	}
}
