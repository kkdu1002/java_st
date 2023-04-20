package jang12;

import java.util.StringTokenizer;

public class StringTokenizer_Ex 
{
	public static void main(String[] args) 
	{
		String text = "홍길동/이수홍/박연수";
		
//		전체 토큰 수를 얻어 for문
		StringTokenizer st =new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens; i++)
		{
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
//		남아있는 토큰 확인 while문
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}