package jang12;

public class test08
{
	public static void disp(String c ,int a [][] ) 
	{
		System.out.printf("青纺 %s\n",c);
		for(int i = 0; i < a.length; i++) 
		{
			for(int j = 0; j < a[i].length; j++) 
			{
				System.out.printf("\t%d",a[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{6,3,4},{5,1,2}};
		int c[][] = new int [2][3];
		
		for(int i = 0; i < c.length; i++) 
		{
			for(int j = 0; j < c[i].length; j++) 
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		disp("a",a);
		disp("b",b);
		disp("c",c);
		
			/*	
		System.out.println("青纺 a");
		
	    for(int i = 0; i < a.length; i++) 
		{
			for(int j = 0; j < a[i].length; j++) 
			{
				System.out.printf("\t%d",a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("青纺 b");
		for(int i = 0; i < b.length; i++) 
		{
			for(int j = 0; j < b[i].length; j++) 
			{
				System.out.printf("\t%d",b[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("青纺 c");
		for(int i = 0; i < c.length; i++) 
		{
			for(int j = 0; j < c[i].length; j++) 
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.printf("\t%d",c[i][j]);
			}
			System.out.println();
		}
		*/
	}
}