package jang12;

public class Member555 implements Cloneable
{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member555(String id, String name,String password,int age,boolean adult)
	{
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	public Member555() {
		
	}
	public Member555 getMember555()
	{
		Member555 cloned = null;
		try
		{
			cloned = (Member555) clone();
		}
		catch(CloneNotSupportedException e)
		{
			
		}
		return cloned;
	}
}
