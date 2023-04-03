package jang10;

import java.util.Scanner;

public class Ex_10_03 {

	public static void main(String[] args) 
	{
		int front , end;
		
		System.out.print("-를 포함한 주민번호를 입력하시오.");
		Scanner s = new Scanner(System.in).useDelimiter("\\s|-");
		
		front = s.nextInt();
		end = s.nextInt();
		System.out.printf("주민번호 앞번호 : %d",front);
		System.out.printf("주민번호 뒷번호 : %d",end);
	}
}