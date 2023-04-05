package jang12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework9 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String name[] = new String [18];
		int k = 0;

		while(k != name.length)
		{	
			System.out.printf("%d) 이름 : ",k + 1);
			name[k] = input.readLine(); 
			k++;
		}
		System.out.println();
		System.out.println("우리반 학생들");
		System.out.println("----------------");
		for(int i = 0; i < name.length; i++) 
		{
			System.out.printf("%d) 이름 : %s\t", i+1 , name[i]);
			if(i % 3 == 2) 
			{
				System.out.println();
			}
		}
	}
}