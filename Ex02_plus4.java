package Ex02;

import java.util.Scanner;

public class Ex02_plus4 {
	public static void main(String[] args) {
		int num1 , num2 ,num3 ,num4 ;
		int result ;
		Scanner s = new Scanner(System.in);
//		import단축키 --> 적당히 입력후 cnt space , 마우스 근처에 놓기
		System.out.print("첫번째 값 입력");
		num1 = s.nextInt();
		System.out.print("두번째 값 입력");
		num2 = s.nextInt();
		System.out.print("세번째 값 입력");
		num3 = s.nextInt();
		System.out.print("네번째 값 입력");
		num4 = s.nextInt();
		result = num1 + num2 + num3 + num4;
		System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "=" + result );
		
		s.close();
	}

}
