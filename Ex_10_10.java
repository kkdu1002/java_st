package jang10;

import java.io.IOException;

public class Ex_10_10 
{
	public static void main(String[] args) throws IOException
	{
		while(true) 
		{
		
		System.out.print("알파벳 한 문자 입력 : ");
		int alpa = System.in.read();
		
		System.in.skip(2);
			if(alpa >= 65 && alpa <= 90) //대문자
			{
				if(alpa == 65 || alpa == 69 || alpa == 73 || alpa == 79 || alpa == 85)
					System.out.print("모음 Ok\n");
				else
					System.out.print("자음입니다.\n");
			}
			else if(alpa >= 97 && alpa <= 122) 
			{ //소문자
				if(alpa == 97 || alpa == 101 || alpa == 105 || alpa == 111 || alpa == 117)
					System.out.print("모음 Ok\n");
				else
					System.out.print("자음입니다.\n");
			}
			else if(alpa == '0') 
				break;
			else
				System.out.print("잘못된 입력입니다.\n");
		}
		System.out.print("끝");
	}
}