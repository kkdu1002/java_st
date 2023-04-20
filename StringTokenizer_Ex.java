package jang12;

import java.util.StringTokenizer;

public class StringTokenizer_Ex 
{
	public static void main(String[] args) 
	{
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
//		��ü ��ū ���� ��� for��
		StringTokenizer st =new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens; i++)
		{
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
//		�����ִ� ��ū Ȯ�� while��
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}