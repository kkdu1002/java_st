package jang3;

import java.util.Scanner;

public class Ex_04_12 
{
	public static void main(String[] args) 
	{
		int year;
		
		Scanner Y = new Scanner(System.in);
		System.out.printf("연도를 입력하세요 : ");
		
//		year = Y.nextInt();
		
//		if (year % 4 == 0 & year % 100 != 0)
//			System.out.printf("%d 년은 윤년입니다.",year);
//		else if (year % 400 == 0)
//			System.out.printf("%d 년은 윤년입니다.",year);
//		else
//			System.out.printf("%d 년은 윤년이 아닙니다.",year);
		
		while(Y.hasNext())
		{
			year = Y.nextInt();
			if (year == 0)
				break;
			if (year % 4 == 0 & year % 100 != 0)
				System.out.printf("%d 년은 윤년입니다.\n",year);
			else if (year % 400 == 0)
				System.out.printf("%d 년은 윤년입니다.\n",year);
			else
				System.out.printf("%d 년은 윤년이 아닙니다.\n",year);
			System.out.printf("연도를 입력하세요 : ");
		}
		Y.close();
	}
}