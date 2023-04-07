package jang12;

import java.util.Scanner;

public class calculator 
{
	public int calcu(int op , int num1 , int num2) 
	{
		int result;
		
		switch(op) 
		{
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:
				result = num1 / num2;
				break;
			default:
				result = 0;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		calculator calc= new calculator(); //객체 생성 class명 이름 = new class명
		int res;
		int oper , a , b;
		
		System.out.print("계산 입력 ( 1 : + , 2 : - , 3 : * , 4 : /) : ");
		oper = s.nextInt();
		System.out.print("첫번째 숫자를 입력 : ");
		a =s.nextInt();
		System.out.print("첫번째 숫자를 입력 : ");
		b =s.nextInt();
		
		res = calc.calcu(oper,a,b);
		
		System.out.printf("계산 결과는 : %d\n",res);
	}

}
