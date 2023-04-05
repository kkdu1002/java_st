package jang12;

import java.util.Calendar;

public class calendar_pra 
{
	public static void main(String[] args) 
	{
		Week today = null; // 열거형 상수 초기화
		
		Calendar cal = Calendar.getInstance(); // 객체 얻어옴
		/*
		 class calendar{
		 private : 정보은닉 = 캡슐화  , 
		 private static Calendar instance = new Calendar();
		 private Calendar(){} // 생성자
		 public static Calendar getInstance(){// 2차적 = 우회적으로 접근할 수 있는 방법
		 return instance;
		 }
		 }
		 */
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) 
		{
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSEDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		System.out.println("오늘 요일" + today);
		
		if(today == Week.SUNDAY)
		{
			System.out.println("일요일에는 축구를 합니다.");
		}
		else
		{
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}
}
