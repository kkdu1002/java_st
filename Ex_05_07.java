package jang3;

import java.util.Scanner;

public class Ex_05_07 
{
	public static void main(String[] args) 
	{
		Scanner x = new Scanner(System.in);
		int num1,num2,result = 0;
		char y = ' ';
		
		System.out.print("ù��° ���� �Է��ϼ���. : ");
		num1 = x.nextInt();
		System.out.print("����� �����ڸ� �Է��ϼ���. : ");
		y = x.next().charAt(0);
		System.out.print("�ι�° ���� �Է��ϼ���. : ");
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
					System.out.printf("���� ���� �߸� �ԷµǾ����ϴ�.\n");
			}
			System.out.printf("%d %s %d = %d�Դϴ�.\n",num1,y,num2,result);
			System.out.println("�������� ù��° ���� �ι�° ���� ��� 0�� �Է��ϼ���.");
			System.out.print("ù��° ���� �Է��ϼ���. : ");
			num1 = x.nextInt();
			System.out.print("����� �����ڸ� �Է��ϼ���. : ");
			y = x.next().charAt(0);
			System.out.print("�ι�° ���� �Է��ϼ���. : ");
			num2 = x.nextInt();
		}
		System.out.print("----- ���� -----");
	}
}
/*		
		while(num1 != 0 && num2 != 0)
			{
			if(y == '+') 
			{
				result = num1 + num2;
				System.out.printf("%d + %d = %d�Դϴ�.\n",num1,num2,result);
			}
			else if(y == '-') 
			{
				result = num1 - num2;
				System.out.printf("%d - %d = %d�Դϴ�.\n",num1,num2,result);
			}
			else if(y == '*') 
			{
				result = num1 * num2;
				System.out.printf("%d * %d = %d�Դϴ�.\n",num1,num2,result);
			}
			else if(y == '/') 
			{
				result = num1 / num2;
				System.out.printf("%d / %d = %d�Դϴ�.\n",num1,num2,result);
			}
			else if(y == '%') 
			{
				result = num1 % num2;
				System.out.printf("%d %% %d = %d�Դϴ�\n",num1,num2,result);
			}
			System.out.println("�������� ù��° ���� �ι�° ���� ��� 0�� �Է��ϼ���.");
			System.out.print("ù��° ���� �Է��ϼ���. : ");
			num1 = x.nextInt();
			System.out.print("����� �����ڸ� �Է��ϼ���. : ");
			y = x.next().charAt(0);
			System.out.print("�ι�° ���� �Է��ϼ���. : ");
			num2 = x.nextInt();
		}
		System.out.print("----- ���� -----");
	}
}
*/