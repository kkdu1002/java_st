package jang10;
interface MyFunction4
{
	int calc(int x,int y);
}
public class Lambda_Ex4 
{
	public static void main(String[] args)
	{
		printMultiply(3,4,(x,y) -> x * y);
	}
	static void printMultiply(int x,int y, MyFunction4 f)
	{
		System.out.println(f.calc(x,y));
	}
}
