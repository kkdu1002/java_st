package jang10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_10_07 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int x = 1;
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		
		String name_1 = "ö��" , name_2 = "����";
		int su , yong , count = 0;
		
		System.out.println("--����[1] , ����[2] , ��[3] ����--");
		while(count < 5) 
		{	
			count++;
			System.out.printf("%s >> ",name_1);
			su = (int) ((Math.random() * (3)) + 1);
			System.out.println(su);
//			su = Integer.parseInt(a.readLine()); 
			System.out.printf("%s >> ",name_2);
			yong = (int) ((Math.random() * (3)) + 1);
			System.out.println(yong);
//			yong = Integer.parseInt(a.readLine());
			
			
			if(su < yong)
				if(su == 1 && yong == 3)
					System.out.printf("%s�� �̰���ϴ�.\n",name_1);
				else
					System.out.printf("%s�� �̰���ϴ�.\n",name_2);
			else if(su == yong)
				System.out.printf("�����ϴ�.\n");
			else if(su > yong)
				if(su == 3 && yong == 1)
					System.out.printf("%s�� �̰���ϴ�.\n",name_2);
				else
					System.out.printf("%s�� �̰���ϴ�.\n",name_1);
			System.out.println();
		}
		System.out.printf("%d�� ��� �߽��ϴ�.",count);
	}
}