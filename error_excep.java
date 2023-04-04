package jang11;

import java.util.Scanner;

public class error_excep 
{
	public static void main(String[] args) 
	{
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("나뉨수를 입력하시오:");
		dividend = rd.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = rd.nextInt();
		
		try 
		{ // 예외 검사 후 이상이 없으면 수행
			System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
		} 
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage() + "0으로 나누었어요");
		}
		finally 
		{ //이상 유무와 관계없이 수행함 , 주로 자원 반납할 때 함.
			System.out.println("항상 수행");
		}
	}
}