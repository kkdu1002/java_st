package jang10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_10_06 
{
	public static void main(String[] args) throws IOException 
	{
		int x;
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) 
		{
			System.out.print("������ ���� �Է� [0 : ����] : ");
			x = Integer.parseInt(a.readLine());
			System.out.println();
			if(x == 0)
				break;
			System.out.printf("===[�Ǻ����]===\n");
				System.out.println((x % 2 == 1)?(x + " ===> Ȧ��"):(x + " ===> ¦��"));
		}
	}
}