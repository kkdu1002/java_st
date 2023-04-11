package jang12;

public class Person235_Ex 
{
	public static void main(String[] args) 
	{
		Person235 p1 = new Person235("123456-1234567","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation ="usa";				//final 필드 값 수정불가
		//p1.ssn = "654321-7654321";   //final 필드 값 수정불가
		p1.name = "을지문덕";
	}
}