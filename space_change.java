package jang12;

public class space_change 
{
	static void chage_space(char array []) 
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == ' ')
				array[i] =',';
		}
	}
	static void print_char(char array[])
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		char c[]= {'t','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		print_char(c);
		chage_space(c);
		print_char(c);
	}
}