package jang10;

public class MyFunctionalInterface_Ex3 
{
	static int sum(int x,int y)
	{
		return (x + y);
	}
	public static void main(String[] args) 
	{
		MyFunctionalInterface_int2 fi;
		
		fi = (x,y) -> 
		{
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2 , 5));
		
		fi = (x,y) -> { return x + y;};
		System.out.println(fi.method(2 , 5));
		
		fi = (x,y) ->  x + y;
		System.out.println(fi.method(2 , 5));
		
		fi = (x,y) -> sum(x,y);
		System.out.println(fi.method(2, 5));
	}
}