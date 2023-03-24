package jang3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_05_08 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int num1 , num2 ,result = 0;
		String y= " ";
		
		System.out.print("첫번째 수를 입력하세요. : ");
		num1 = Integer.parseInt(x.readLine());
		System.out.print("계산할 연산자를 입력하세요. : ");
		y = x.readLine();
		System.out.print("두번째 수를 입력하세요. : ");
		num2 = Integer.parseInt(x.readLine());
		while(y.equals("+") || y.equals("-") || y.equals("*") || y.equals("/") || y.equals("%"))
		{
			switch(y) 
			{
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;
				case "%":
					result = num1 % num2;
					break;
				default:
					System.out.printf("연산 식이 잘못 입력되었습니다.\n");
			}
			System.out.printf("%d %s %d = %d입니다.\n",num1,y,num2,result);
			System.out.print("종료하려면 연산자에 + , - , * , / , % 가 아닌 다른것을 넣으세요.\n");
			System.out.print("첫번째 수를 입력하세요. : ");
			num1 = Integer.parseInt(x.readLine());
			System.out.print("계산할 연산자를 입력하세요. : ");
			y = x.readLine();
			System.out.print("두번째 수를 입력하세요. : ");
			num2 = Integer.parseInt(x.readLine());
		}
		System.out.print("----- 종료 -----");
	}
}
		/*
		while(y.equals("+") || y.equals("-") || y.equals("*") || y.equals("/") || y.equals("%"))
		{
			if(y.equals("+")) 
			{
				result = num1 + num2;
				System.out.printf("%d + %d = %d입니다.\n",num1,num2,result);
			}
			else if(y.equals("-")) 
			{
				result = num1 - num2;
				System.out.printf("%d - %d = %d입니다.\n",num1,num2,result);
			}
			else if(y.equals("*")) 
			{
				result = num1 * num2;
				System.out.printf("%d * %d = %d입니다.\n",num1,num2,result);
			}
			else if(y.equals("/")) 
			{
				result = num1 / num2;
				System.out.printf("%d / %d = %d입니다.\n",num1,num2,result);
			}
			else if(y.equals("%")) 
			{
				result = num1 % num2;
				System.out.printf("%d %% %d = %d입니다\n",num1,num2,result);
			}
			System.out.print("종료하려면 연산자에 + , - , * , / , % 가 아닌 다른것을 넣으세요.\n");
			System.out.print("첫번째 수를 입력하세요. : ");
			num1 = Integer.parseInt(x.readLine());
			System.out.print("계산할 연산자를 입력하세요. : ");
			y = x.readLine();
			System.out.print("두번째 수를 입력하세요. : ");
			num2 = Integer.parseInt(x.readLine());
		}
		System.out.print("----- 종료 -----");
	}
}
*/