package jang8;

public class homework4
{
	public static void main(String[] args) 
	{
		System.out.println("��	��	ȭ	��	��	��	��");
			for (int i = -2; i <= 31; i++) 
			{
				if(i < 1)
					System.out.printf("\t");
				else
					System.out.printf("%d\t",i);
					if (i % 7 == 4)
						System.out.printf("\n");	
			}
	}
}
