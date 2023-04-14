package jang12;

import java.text.DecimalFormat;

public class use_String_method 
{
	public static void main(String[] args) 
	{
		String a = new String(" abcd");
		String b = new String(",efg");
		System.out.println("������ a : " + a.hashCode());
//		���ڿ� ����
		a = a.concat(b);
		System.out.println("������ a : " + a.hashCode());
		System.out.println(a);
		
//		���� ����
		a = a.trim();
		System.out.println(a);
	
//		���ڿ� ��ġ
		a = a.replace("ab","12");
		System.out.println(a);
		
//		���ڿ� �и�
		String s[] = a.split(",");
		for(int i = 0; i < s.length; i++)
		{
			System.out.println("�и��� " + i + "�� ���ڿ� : " + s[i]);
		}
		
//		���� ��Ʈ��
		a = a.substring(3);
		System.out.println(a);
		
//		���ڿ��� ����
		char c = a.charAt(2);
		System.out.println(c);
		System.out.println("-----------------");
		
//		�̸��� ���� �ְ� ���
		String name = "ȫ�浿";
		String x = "�� �ȳ��ϼ���.";
		
		System.out.println(name.concat(x));
		System.out.println(name.charAt(1));
		System.out.println(name.substring(0));
		System.out.println(name.indexOf("��",0));
		
		String name2[] = name.concat(x).split("\\s");
		System.out.println(name2[0]);
		System.out.println(name2[1]);

		
		String s1 = "abc";
		String s2 = "aBC";
		
		int i = s1.compareTo(b);
		if(i == 0)
		{
			System.out.println("����");
		}
		else if(i < 0)
		{
			System.out.println("s2�� ũ��");
		}
		else
		{
			System.out.println("s1�� ũ��");
		}
		
//		format ����ϱ�
		int n = 12345678;
		System.out.println(n);
		System.out.println("format�̿� : " + String.format("%,d",n));
		
//		%[argument_index$][flags][width][. precision]conversion
//		argument_index$ : ��ġ
//		flags : ��¼��� �����ϴ� ���ڼ� (-,0,+,(,#, )
//		width : + �� ������ �߽� ��� , - �� ���� �߽� ��� / �������� ���� , ����
//		. precision : ���е� , ��Ȯ�� (�Ǽ��� ��� �Ҽ��� ���� �ڸ���)
//		conversion : d,c,h,b,s,o,f,%,g(������),e(10���� �Ǽ�ǥ��) (%d , %c , %b ���)
		
		DecimalFormat d = new DecimalFormat("#,###.0");
		System.out.println(d.format(22222));
	}
}