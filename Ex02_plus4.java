package Ex02;

import java.util.Scanner;

public class Ex02_plus4 {
	public static void main(String[] args) {
		int num1 , num2 ,num3 ,num4 ;
		int result ;
		Scanner s = new Scanner(System.in);
//		import����Ű --> ������ �Է��� cnt space , ���콺 ��ó�� ����
		System.out.print("ù��° �� �Է�");
		num1 = s.nextInt();
		System.out.print("�ι�° �� �Է�");
		num2 = s.nextInt();
		System.out.print("����° �� �Է�");
		num3 = s.nextInt();
		System.out.print("�׹�° �� �Է�");
		num4 = s.nextInt();
		result = num1 + num2 + num3 + num4;
		System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "=" + result );
		
		s.close();
	}

}
