package jang11;

public class array2_pra05 
{
	public static void main(String[] args) 
	{
		int array[][] = new int[3][0];
		array[0] = new int[5];
		array[1] = new int[3];
		array[2] = new int[4];

		for(int i = 0; i < array.length;i++) 
		{
			for(int j = 0; j < array[i].length; j++) 
			{
				System.out.printf("%d\t",array[i][j]);
			}
			System.out.println("");
		}
	}
}