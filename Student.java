package jang12;

class Person
{
	int age;
	public String name;
	protected int height;
	private int weight;
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public int getWeight()
	{
		return weight;
	}
}
public class Student extends Person
{
	void set()
	{
		age = 30;
		name = "ȫ�浿";
		height = 175;
		setWeight(99);
		System.out.println("age = " + age);
		System.out.println("name = " + name);
		System.out.println("height : " + height);
		System.out.println("Weight : " + getWeight());
	}
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.set();
		System.out.println("---------------------------------");
		System.out.println("age = " + s.age +"\nname = " + s.name + "\nheight : " + s.height + "\nWeight : " + s.getWeight());
	}
}