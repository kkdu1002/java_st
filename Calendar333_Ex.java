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
�̱��� ���� == ���丮 ����
GregorianCalendar : ������ ��κ��� �������� ���Ǵ� ǥ������ �޷� �ý����� �����մϴ�.
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
				strWeek = "��";
				break;
			case Calendar.TUESDAY:
				strWeek = "ȭ";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "��";
				break;
			case Calendar.THURSDAY:
				strWeek = "��";
				break;
			case Calendar.FRIDAY:
				strWeek = "��";
				break;
			case Calendar.SATURDAY:
				strWeek = "��";
				break;
			case Calendar.SUNDAY:
				strWeek = "��";
				break;
		}
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM)
		{
			strAmPm = "����";
		}
		else
		{
			strAmPm = "����";
		}
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.print(year + "��");
		System.out.print(month + "��");
		System.out.println(day + "��");
		System.out.print(strWeek + "����");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "��");
		System.out.print(minute + "��");
		System.out.print(second + "��");
	}
}