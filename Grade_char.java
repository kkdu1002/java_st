package jang2;

import java.util.Scanner;

public class Grade_char {
	public static void main(String[] args) {
		char grade; 
		int score;
		Scanner num = new Scanner(System.in);
		System.out.print("점수 : ");
		
		while(num.hasNext()) 
		{
			score = num.nextInt();
			
			if(score > 100 | score < 0) 
			{
				grade = "E".charAt(0);
				// .charAt(0) = String의 0번째 값을 char로 바꾸기
				if (score == -1)
					break;
			}
			else if(score <= 100.0 & score >= 90.0)
				grade = "A".charAt(0);
			else if(score < 90.0 & score >= 80.0)
				grade = "B".charAt(0);
			else if(score < 80.0 & score >= 70.0)
				grade = "C".charAt(0);
			else if(score < 70.0 & score >= 60.0)
				grade = "D".charAt(0);
			else
				grade = "F".charAt(0);
			if(grade == 'E') 
			{ 
				System.out.print("잘못 입력하였습니다.\n");
			}
			else 
			{
				System.out.print("학점은 " + grade + "입니다.\n");
			}
			System.out.print("점수 : ");
		}
		System.out.print("그만....");
		num.close();
	}

}
