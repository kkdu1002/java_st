package jang12;

public class Throws_Ex 
{
	public static void findClass() throws ClassNotFoundException
	{
		Class clazz = Class.forName("java.lang.String2");
	}
	public static void main(String[] args)
	{
		try
		{
			findClass();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}
