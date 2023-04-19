package jang12;

public class TryCatchFinally_Ex
{
	public static void main(String[] args)
	{
		try
		{
			Class clazz = Class.forName("java.lang.String2");
			Object obj = new Object();
			Class c = obj.getClass();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}