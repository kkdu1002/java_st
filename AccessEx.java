package jang12;

class Sample
{
	public int a;
	private int b;
	int c;
	//setter(),getter();
	public int getB() 
	{
		return b;
	}
	
	public void setB(int b) 
	{
		this.b = b;
	}
}

public class AccessEx 
{
	public static void main(String[] args) 
	{
		Sample aClass = new Sample();
		aClass.a = 10;
//		aClass.b = 10;
		aClass.setB(10);
		aClass.c = 10;
	}
}