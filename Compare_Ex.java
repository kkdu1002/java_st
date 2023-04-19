package jang12;

import java.util.Comparator;
import java.util.Objects;

public class Compare_Ex
{
	/*
	 �̳� Ŭ����(���(�ν��Ͻ�,Ŭ����),�޼ҵ峻(����),�͸�(�̸�X))
	 static Member class : �ܺ�Ŭ������ ������� ���� ��ġ�� ����
	 �ܺ� Ŭ������ static���ó�� �ٷ������.
	 �ַ� �ܺ�Ŭ������ static���, Ư�� static�޼��忡�� ���� �������� ����ȴ�.
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