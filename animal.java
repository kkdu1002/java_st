package jang12;
class pet
{
	public int age;
	void move()
	{
		System.out.println("������ �����Դϴ�");
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
			System.out.print("�����ֽ��ϴ�");
		else
			System.out.print("���������ϴ�");
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
		a.setDog("������", 10);
		b.setBird("�޹���");
		b.age = 5;
		
		System.out.println("�������� �̸��� " + a.name + "�̰�, ���̴�" + a.age + "���̸�, �����Դ� " + a.weight + "kg�Դϴ�");
		System.out.print("���� ������ " + b.type + "�̰�, ���̴�" + b.age + "���̸�," );
		b.flight(true);
	}
}
