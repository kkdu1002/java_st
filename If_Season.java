package jang2;

import java.util.Scanner;

public class If_Season {
	public static void main(String[] args) {
		String weather =" ";
		Scanner mon = new Scanner(System.in);
	
		System.out.print("계절을 구할 월을 입력 : ");
		int month = mon.nextInt();
		
		if (month == 1 | month == 2 | month == 12)
			weather = "겨울";
		else if (month == 3 | month == 4 | month == 5)
			weather = "봄";
		else if (month == 6 | month == 7 | month == 8)
			weather = "여름";
		else if (month == 9 | month == 10 | month == 11)
			weather = "가을";
		if(month <= 0 | month > 12) 
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