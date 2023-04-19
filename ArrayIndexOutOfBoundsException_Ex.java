package jang12;

public class ArrayIndexOutOfBoundsException_Ex 
{
	public static void main(String[] args) 
	{
		String data1 = args[0];
		String data2 = args[1];
		
//		System.out.println("args[0] : " + data1);
//		System.out.println("args[1] : " + data2);
		try
		{
			for(int i = 0; i <= args.length; i++)
			{
				System.out.printf("args[%d] : %s\n" , i , args[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}