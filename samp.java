package jang12;

public class samp 
{
	int id;
	public samp(int x) 
	{
		this.id = x;
	}
	public void set(int x) 
	{
		this.id = x;
	}
	public int get() 
	{
		return this.id;
	}
	public static void main(String[] args) 
	{
		samp ob1 = new samp(3);
		samp ob2 = new samp(3);
		samp ob3 = new samp(3);
		
		ob1.set(5);
		ob2.set(6);
		ob3.set(7);
		
		System.out.println("ob1.id = " + ob1.get());
		System.out.println("ob2.id = " + ob2.get());
		System.out.println("ob3.id = " + ob3.get());
		
		samp s;
		s = ob2;
		ob1 = ob2;
		System.out.println("ob1.id = " + ob1.id);
		System.out.println("ob2.id = " + ob2.id);
	}
}