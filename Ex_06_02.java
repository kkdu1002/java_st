package jang6;

public class Ex_06_02 
{
	public static void main(String[] args) 
	{
		int i;
		
		System.out.println("for문");
		for (i = 0; i < 3 ;i++)
		{
			System.out.println("안녕하세요?");
			System.out.println("##또 안녕하세요?##");
		}
		System.out.println("while문");
		
		i = 0;
		while(i < 3) 
		{
			System.out.println("안녕하세요?");
			System.out.println("##또 안녕하세요?##");
			i++;
		}
		System.out.println("do while문");
		i = 0;
		do  
		{
			System.out.println("안녕하세요?");
			System.out.println("##또 안녕하세요?##");
			i++;
		}
		while(i < 3);
	}
}