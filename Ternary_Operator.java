package jang2;

public class Ternary_Operator {

	public static void main(String[] args) {
		int a = 3 , b = 5 , result = 0;
		
		System.out.println("------ 3�� ������(���ǿ�����)�� ��� ------");
		System.out.println("�� ���� ���� " + ((a > b) ? ( a - b) : (b - a)));
		
		System.out.println("------ 3�� ������(���ǿ�����)�� ��� result ------");
		System.out.println("�� ���� ���� " + ((a > b) ? (result = a - b) : (a < b) ? (result = b - a) : 0));
		//                                   if                         else if                     else
		
		System.out.println("------ if������ ��� ------");
		if(a > b) 
			System.out.println("�� ���� ���� " + (a - b));
		else
			System.out.println("�� ���� ���� " + (b - a));
		
		System.out.println("------ else if������ ��� ------");
		if (a > b) 
		{
			result = a - b;
			System.out.println("�� ���� ���� " + result);
		}
		else if (a < b) 
		{
			result = b - a;
			System.out.println("�� ���� ���� " + result);
		}
		else 
		{
			System.out.println(0);
		}
	}

}
