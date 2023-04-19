package jang12;

import java.util.*;
import java.util.stream.Stream;

public class Array_List_Ex 
{
	public static void disp(List<String> list)
	{
		for(int i = 0; i < list.size(); i++)
		{
			String str = list.get(i);
			System.out.printf("%d : %s\n",i,str);
		}
	}
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + list.size());
		System.out.println();
		
		String x = list.get(2);
		System.out.println("2 : " + x);
		System.out.println();
		/*
		for(int i = 0; i < list.size(); i++)
		{
			String str = list.get(i);
			System.out.printf("%d : %s\n",i,str);
		}
		*/
		disp(list);
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i = 0; i < list.size(); i++)
		{
			String str = list.get(i);
			System.out.printf("%d : %s\n",i,str);
		}
		System.out.println();
		
//		iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			System.out.printf("Iterator : %s\n" , str);
		}
		
		System.out.println();
//		Stream
		Stream<String> s = list.stream();
		s.forEach(y -> System.out.printf("Stream : %s\n" , s));
	}
}
