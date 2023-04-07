package jang12;

public class call_by_value2 
{
	static void increase(int array [])
	{
		for(int i = 0; i < array.length; i++) 
		{
			array[i]++; 
		}
	}
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		
		increase(a);
		
		for(int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}
}