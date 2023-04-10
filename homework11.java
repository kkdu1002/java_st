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
		System.out.println(type + "가 움직입니다.");
	}
	public void Age(String type, int age) 
	{
		System.out.println(type + "는 " + age + "개월입니다.");
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
		
		myPet.move("강아지");
		myPet2.move("고양이");
		myPet.Age("강아지",8);
		myPet2.Age("고양이",13);
		System.out.println("현재 우리집 애완동물 수는 " + pet.count + "마리입니다.");
		
		System.out.println("----------------------------------------");
		
		myPet.setType("강아지");
		myPet2.setType("고양이");
		myPet.setAge(8);
		myPet2.setAge(12);
		
		System.out.println(myPet.getType() + "가 움직입니다.");
		System.out.println(myPet2.getType() + "가 움직입니다.");
		System.out.println(myPet.getType() + "는 " + myPet.getAge() + "개월입니다.");
		System.out.println(myPet2.getType() + "는 " + myPet2.getAge() + "개월입니다.");
		System.out.println("현재 우리집 애완동물 수는 " + pet.count + "마리입니다.");
	}
}