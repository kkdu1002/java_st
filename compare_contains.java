package jang12;

public class compare_contains 
{
	public static void main(String[] args)
	{
		String str1 = "Java Programming";
		String str2 = "Java IT CookBook";
		
		System.out.println("원 문자열1 ==> [" + str1 +"]");
		System.out.println("원 문자열2 ==> [" + str2 +"]");
		
		System.out.println("원 문자열1 ==> [" + str1.compareTo(str2) +"]");
		System.out.println("원 문자열2 ==> [" + str2.contains("Java") +"]");
		System.out.println((int)str1.charAt(5)); // P = 80
		System.out.println((int)str2.charAt(5)); // I = 73
		System.out.println(str1.compareTo(str2)); // P - I = 7
		System.out.println(str1.contains("Java")); 
	}
}