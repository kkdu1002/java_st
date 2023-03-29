package jang8;

public class Ex_08_10 
{
	public static void main(String[] args) 
	{
		// 문자 + 문자 = 문자 + == toString() : 연결연산자
		// 숫자 + 문자 = 문자
		// 문자 + 숫자 = 문자
		// 숫자 + 숫자 = 숫자
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str3.toString());
		System.out.println(str4);
	
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj);
	}
}