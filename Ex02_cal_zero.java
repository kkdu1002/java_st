package Ex02;

import java.io.IOException;
import java.util.Scanner;

public class Ex02_cal_zero {
	public static void main(String[] args) throws IOException {
		int num1 , num2 , result;
		char sel_cal;
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ����� �� �Է� ==> ");
		num1 = s.nextInt();
		System.out.print("<1> + <2> - <3> * <4> / <5> % ==> ");
		sel_cal = (char) System.in.read();
		System.out.print("�ι�° ����� �� �Է� ==> ");
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
				System.out.print("0���� ������ �ȵ˴ϴ�.");
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
				System.out.print("0���� �������� ����� �� �����ϴ�.");
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
