package jang8;

public class Ex_08_04 {

	public static void main(String[] args) {
		char c1 = 'A' + 1; // ���� ���ͳ� +1 �ϸ� ����ȯ �Ͼ�� �ʴ´�.
		char c2 = 'A';
		//char c3 = c2 + 1; ������ ����
		//char �� ���� +1 �ϸ� int������ �� ��ȯ��.
		char c3 = (char)(c2 + 1);
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
	}

}
