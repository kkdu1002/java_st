package jang12;

import java.util.Calendar;

public class calendar_pra 
{
	public static void main(String[] args) 
	{
		Week today = null; // ������ ��� �ʱ�ȭ
		
		Calendar cal = Calendar.getInstance(); // ��ü ����
		/*
		 class calendar{
		 private : �������� = ĸ��ȭ  , 
		 private static Calendar instance = new Calendar();
		 private Calendar(){} // ������
		 public static Calendar getInstance(){// 2���� = ��ȸ������ ������ �� �ִ� ���
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
		System.out.println("���� ����" + today);
		
		if(today == Week.SUNDAY)
		{
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		}
		else
		{
			System.out.println("������ �ڹ� ���θ� �մϴ�.");
		}
	}
}
