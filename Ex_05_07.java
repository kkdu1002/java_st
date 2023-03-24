package jang3;

import java.util.Scanner;

public class Ex_05_07 
{
	public static void main(String[] args) 
	{
		Scanner x = new Scanner(System.in);
		int num1,num2,result = 0;
		char y = ' ';
		
		System.out.print("첫번째 수를 입력하세요. : ");
		num1 = x.nextInt();
		System.out.print("계산할 연산자를 입력하세요. : ");
		y = x.next().charAt(0);
		System.out.print("두번째 수를 입력하세요. : ");
		num2 = x.nextInt();
		
		while(num1 != 0 && num2 != 0) 
		{
			switch(y) 
			{
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				case '%':
					result = num1 % num2;
					break;
				default:
					System.out.printf("연산 식이 잘못 입력되었습니다.\n");
			}
			System.out.printf("%d %s %d = %d입니다.\n",num1,y,num2,result);
			System.out.println("끝내려면 첫번째 수와 두번째 수에 모두 0을 입력하세요.");
			System.out.print("첫번째 수를 입력하세요. : ");
			num1 = x.nextInt();
			System.out.print("계산할 연산자를 입력하세요. : ");
			y = x.next().charAt(0);
			System.out.print("두번째 수를 입력하세요. : ");
			num2 = x.nextInt();
		}
		System.out.print("----- 종료 -----");
	}
}
/*		
		while(num1 != 0 && num2 != 0)
			{
			if(y == '+') 
			{
				result = num1 + num2;
				System.out.printf("%d + %d = %d입니다.\n",num1,num2,result);
			}
			else if(y == '-') 
			{
				result = num1 - num2;
				System.out.printf("%d - %d = %d입니다.\n",num1,num2,result);
			}
			else if(y == '*') 
			{
				result = num1 * num2;
				System.out.printf("%d * %d = %d입니다.\n",num1,num2,result);
			}
			else if(y == '/') 
			{
				result = num1 / num2;
				System.out.printf("%d / %d = %d입니다.\n",num1,num2,result);
			}
			else if(y == '%') 
			{
				result = num1 % num2;
				System.out.printf("%d %% %d = %d입니다\n",num1,num2,result);
			}
			System.out.println("끝내려면 첫번째 수와 두번째 수에 모두 0을 입력하세요.");
			System.out.print("첫번째 수를 입력하세요. : ");
			num1 = x.nextInt();
			System.out.print("계산할 연산자를 입력하세요. : ");
			y = x.next().charAt(0);
			System.out.print("두번째 수를 입력하세요. : ");
			num2 = x.nextInt();
		}
		System.out.print("----- 종료 -----");
	}
}
*/