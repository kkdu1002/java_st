package jang3;

public class homework2 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i <= 15; i++)
		{
			System.out.printf("%d\t",i);
			if (i % 5 == 0)
			{
				System.out.printf("\n");
				
				for(int j = 1; j <= 5;j++) 
				{
					if (j == 5)
						if(i==15)
							System.out.printf("");
						else
							System.out.printf("¡Ú");
					else
						System.out.printf("\t");
				}
				System.out.printf("\n");
			}	
		}
	}
}