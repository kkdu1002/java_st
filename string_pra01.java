package jang12;

public class string_pra01 
{
	public static void main(String[] args) 
	{
		String str  = "신민철";
		String str2  = "신민철";
		
		if(str == str2) {
			System.out.println("str과 str2는 참조가 같음");
		}
		else
		{
			System.out.println("str과 str2는 참조가 다름");
		}
		
		if(str.equals(str2)) {
			System.out.println("str과 str는 문자열이 같음");
		}
		
		String str3  = new String("신민철");
		String str4  = new String("신민철");
		
		if(str3 == str4) {
			System.out.println("str3과 str4는 참조가 같음");
		}
		else
		{
			System.out.println("str3과 str4는 참조가 다름");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 문자열이 같음");
		}
		// hashCode()를 String에서 재 정의(overriding)했음
		System.out.println("str.hashcode() = " + str.hashCode());
		System.out.println("str2.hashcode() = " + str2.hashCode());
		System.out.println("str3.hashcode() = " + str3.hashCode());
		System.out.println("str4.hashcode() = " + str4.hashCode());
	}
}