package jang12;

class SuperObject
{
	protected String name;
	public void paint() 
	{
		draw();
	}
	public void draw() // ����
	{
		System.out.println("Super Object," + name);
	}
}

public class SubObject extends SuperObject
{	 // ������
	protected String name;
	public void draw()	// �������ε� 
	{
		name = "Sub";
		super.name = "Super";
		super.draw();
		System.out.println("Sub Object," +name);
	}
	public static void main(String[] args) 
	{
		SuperObject b = new SubObject(); // ��ĳ����
		b.paint();
	}
}