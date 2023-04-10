package jang12;

public class overloading
{
	public static void main(String[] args) 
	{
		Calc myCalc = new Calc();
		
		myCalc.addValue(1.0, 1.0);
		myCalc.addValue(1, 1);
	}
}