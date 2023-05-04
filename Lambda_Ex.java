package jang10;
interface MyFunction
{
	int calc(int x ,int y);
}
public class Lambda_Ex 
{
	public static void main(String[] args)
	{
		MyFunction add = (x , y) -> { return x + y; };
		MyFunction minus = (x , y) -> x - y;
		
		System.out.println(add.calc(1, 2));
		System.out.println(minus.calc(1, 2));
	}
}