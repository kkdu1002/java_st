package jang11;

public class array2_pra04 
{
	public static void main(String[] args) 
	{
		int array[][] = new int[5][5];
		int count = 1;
		
		for(int i = 0;i < array.length;i++) 
		{
			for(int j = 0;j < array.length;j++) 
			{
				array[i][j] = count;
				count++;
				System.out.printf("%d\t",array[i][j]);
			}
			System.out.println("");
		}
	}
}