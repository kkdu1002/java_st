package jang12;

import java.util.StringTokenizer;

public class String_TokenizeEx 
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����","/");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}
}