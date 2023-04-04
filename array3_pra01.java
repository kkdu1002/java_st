package jang11;

public class array3_pra01 
{
	public static void main(String[] args) 
	{
		int array[][][] =
				{
					{
							{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12}
					}
										,
					{
							{13,14,15,16},
							{17,18,19,20},
							{21,22,23,24}
					}
				};
		System.out.printf("------- for ----------\n");
		for (int i = 0; i < array.length; i++) //2 면
		{
			System.out.printf("%d면\n", i + 1);
			for (int j = 0; j < array[i].length; j++) //3 row
			{
				for (int k = 0; k < array[i][j].length; k++) //4 col
				{
					System.out.printf("\t%d", array[i][j][k]);
				}
				System.out.println();
			}
		}
		
		System.out.printf("------- for each----------\n");
		
		int count = 1;
		for(int i[][] : array) //2 면
		{
			System.out.printf("%d면\n",count++);
			for(int j[] : i) //3 row
			{
				for(int k : j) //4 col
				{
					System.out.printf("\t%d",k);
				}
				System.out.println();
			}
		}
	}
}