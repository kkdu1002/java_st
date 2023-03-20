package Ex02;

import java.io.IOException;
import java.util.Scanner;

public class Ex02_cal_zero {
	public static void main(String[] args) throws IOException {
		int num1 , num2 , result;
		char sel_cal;
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산할 값 입력 ==> ");
		num1 = s.nextInt();
		System.out.print("<1> + <2> - <3> * <4> / <5> % ==> ");
		sel_cal = (char) System.in.read();
		System.out.print("두번째 계산할 값 입력 ==> ");
		num2 = s.nextInt();
		if (sel_cal == '+') 
		{
			result = num1 + num2;
			System.out.print(num1 + "+" + num2 + "=" + result);
		}
		else if(sel_cal == '-') 
		{
			result = num1 - num2;
			System.out.print(num1 + "-" + num2 + "=" + result);
		}
		else if (sel_cal == '*') 
		{
			result = num1 * num2;
			System.out.print(num1 + "*" + num2 + "=" + result);
		}
		else if (sel_cal == '/') 
		{
			if(num2 == 0) 
			{
				System.out.print("0으로 나누면 안됩니다.");
			}
			else 
			{
				result = num1 / num2;
				System.out.print(num1 + "/" + num2 + "=" + result);
			}
		}
		else if (sel_cal == '%') 
		{
			if(num2 == 0) 
			{
				System.out.print("0으로 나머지를 계산할 수 없습니다.");
			}
			else 
			{
				result = num1 % num2;
				System.out.print(num1 + "%" + num2 + "=" + result);
			}
		}
	s.close();
	}

}
