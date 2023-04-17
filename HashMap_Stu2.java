package jang12;

import java.util.*;

class Student
{
	int id;
	String phone;
	public Student(int id , String phone)
	{
		this.id = id;
		this.phone = phone;
	}
}

public class HashMap_Stu2 
{
	public static void main(String[] args) 
	{
		HashMap<String, Student> stu = new HashMap<String , Student>();
		
		stu.put("황기태", new Student(1,"010-111-1111"));
		stu.put("한원선", new Student(2,"010-222-2222"));
		stu.put("이영희", new Student(3,"010-333-3333"));
		
		System.out.println("HashMap의 요소 개수 : " + stu.size());
		
		Set<String> names = stu.keySet();
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) 
		{
			String name = it.next();
			Student student = stu.get(name);
			System.out.println(name + ":" + student.id + " " + student.phone);
		}
	}
}