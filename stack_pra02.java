package jang11;

import java.util.Scanner;

public class stack_pra02 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		char stack[] = new char[5];
		char car = 'A';
		int top = 0 , num = 0;

		while (num != 3) 
		{
			System.out.print("<1> �ڵ��� �ֱ� <2> �ڵ��� ���� <3> �� : ");
			num = input.nextInt();
			
			switch(num) 
			{
				case 1:
					if (top >= 5) 
					{
						System.out.printf("�ڵ����� ���̻� �ͳο� ���� ����\n");
					}
					else 
					{
						stack[top] = (char) (car + top);
						System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
						top++;
					}
					break;
				case 2:
					if (top <= 0) 
					{
						System.out.printf("�ͳο� �ڵ����� ����\n");
					}
					else 
					{
						top--;
						System.out.printf("%c �ڵ����� �ͳο��� ����\n", stack[top]);
						stack[top] = ' ';
					}
					break;
				case 3:
					System.out.printf("���� �ͳο� %d�밡 ����.\n",top);
					System.out.println("���α׷��� �����մϴ�.");
					break;
				default:
					System.out.printf("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
			}
		}
	}
}