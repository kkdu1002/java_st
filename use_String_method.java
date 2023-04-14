package jang12;

import java.text.DecimalFormat;

public class use_String_method 
{
	public static void main(String[] args) 
	{
		String a = new String(" abcd");
		String b = new String(",efg");
		System.out.println("변경전 a : " + a.hashCode());
//		문자열 연결
		a = a.concat(b);
		System.out.println("변경후 a : " + a.hashCode());
		System.out.println(a);
		
//		공백 제거
		a = a.trim();
		System.out.println(a);
	
//		문자열 대치
		a = a.replace("ab","12");
		System.out.println(a);
		
//		문자열 분리
		String s[] = a.split(",");
		for(int i = 0; i < s.length; i++)
		{
			System.out.println("분리된 " + i + "번 문자열 : " + s[i]);
		}
		
//		서브 스트링
		a = a.substring(3);
		System.out.println(a);
		
//		문자열의 문자
		char c = a.charAt(2);
		System.out.println(c);
		System.out.println("-----------------");
		
//		이름을 집어 넣고 출력
		String name = "홍길동";
		String x = "님 안녕하세요.";
		
		System.out.println(name.concat(x));
		System.out.println(name.charAt(1));
		System.out.println(name.substring(0));
		System.out.println(name.indexOf("동",0));
		
		String name2[] = name.concat(x).split("\\s");
		System.out.println(name2[0]);
		System.out.println(name2[1]);

		
		String s1 = "abc";
		String s2 = "aBC";
		
		int i = s1.compareTo(b);
		if(i == 0)
		{
			System.out.println("같다");
		}
		else if(i < 0)
		{
			System.out.println("s2가 크다");
		}
		else
		{
			System.out.println("s1가 크다");
		}
		
//		format 사용하기
		int n = 12345678;
		System.out.println(n);
		System.out.println("format이용 : " + String.format("%,d",n));
		
//		%[argument_index$][flags][width][. precision]conversion
//		argument_index$ : 위치
//		flags : 출력서식 변경하는 무자셋 (-,0,+,(,#, )
//		width : + 는 오른쪽 중심 출력 , - 는 왼쪽 중심 출력 / 나머지는 공백 , 길이
//		. precision : 정밀도 , 정확성 (실수인 경우 소수점 이하 자릿수)
//		conversion : d,c,h,b,s,o,f,%,g(사사오입),e(10진수 실수표현) (%d , %c , %b 등등)
		
		DecimalFormat d = new DecimalFormat("#,###.0");
		System.out.println(d.format(22222));
	}
}