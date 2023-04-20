package jang12;
/*
	public abstract class Calendar
	{
		private static Calendar instance = new Calendar();
		public static Calendar getInstance()
		{
			return instance;
		}
	}
싱글톤 패턴 == 팩토리 패턴
GregorianCalendar : 세계의 대부분의 지역에서 사용되는 표준적인 달력 시스템을 제공합니다.
*/
import java.util.Calendar;

public class Calendar333_Ex 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH + 1);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week)
		{
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
			case Calendar.SUNDAY:
				strWeek = "일";
				break;
		}
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM)
		{
			strAmPm = "오전";
		}
		else
		{
			strAmPm = "오후";
		}
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.print(year + "년");
		System.out.print(month + "월");
		System.out.println(day + "일");
		System.out.print(strWeek + "요일");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시");
		System.out.print(minute + "분");
		System.out.print(second + "초");
	}
}