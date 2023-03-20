package Ex02;

import java.util.Scanner;

public class Ex02_if_cal {
	public static void main(String[] args) {
		int num1 , num2 , sel_cal , result;
		Scanner s = new Scanner(System.in);
		System.out.print("Ã¹¹øÂ° °è»êÇÒ °ª ÀÔ·Â ==> ");
		num1 = s.nextInt();
		System.out.print("<1>µ¡¼À <2>»¬¼À <3>°ö¼À <4>³ª´°¼À ==> ");
		sel_cal = s.nextInt();
		System.out.print("µÎ¹øÂ° °è»êÇÒ °ª ÀÔ·Â ==> ");
		num2 = s.nextInt(); 
		if (sel_cal == 1) 
		{
			result = num1 + num2;
			System.out.print(num1 + "+" + num2 + "=" + result);
		}
		else if(sel_cal == 2) 
		{
			result = num1 - num2;
			System.out.print(num1 + "-" + num2 + "=" + result);
		}
		else if (sel_cal == 3) 
		{
			result = num1 * num2;
			System.out.print(num1 + "*" + num2 + "=" + result);
		}
		else if (sel_cal == 4) 
		{
			if(num2 == 0) 
			{
				System.out.print("0À¸·Î ³ª´©¸é ¾ÈµË´Ï´Ù.");
			}
			else 
			{
				result = num1 / num2;
				System.out.print(num1 + "/" + num2 + "=" + result);
			}
		}
		s.close();
	}
}
