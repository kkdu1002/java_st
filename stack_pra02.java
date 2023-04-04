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
			System.out.print("<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝 : ");
			num = input.nextInt();
			
			switch(num) 
			{
				case 1:
					if (top >= 5) 
					{
						System.out.printf("자동차가 더이상 터널에 들어갈수 없음\n");
					}
					else 
					{
						stack[top] = (char) (car + top);
						System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
						top++;
					}
					break;
				case 2:
					if (top <= 0) 
					{
						System.out.printf("터널에 자동차가 없음\n");
					}
					else 
					{
						top--;
						System.out.printf("%c 자동차가 터널에서 빠짐\n", stack[top]);
						stack[top] = ' ';
					}
					break;
				case 3:
					System.out.printf("현재 터널에 %d대가 있음.\n",top);
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.printf("잘못 입력했습니다. 다시 입력하세요");
			}
		}
	}
}