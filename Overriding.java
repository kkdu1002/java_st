package jang12;

class Person4
{
	String phone;
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getPhone()
	{
		return phone;
	}
}
class Professor4 extends Person4
{
	public String getPhone()
	{
		return "Professor4 : " + super.getPhone();
	}
}
public class Overriding 
{
	public static void main(String[] args) 
	{
		Professor4 a = new Professor4();
		a.setPhone("011-123-1234");
		System.out.println(a.getPhone());
		Person4 p = a;
		System.out.println(p.getPhone());
	}
}