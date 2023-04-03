package jang11;

public class array_pra8 
{
	public static void main(String[] args) 
	{
		char alpa[];
		alpa = new char [26];
		
		for (int i = 0 ; i < alpa.length; i++) 
		{
			alpa[i] = (char)('A' + i);
			System.out.printf("%c ",alpa[i]);
		}
	}
}