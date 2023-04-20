package jang12;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID 
{
	public static void main(String[] args) 
	{
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs)
		{
			System.out.println(id);
		}
		TimeZone timeZone = TimeZone.getTimeZone("Amerika/Los_Angeles");
		Calendar now2 = Calendar.getInstance(timeZone);
		System.out.println(now2.get(Calendar.YEAR) + "�⵵" + (now2.get(Calendar.MONTH) + 1) + "��"
							+ now2.get(Calendar.DAY_OF_MONTH) + "��");
		
		System.out.println(now2.get(Calendar.HOUR) + "��" + now2.get(Calendar.MINUTE) + "��");
	}
}