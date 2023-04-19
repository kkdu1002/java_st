package jang12;
/*
	HashMap : ����ȭ ���� X
	HashTable : ����ȭ ���� O
*/
import java.util.HashMap;
import java.util.Map;

class Student
{
	public int score;
	public String name;
	public Student(int score, String name)
	{
		this.score = score;
		this.name = name;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Student)
		{
			Student student = (Student) obj;
			return (score == student.score) && (name.equals(student.name));
		}
		else
			return false;
	}
}

public class HashMap_Ex2 
{
	public static void main(String[] args) 
	{
		Map<Integer , Student> map = new HashMap<Integer , Student>();
		
		map.put(95, new Student(1,"ȫ�浿"));
		map.put(95, new Student(1,"ȫ�浿"));
		
		System.out.println("�� Entry �� : " + map.size());
	}
}