package jang12;

public class array_pra12 
{
	public static void main(String[] args) 
	{
		int array1[] = new int [3];
		int i;
		
		for(i = 0; i < array1.length; i++)
		{
			System.out.printf("array1[%d] = %d\n",i,array1[i]);
		}
		
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		
		for(i = 0; i < array1.length; i++)
		{
			System.out.printf("array1[%d] = %d\n",i,array1[i]);
		}
		
		double array2[] = new double [3];
		
		for(i = 0; i < array2.length; i++)
		{
			System.out.printf("array2[%d] = %.1f\n",i,array2[i]);
		}
		
		array2[0] = 0.1;
		array2[1] = 0.2;
		array2[2] = 0.3;
		
		for(i = 0; i < array2.length; i++)
		{
			System.out.printf("array2[%d] = %.1f\n",i,array2[i]);
		}
		
		String array3[] = new String [3];
		
		for(i = 0; i < array3.length; i++)
		{
			System.out.printf("array3[%d] = %s\n",i,array3[i]);
		}
		
		array3[0] = "1¿ù";
		array3[1] = "2¿ù";
		array3[2] = "3¿ù";
		
		for(i = 0; i < array3.length; i++)
		{
			System.out.printf("array3[%d] = %s\n",i,array3[i]);
		}
	}
}