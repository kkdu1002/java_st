package jang2;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		String grade; // 참조형 ""또는 null
		int score;
		Scanner num = new Scanner(System.in);
		System.out.print("점수 : ");
		
		while(num.hasNext()) 
		{
			score = num.nextInt();
			
			if(score > 100 | score < 0) 
			{
				grade = "잘못 입력";
				if (score == -1)
					break;
			}
			else if(score <= 100.0 & score >= 90.0)
				grade = "A";
			else if(score < 90.0 & score >= 80.0)
				grade = "B";
			else if(score < 80.0 & score >= 70.0)
				grade = "C";
			else if(score < 70.0 & score >= 60.0)
				grade = "D";
			else
				grade = "F";
			if(grade.equals("잘못 입력")) 
			{ 
				//equals() 메소드는 반복문으로 매우 정직하게, 모든 인덱스의 값이 같은지 비교함
				//객체 :== 주소비교
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
