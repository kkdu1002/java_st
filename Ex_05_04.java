package jang3;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_05_04 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{			
		BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
		// 2차 스트림 : 1바이트를 2바이트로 변경하는 클래스 (1차스트림 : 1바이트) System.in => 키보드
		// InputStreamReader => 1바이트 2바이트로 변경 읽음 BufferedReader ==> 버퍼에 저장
		int input_num;
		System.out.printf("1 ~ 4 중에 선택하세요. [0이거나 0보다 작으면 종료] : ");
		input_num = Integer.parseInt(z.readLine()); // 엔터가 들어오기 전까지 읽음
		
		//input_num = z.read(); // '0' --> 문자를 읽어서 정수형(아스키 코드값)
		//input_num = input_num - '0'; // 본래의 값으로 변경
		// readLine() => 무조건 String으로 읽음

		while(input_num > 0) 
		{
			switch(input_num) 
			{
				case 1:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 2:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 3:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 4:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				default:
					System.out.printf("이상한것을 선택했다.\n");
			}
			System.out.printf("1 ~ 4 중에 선택하세요. [0이거나 0보다 작으면 종료] : ");
			input_num = Integer.parseInt(z.readLine());
		}
		System.out.printf("----- 종료 -----");
		// for		
//		Scanner num = new Scanner(System.in);
//		input_num = num.nextInt();
//		int input_num;
	/*	
		System.out.printf("1 ~ 4 중에 선택하세요. [0이거나 0보다 작으면 종료] : ");
		for(input_num = num.nextInt();input_num > 0;) 
		{
			switch(input_num) 
			{
				case 1:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 2:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 3:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 4:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				default:
					System.out.printf("이상한것을 선택했다.\n");
			}
			System.out.printf("1 ~ 4 중에 선택하세요. [0이거나 0보다 작으면 종료] : ");
			input_num = num.nextInt();
		}
		System.out.printf("------ 종료 ------");
		num.close();
		*/
		
// while  hasNext 
/*
		System.out.printf("1 ~ 4 중에 선택하세요. [0이거나 0보다 작으면 종료] : ");
		
		while(num.hasNext()) 
		{
			input_num = num.nextInt();
			if (input_num < 0 || input_num == 0) 
			{
				System.out.printf("------ 종료 ------");
				break;
			}
			switch(input_num) 
			{
				case 1:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 2:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 3:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 4:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				default:
					System.out.printf("이상한것을 선택했다.\n");
			}
			System.out.printf("1 ~ 4 중에 선택하세요. [0이거나 0보다 작으면 종료] : ");
		}
*/	
		// while no hasNext 
/*
		System.out.printf("1 ~ 4 중에 선택하세요. [0이거나 0보다 작으면 종료] : ");
 		input_num = num.nextInt();
 		
 		while(input_num > 0)
		{
			switch(input_num) 
			{
				case 1:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 2:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 3:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				case 4:
					System.out.printf("%d를 선택했다.\n",input_num);
					break;
				default:
					System.out.printf("이상한것을 선택했다.\n");
			}
			System.out.printf("1 ~ 4 중에 선택하세요. [0이거나 0보다 작으면 종료] : ");
			input_num = num.nextInt();
		}
		System.out.printf("------ 종료 ------");
		*/
	}
}