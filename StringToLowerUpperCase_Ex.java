package jang12;

public class StringToLowerUpperCase_Ex 
{
	public static void main(String[] args) 
	{
		String str1 = " 0Java Programming ";
		String str2 = " 1JAVA Programming ";
		String str3 = " 2JAVA Programming ";
		System.out.println(str1.equals(str2));
		
		String lowerstr1 = str1.toLowerCase();
		String lowerstr2 = str2.toLowerCase();
		System.out.println(lowerstr1.equals(lowerstr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String str4 = str1.trim() + str2.trim() + str3.trim();
		System.out.println(str4);
	}
}
