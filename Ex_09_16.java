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
			System.out.print("������ ���� �Է� [0 : ����] : ");
			int su = Integer.parseInt(x.readLine());
			if(su == 0) 
			{
				break A;
			}
			else if(su % 2 == 0)
			{
				System.out.printf("%d ===> ¦��\n",su);
			}
			else
			{
				System.out.printf("%d ===> Ȧ��\n",su);
			}
			System.out.println("");
		}
		System.out.printf("����");
	}
}