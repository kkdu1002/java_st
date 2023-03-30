package jang9;

import java.util.Random;

public class Ex_09_02
{
	public static void main(String[] args) 
	{
		int num;
//		num = ((int)(Math.random() * 6) + 1);
		
		Random r = new Random();
		num = r.nextInt(6) + 1;
		System.out.println(num);
		/* 
		 switch(정수형 , byte , short , char , in) , String , 산술연산만 가능
		 long , float , double , boolean 형식은 들어 갈 수 없음
		 case 구간 X , 수식 X : switch조건내에 들어 갈 수 있는 값만 와야함
		 */
		switch(num) 
		{
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			case 6:
				System.out.println("6번이 나왔습니다.");
				break;
		}
	}
}

