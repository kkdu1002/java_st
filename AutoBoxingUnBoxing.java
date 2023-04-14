package jang12;

public class AutoBoxingUnBoxing 
{
	public static void main(String[] args)
	{
//		int i = 10;
		//wrapper 클래스로 변환
		Integer i = new Integer(10);
//		Integer intObject = i; // auto boxing
		Integer intObject = new Integer(i);
		System.out.println("intObjct = " + intObject.intValue());
		
		i = intObject.intValue() + 10; // auto unboxing
		System.out.println("i = " + i);
	}
}