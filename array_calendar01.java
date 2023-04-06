package jang12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_calendar01 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언 
		int year , month , day , nal;
		// 배열 선언 및 초기화 , 각 달이 담고있는 마지막 날짜
		int mon_len []= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		do 
		{
		System.out.print("[년도]를 입력하세요");
		year = Integer.parseInt(input.readLine());
		}
		while(year < 1);
		
		do 
		{
			System.out.print("[월]를 입력하세요");
			month = Integer.parseInt(input.readLine());
		}
			while(month < 1 || month > 12);
		
		// 1년 1월 1일 ~ 입력받은 년도 이전 년도의 12월 31일 까지의 날 수 계산
		// 4년 마다 윤년 이므로 + 1 / 100년 일경우 윤년이 아니므로 - 1 / 400년일경우 윤년이므로 + 1 해서 날짜를 구함
 		nal = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year-1) / 400;

		// 입력받은 년도의 2월의 마지막 날 계산
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) //윤년
			mon_len[1] = 29;
		
		//해당 년도 1월부터 입력받은 월 이전 월의 마지막 날짜까지의 날 수 누적 연산
		for(int i = 0; i < (month - 1); i++) 
		{
			nal += mon_len[i];
		}
		// 입력받은 월의 1일 , 모든일수 = 날수를 구함
		nal += 1;

		// 요일 산출 : 입력받은 월의 1일이 무슨 요일인지 확인하기 위한 연산 / 0 : 일요일 , 1 : 월요일
		day = nal % 7;
		
		// 달력 그리기(출력)
		System.out.println();
		System.out.print("\t[" + year + "년 " + month + "월 ]\n");
		System.out.println();
		System.out.println("   일  월   화   수   목  금   토");
		System.out.println("=================================");
		
		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지점)
		for(int i = 1; i <= day; i++) 
		{
			System.out.print("    "); // 공백 4칸
		}
		
		// 해당 월의 날짜만 출력될 수 있도록 반복문 구성
		for(int i = 1; i <= mon_len[month - 1]; i++) 
		{
			System.out.printf("%4d", i);
			day++; // 날짜가 증가하는 만큼 요일도 증가
			
			//일요일 출력할 때 마다 줄바꿈하고 출력할 수 있도록 처리
			if(day % 7 == 0) 
			{
				System.out.println();
			}
		}
		// 달의 마지막 날짜가 출력형식을 모두 채웠을 경우
		// 이미 일요일 줄바꿈이 이루어졌기 때문에 하지않도록 처리
		if(day % 7 != 0) 
		{
			System.out.println();
		}
		System.out.println("=================================");
	}
}