package jang12;

public class array2_pra11 {

	public static void main(String[] args) 
	{
		int mathscore[][] = new int [2][3];
		int i,j;
		
		for(i = 0; i < mathscore.length;i++) 
		{
			for(j = 0; j < mathscore[i].length;j++)
			{
				System.out.printf("mathscore[%d][%d] = %d\n",i,j,mathscore[i][j]);
			}
		}
		System.out.println();
		
		int engscore[][] = new int [2][];
		engscore[0] = new int[2];
		engscore[1] = new int[3];

		for(i = 0; i < engscore.length;i++) 
		{
			for(j = 0; j < engscore[i].length;j++)
			{
				System.out.printf("engscore[%d][%d] = %d\n",i,j,engscore[i][j]);
			}
		}
		System.out.println();
		
		int javascore[][] = {{95,80},{92,96,80}};
		
		for(i = 0; i < javascore.length;i++) 
		{
			for(j = 0; j < javascore[i].length;j++)
			{
				System.out.printf("javascore[%d][%d] = %d\n",i,j,javascore[i][j]);
			}
		}
	}
}