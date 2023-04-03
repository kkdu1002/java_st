package jang11;

public class array2_pra03 
{
	public static void main(String[] args) 
	{
		int array[][] = new int[4][];
		array[0] = new int[4];
		array[1] = new int[1];
		array[2] = new int[1];
		array[3] = new int[4];
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			for(int j = 0;  j < array[i].length;j++) 
			{
				array[i][j] = count;
				count++;
				System.out.printf("%d\t",array[i][j]);
			}
			System.out.println();
		}
	}
}