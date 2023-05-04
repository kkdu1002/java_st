package jang10;
interface MyFunction3
{
	void print();
}
public class Lambda_Ex3 
{
	public static void main(String[] args) 
	{
		MyFunction3 f3 = () -> {System.out.println("Hello");};
		
		f3.print();
		
		f3 = () -> System.out.println("¾È³ç");
		
		f3.print();
	}
}