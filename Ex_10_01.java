package jang10;

import java.util.Scanner;

public class Ex_10_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name = " ";
		int Kor = 0, Eng = 0, Math = 0, sum= 0;
		String Data;
		
		System.out.print("이름 국어 영어 수학 입력[공백구분] : ");
		
		Data = input.next();
		name = Data;
		Data = input.next();
		Kor = Integer.parseInt(Data);
		Data = input.next();
		Eng = Integer.parseInt(Data);
		Data = input.next();
		Math = Integer.parseInt(Data);
	
		sum = Kor + Eng + Math;
		
		System.out.printf("이름 : %s\n",name);
		System.out.printf("총점 : %d\n",sum);
		
		String Data1[] = "홍&길&동".split("&");
		for (int i = 0; i < Data1.length; i++) 
		{
			System.out.println(Data1[i] + " ");
		}
	}
}