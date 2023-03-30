package jang9;

import java.io.IOException;

public class Ex_09_14 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.print("한 문자 입력 : ");
		char alpa = (char) System.in.read();
		
		System.in.skip(2);
		/*
		System.in.read();
		System.in.read();
		*/
		System.out.print("한 자리 정수 입력 : ");
		int num = System.in.read();
	
		System.out.println();
		
		System.out.printf("입력한 문자: %c\n",alpa);
		System.out.printf("입력한 정수 : %c\n",num);
		System.out.printf("입력한 문자: %d\n",num);
	}
}
