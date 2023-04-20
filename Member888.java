package jang12;

public class Member888 implements Comparable<Member888>
{
	String name;
	Member888(String name)
	{
		this.name = name;
	}
	@Override
	public int compareTo(Member888 o) 
	{
		return name.compareTo(o.name);
	}
}
