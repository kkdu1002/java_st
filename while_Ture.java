package jang2;

import java.util.Scanner;

public class while_Ture {
	public static void main(String[] args) {
		String weather =" ";
		Scanner mon = new Scanner(System.in);
	
		System.out.print("계절을 구할 월을 입력 [0:종료] : ");
		
		while(true) 
		{
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
					if (month == 0)
					{
						weather = "end";
					}
					else
					{
					weather = "Error";
					}
					
			}
			if(weather == "Error")
			{
				System.out.print("잘못 입력된 날짜 입니다.\n");
				System.out.print("계절을 구할 월을 입력 [0:종료] : ");	
			}
			else if (weather == "end") 
			{
				System.out.print("--------- 종 료 ---------- ");	
				break;
			}
			else
			{
				System.out.printf("%d월은 %s입니다\n",month,weather);
				System.out.print("계절을 구할 월을 입력 [0:종료] : ");	
			}
		mon.close();
		}
	}
}