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
			System.out.printf("%d) �̸� : ",k + 1);
			name[k] = input.readLine(); 
			k++;
		}
		System.out.println();
		System.out.println("�츮�� �л���");
		System.out.println("----------------");
		for(int i = 0; i < name.length; i++) 
		{
			System.out.printf("%d) �̸� : %s\t", i+1 , name[i]);
			if(i % 3 == 2) 
			{
				System.out.println();
			}
		}
	}
}