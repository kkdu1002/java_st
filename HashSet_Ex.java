package jang12;

import java.util.*;

public class HashSet_Ex 
{
	public static void disp(Set<String> set , Iterator<String> iterator)
	{
		while(iterator.hasNext())
		{
			String element = iterator.next();
			System.out.println("\t" + element);
		}
	}
	public static void main(String[] args) 
	{	
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + size);
		
		Iterator<String> iterator = set.iterator();
		disp(set,iterator);
		/*
		while(iterator.hasNext())
		{
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		*/
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + set.size());
		
		iterator = set.iterator();
		disp(set,iterator);
		/*
		while(iterator.hasNext())
		{
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		*/
		set.clear();
		if(set.isEmpty())
		{
			System.out.println("ºñ¾îÀÖÀ½");
		}
	}
}