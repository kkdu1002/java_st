package jang12;

class pet
{
	private String type;
	private int age;
	static int count = 0;
	pet()
	{
		count ++;
	}
	public void move(String type) 
	{
		System.out.println(type + "�� �����Դϴ�.");
	}
	public void Age(String type, int age) 
	{
		System.out.println(type + "�� " + age + "�����Դϴ�.");
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public int getAge() 
	{
		return age;
	}
	public String getType() 
	{
		return type;
	}
}
public class homework11 
{
	public static void main(String[] args) 
	{
		pet myPet = new pet();
		pet myPet2 = new pet();
		
		myPet.move("������");
		myPet2.move("�����");
		myPet.Age("������",8);
		myPet2.Age("�����",13);
		System.out.println("���� �츮�� �ֿϵ��� ���� " + pet.count + "�����Դϴ�.");
		
		System.out.println("----------------------------------------");
		
		myPet.setType("������");
		myPet2.setType("�����");
		myPet.setAge(8);
		myPet2.setAge(12);
		
		System.out.println(myPet.getType() + "�� �����Դϴ�.");
		System.out.println(myPet2.getType() + "�� �����Դϴ�.");
		System.out.println(myPet.getType() + "�� " + myPet.getAge() + "�����Դϴ�.");
		System.out.println(myPet2.getType() + "�� " + myPet2.getAge() + "�����Դϴ�.");
		System.out.println("���� �츮�� �ֿϵ��� ���� " + pet.count + "�����Դϴ�.");
	}
}