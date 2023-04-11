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
} // 자식 클래스 extends 부모클래스
public class ColorPoint extends Point
{ // 클래스는 단일 상속만 가능함
	// 다중상속은 인터페이스로만 가능함
	// 자식클래스 implements 부모 인터페이스 , 부모 인터페이스
	String color;
	void setColor(String color)
	{
		this.color = color;
	}
	void showColorPoint()
	{
		System.out.print(color);
		showPoint(); // 부모꺼 , 내꺼
	}
	public static void main(String[] args) 
	{
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}