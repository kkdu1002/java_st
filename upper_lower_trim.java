package jang12;

public class upper_lower_trim
{
	public static void main(String[] args) 
	{
		String str = "   한글   ABCD   efgh    ";
		
		System.out.println("원 문자열 ==> [" + str + "]");
		System.out.println("대문자로 ==> [" + str.toUpperCase() + "]");
		System.out.println("소문자로 ==> [" + str.toLowerCase() + "]");
		System.out.println("공백제거 ==> [" + str.trim() + "]");
	}
}