package jang2;

import java.util.Scanner;

public class Grade_Switch {

	public static void main(String[] args) {
		char input_grade;
		Scanner grade1 = new Scanner(System.in);
		
		System.out.print("학점을 입력[A~F] : ");
		//		char grade = 'C';
		/*
		 * switch문 : 다양한 처리문을 두고 조건값에 의해 하나의 처리문이나 여러개의 처리문을 한번에 수행하는데 유용한 분기(비교)문
		 * 
		 * 정수형(byte, short , char , int),jdk 1.7부터 String형을 허용한다.
		 * long, float , double , boolean은 사용불가.
		 * 수식 올 수 없고 , 구간 올 수 없다.
		 * byte, short , char , int , String만 비교 가능
		 * */
		while(grade1.hasNext()) 
		{
			input_grade = grade1.next().toUpperCase().charAt(0);
//			                           소문자를 대문자로 변경
			switch (input_grade) 
			{
				case 'A':
				case 'B':
					System.out.println("참 잘하였습니다.");
					break;
				case 'C':
				case 'D':
					System.out.println("좀 더 노력하세요.");
					break;
				case 'F':
					System.out.println("다음 학기에 다시 수강하세요.");
					break;
				default:
					System.out.println("잘못된 학점입니다.");
			}
			System.out.print("학점을 입력[A~F] : ");
		}
		System.out.print("종료되었습니다.");
		grade1.close();
	}

}
