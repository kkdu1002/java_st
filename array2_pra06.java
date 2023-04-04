package jang11;

public class array2_pra06 
{
	public static void main(String[] args) 
	{
		int mult[][] = new int [9][9];
		
		for(int i = 0 ; i < 9 ; i++) 
		{
			for(int j = 0; j < 9; j++) 
			{
				mult[i][j] = (i + 1) * (j + 1);
				System.out.printf("%d x %d = %d\t",(j + 1),(i + 1),mult[i][j]);
			}
			System.out.println();
		}
	}
}