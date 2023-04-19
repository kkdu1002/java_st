package jang12;

public class NullPointerException_Ex 
{
	public static void main(String[] args) throws Exception
	{
		String data = null;
		try 
		{
		System.out.println(data.toString());
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace() + "," + e.getMessage());
		}
	}
}