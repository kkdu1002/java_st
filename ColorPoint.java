package jang12;

class Point 
{
	int x,y;
	void set(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
	void showPoint()
	{
		System.out.println("(" + x + "," + y + ")");
	}
} // �ڽ� Ŭ���� extends �θ�Ŭ����
public class ColorPoint extends Point
{ // Ŭ������ ���� ��Ӹ� ������
	// ���߻���� �������̽��θ� ������
	// �ڽ�Ŭ���� implements �θ� �������̽� , �θ� �������̽�
	String color;
	void setColor(String color)
	{
		this.color = color;
	}
	void showColorPoint()
	{
		System.out.print(color);
		showPoint(); // �θ� , ����
	}
	public static void main(String[] args) 
	{
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}