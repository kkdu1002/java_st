package jang2;

public class hello2 {
//	�޼ҵ� ����
//	���������� ������ ��ȯ�� �޼ҵ��(�Ű�����Ÿ�� ������){return ��ȯ��;}
	public static int sum(int n,int m) { // ���޹��� �ڷ� Ÿ��
		return n + m;
	}
	public static void main(String[] args) {
//		System.out.println(args[0] + args[1]);
//		int i = Integer.parseInt(args[0]) == > ���ڿ��� ������ ��ȯ
//		�������� : {}�������� ��밡�� , ������� �ݵ�� �ʱ�ȭ �Ǿ��־����
		int i = 20 ,s;
		char a;
		
		s = sum(i,10); // �ڷ�Ÿ�Կ� �´� ���� �����ؾ��� , �޼ҵ� ȣ��
		a = '?';
		System.out.printf("%c\n",a);
		System.out.printf("hello2\n");
		System.out.printf("%d",s);
	}
}
