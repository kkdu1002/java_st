package jang9;

public class Ex_09_12 
{
	public static void main(String[] args) 
	{
X:		for(char up = 'A'; up <= 'Z'; up++) 
		{
			for(char down = 'a'; down <= 'z'; down++ ) 
			{
				System.out.printf("%c - %c\n",up,down);
				if(down == 'g')	
				{
					System.out.println("프로그램 종료");
					break X;
				}
			}
		}
	}
}