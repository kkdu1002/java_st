package jang12;

public class Computer_Ex 
{
	public static void main(String[] args)
	{
		int r = 10;
		Calculator33 calc = new Calculator33();
		System.out.println("원 면적 : " + calc.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
	}
}