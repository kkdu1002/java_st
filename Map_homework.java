package jang12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student_homework
{
	String name;
	String department;
	double id;	// 학점평균
	private String grade;
	public Student_homework(String name,String department,String grade,double id)
	{
		this.name = name;
		this.department = department;
		this.grade = grade;
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public String getDepartment()
	{
		return department;
	}
	public String getGrade()
	{
		return grade;
	}
	public double getId()
	{
		return id;
	}
}
public class Map_homework
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Map<String , Student_homework> map = new HashMap<String , Student_homework>();
	
		for(int i = 0; i < 2 ; i++)
		{
			System.out.print((i+1) + " 이름 : ");
			String name = input.next(); 
			System.out.print((i+1) + " 학과 : ");
			String department = input.next(); 
			System.out.print((i+1) + " 학번 : ");
			String grade = input.next(); 
			System.out.print((i+1) + " 학점평균 : ");
			double id = input.nextInt();
			Student_homework student = new Student_homework(name, department, grade,id);
			map.put(grade,student);
		}
		
		int count = 0;
		System.out.print("[학번 : | 종료 : ^Z] : ");
		while(input.hasNext())
		{
			String grade = input.next();
			Student_homework student = map.get(grade);
			System.out.println("-------------------------");
			System.out.printf("이름 : %s\n학과 : %s\n학번 : %s\n학점평균 : %.1f\n",student.name,student.department,student.getGrade(),student.id);
			count++;
			if(count == 2)
				break;
			System.out.println("-------------------------");
			System.out.print("[학번 : | 종료 : ^Z] : ");
		}
		System.out.println("종료");
	}
}