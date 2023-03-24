package jang3;

import java.util.Scanner;

public class Ex_05_05 
{
	public static void main(String[] args) 
	{
		Scanner y = new Scanner(System.in);
		int year;
		
		System.out.print("연도를 입력하세요 : ");
		year = y.nextInt();
		
		// 신유술해 / 자축인묘 / 진사오미
		while(year > 0) 
		{
			switch(year % 12) 
			{
				case 0:
					System.out.printf("%d는 원숭이띠 입니다.\n",year);
					break;
				case 1:
					System.out.printf("%d는 닭띠 입니다.\n",year);
					break;
				case 2:
					System.out.printf("%d는 개띠 입니다.\n",year);
					break;
				case 3:
					System.out.printf("%d는 돼지띠 입니다.\n",year);
					break;
				case 4:
					System.out.printf("%d는 쥐띠 입니다.\n",year);
					break;
				case 5:
					System.out.printf("%d는 소띠 입니다.\n",year);
					break;
				case 6:
					System.out.printf("%d는 호랑이띠 입니다.\n",year);
					break;
				case 7:
					System.out.printf("%d는 토끼띠 입니다.\n",year);
					break;
				case 8:
					System.out.printf("%d는 용띠 입니다.\n",year);
					break;
				case 9:
					System.out.printf("%d는 뱀띠 입니다.\n",year);
					break;
				case 10:
					System.out.printf("%d는 말띠 입니다.\n",year);
					break;
				case 11:
					System.out.printf("%d는 양띠 입니다.\n",year);
					break;
			}
			System.out.print("연도를 입력하세요 : ");
			year = y.nextInt();
		}
		System.out.print("----- 종료 -----");
	}
}
