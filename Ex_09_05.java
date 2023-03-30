package jang9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_09_05 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader po = new BufferedReader(new InputStreamReader(System.in));
		Scanner Po = new Scanner(System.in);
		String position = " ";
		char Position = ' ';

A:		while(true)
		{
			System.out.print("직급을 입력하세요 [부장,과장,사원,끝]: ");
			position = Po.nextLine();
			Position = position.charAt(0);
			switch(Position) 
			{
				case '부':
					System.out.printf("%s의 월급은 700만원 입니다.\n",position);
					break;
				case '과':
					System.out.printf("%s의 월급은 500만원 입니다.\n",position);
					break;
				case '끝':
					System.out.printf("종료합니다. \n");
					break A;
				default:
					System.out.printf("월급은 300만원 입니다.\n");
					break;
			}
		}

		/*
A:		while(true)
		{
			System.out.print("직급을 입력하세요 [부장,과장,사원,끝]: ");
			position = po.readLine();
//			position.substring(start, end)   ------ > 시작값 위치  ~ 끝값 위치까지 추출
			switch(position.substring(0, 1)) 
			{
				case "부":
					System.out.printf("%s의 월급은 700만원 입니다.\n",position);
					break;
				case "과":
					System.out.printf("%s의 월급은 500만원 입니다.\n",position);
					break;
				case "끝":
					System.out.printf("종료합니다. \n");
					break A;
				default:
					System.out.printf("월급은 300만원 입니다.\n");
					break;
			}
		}*/
	}
}