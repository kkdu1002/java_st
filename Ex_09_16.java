package jang9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_09_16 
{	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		
A:		while(true) 
		{
			System.out.print("임의의 정수 입력 [0 : 종료] : ");
			int su = Integer.parseInt(x.readLine());
			if(su == 0) 
			{
				break A;
			}
			else if(su % 2 == 0)
			{
				System.out.printf("%d ===> 짝수\n",su);
			}
			else
			{
				System.out.printf("%d ===> 홀수\n",su);
			}
			System.out.println("");
		}
		System.out.printf("종료");
	}
}