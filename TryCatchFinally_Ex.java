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
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}