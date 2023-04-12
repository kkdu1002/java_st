package jang12;

class SuperObject
{
	protected String name;
	public void paint() 
	{
		draw();
	}
	public void draw() // 무시
	{
		System.out.println("Super Object," + name);
	}
}

public class SubObject extends SuperObject
{	 // 재정의
	protected String name;
	public void draw()	// 동적바인딩 
	{
		name = "Sub";
		super.name = "Super";
		super.draw();
		System.out.println("Sub Object," +name);
	}
	public static void main(String[] args) 
	{
		SuperObject b = new SubObject(); // 업캐스팅
		b.paint();
	}
}