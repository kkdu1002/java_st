package jang12;

public class person3 
{
	public String name;
	public int age;
	
	public person3(String s) 
	{
		name = s;
	}
	
	public void setAge(int n) 
	{
		age = n;
		n++;
		System.out.println(n);
	}
	public static void main(String[] args) 
	{
		person3 aperson = new person3("ȫ�浿");
		int a = 33;
		aperson.setAge(a);
		System.out.println(a);
	}
}