package jang12;

public class index_of 
{
	public static void main(String[] args) 
	{
		String str = "Java를 공부하는 중 , Java는 재밌어요.^^";
		
		System.out.println("문자열 ==> " + str);
		
		System.out.print("제일 처음 나오는 Java 위치 ==> ");
		System.out.println(str.indexOf("Java"));
		System.out.print("제일 마지막에 나오는 Java 위치 ==> ");
		System.out.println(str.lastIndexOf("Java"));
	}
}