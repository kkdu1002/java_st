package jang10;

public class MyFunctionalInterface_Ex2 
{
	public static void main(String[] args) 
	{
		MyFunctionalInterface_int fi;
		
		fi = (x) -> 
		{
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> { System.out.println(x * 5);};
		fi.method(2);
		
		fi = (x) -> System.out.println(x * 5);
		fi.method(2);
	}

}
