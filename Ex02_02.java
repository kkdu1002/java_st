package Ex02;
//��Ű�� : package ��Ű����;
//��Ű��, ���� , ���丮 --> ����
//java.lang.* default package�� import�� �ʿ����
//�̸� class loader�� �޸𸮿� �÷�����

//		�� �ű�� alt ����Ű
import java.util.Scanner;

public class Ex02_02 {
	public static void main(String[] args) {
		int i , j ;
		int result ;
		Scanner s = new Scanner(System.in);
//		import����Ű --> ������ �Է��� cnt space , ���콺 ��ó�� ����
//		System.out.print("ù��° �� �Է�");
		i = s.nextInt();
//		System.out.print("�ι�° �� �Է�");
		j = s.nextInt();
		
		result = i + j;
		System.out.println(i + "+" + j + "=" + result);
		
		result = i - j;
		System.out.println(i + "-" + j + "=" + result);
		
		result = i * j;
		System.out.println(i + "*" + j + "=" + result);
		
		result = i / j;
		System.out.println(i + "/" + j + "=" + result);
		
		s.close();
	}
}
