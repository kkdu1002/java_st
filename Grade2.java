package jang2;

import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) {
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.");
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
				System.out.println("점수가 잘못 입력되었습니다.");
			else
				System.out.println("학점은 " + grade + "입니다.");
			System.out.print("점수를 입력하세요.");
		}
		sc.close();
	}
}
