package jang12;
class pet
{
	public int age;
	void move()
	{
		System.out.println("동물이 움직입니다");
	}
}
class Dog extends pet
{
	public String name;
	public int weight;
	public void setDog(String name,int weight)
	{
		this.name = name;
		this.weight = weight;
	}
}
class Bird extends pet
{
	public String type;
	private boolean flight;
	public void setBird(String type)
	{
		this.type = type;
	}
	public void flight(boolean flight)
	{
		
		if(flight == true)
			System.out.print("날수있습니다");
		else
			System.out.print("날수없습니다");
	}
}
public class animal extends pet
{
	public static void main(String[] args) 
	{
		Dog a = new Dog();
		Bird b = new Bird();
		a.move();
		b.move();
		a.age = 3;
		a.setDog("누렁이", 10);
		b.setBird("앵무새");
		b.age = 5;
		
		System.out.println("강아지의 이름은 " + a.name + "이고, 나이는" + a.age + "살이며, 몸무게는 " + a.weight + "kg입니다");
		System.out.print("새의 종류는 " + b.type + "이고, 나이는" + b.age + "살이며," );
		b.flight(true);
	}
}
