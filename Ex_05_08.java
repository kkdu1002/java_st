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
		
		System.out.print("ù��° ���� �Է��ϼ���. : ");
		num1 = Integer.parseInt(x.readLine());
		System.out.print("����� �����ڸ� �Է��ϼ���. : ");
		y = x.readLine();
		System.out.print("�ι�° ���� �Է��ϼ���. : ");
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
					System.out.printf("���� ���� �߸� �ԷµǾ����ϴ�.\n");
			}
			System.out.printf("%d %s %d = %d�Դϴ�.\n",num1,y,num2,result);
			System.out.print("�����Ϸ��� �����ڿ� + , - , * , / , % �� �ƴ� �ٸ����� ��������.\n");
			System.out.print("ù��° ���� �Է��ϼ���. : ");
			num1 = Integer.parseInt(x.readLine());
			System.out.print("����� �����ڸ� �Է��ϼ���. : ");
			y = x.readLine();
			System.out.print("�ι�° ���� �Է��ϼ���. : ");
			num2 = Integer.parseInt(x.readLine());
		}
		System.out.print("----- ���� -----");
	}
}
		/*
		while(y.equals("+") || y.equals("-") || y.equals("*") || y.equals("/") || y.equals("%"))
		{
			if(y.equals("+")) 
			{
				result = num1 + num2;
				System.out.printf("%d + %d = %d�Դϴ�.\n",num1,num2,result);
			}
			else if(y.equals("-")) 
			{
				result = num1 - num2;
				System.out.printf("%d - %d = %d�Դϴ�.\n",num1,num2,result);
			}
			else if(y.equals("*")) 
			{
				result = num1 * num2;
				System.out.printf("%d * %d = %d�Դϴ�.\n",num1,num2,result);
			}
			else if(y.equals("/")) 
			{
				result = num1 / num2;
				System.out.printf("%d / %d = %d�Դϴ�.\n",num1,num2,result);
			}
			else if(y.equals("%")) 
			{
				result = num1 % num2;
				System.out.printf("%d %% %d = %d�Դϴ�\n",num1,num2,result);
			}
			System.out.print("�����Ϸ��� �����ڿ� + , - , * , / , % �� �ƴ� �ٸ����� ��������.\n");
			System.out.print("ù��° ���� �Է��ϼ���. : ");
			num1 = Integer.parseInt(x.readLine());
			System.out.print("����� �����ڸ� �Է��ϼ���. : ");
			y = x.readLine();
			System.out.print("�ι�° ���� �Է��ϼ���. : ");
			num2 = Integer.parseInt(x.readLine());
		}
		System.out.print("----- ���� -----");
	}
}
*/