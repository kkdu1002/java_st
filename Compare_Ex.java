package jang12;

import java.util.Comparator;
import java.util.Objects;

public class Compare_Ex
{
	/*
	 이너 클래스(멤버(인스턴스,클래스),메소드내(로컬),익명(이름X))
	 static Member class : 외부클래스의 멤버변수 선언 위치에 선언
	 외부 클래스의 static멤버처럼 다루어진다.
	 주로 외부클래스의 static멤버, 특히 static메서드에서 사용될 목적으로 선언된다.
	 */
	static class Student777
	{
		int sno;
		Student777(int sno)
		{
			this.sno = sno;
		}
	}
	static class StudentComparator implements Comparator<Student777>
	{
		@Override
		public int compare(Student777 o1, Student777 o2) 
		{
			return Integer.compare(o1.sno , o2.sno);
		}
	}
	public static void main(String[] args) 
	{
		Student777 s1 = new Student777(1);
		Student777 s2 = new Student777(1);
		Student777 s3 = new Student777(2);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
	}
}