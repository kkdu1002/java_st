package jang6;

public class Ex_06_16 
{
	public static void main(String[] args) 
	{
		int i = 1;
		
		while(i <= 5) 
		{
			System.out.printf("%d번 do while문을 공부합니다.\n",i);
			i++;
		}
		
		System.out.println();
		i = 1;
		
		do {
			System.out.printf("%d번 while문을 공부합니다.\n",i);
			i++; 
		}
		while(i <= 5) ;
	}
}