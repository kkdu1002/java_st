package jang2;

import java.util.Scanner;

public class Switch_Season {
	public static void main(String[] args) {
		String weather =" ";
		Scanner mon = new Scanner(System.in);
	
		System.out.print("계절을 구할 월을 입력 : ");
		int month = mon.nextInt();
		
		switch(month) 
		{
			case 1:
			case 2:
			case 12:
				weather = "겨울";
				break;
			case 3:
			case 4:
			case 5:
				weather = "봄";
				break;
			case 6:
			case 7:
			case 8:
				weather = "여름";
				break;
			case 9:
			case 10:
			case 11:
				weather = "가을";
				break;
			default:
				weather = "Error";
		}
		if (weather == "Error") 
		{
			System.out.printf("날짜가 잘못 입력되었습니다.");
		}
		else
		{
			System.out.printf("%d월은 %s입니다\n",month,weather);
		}
		mon.close();
	}
}
