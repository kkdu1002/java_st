package jang12;
// 1. call by value : ��ȯ�� x , �Ű����� o �ִ� �⺻�� ����
//	  ���� �����ؼ� �����ϰ� ���ƿͼ� ���������� ��ȭ x
public class array_uesmain3 
{
	// �޼ҵ� ���� / ��ȯ�� x(return �� x) , �Ű����� o
	public static void calc(int a ,int b , char c) 
	{
		switch(c) 
		{
			case ('+'):
				System.out.printf("%d + %d = %d\n",a,b,a + b);
				break;
			case ('-'):
				System.out.printf("%d - %d = %d\n",a,b,a - b);
				break;
			case ('*'):
				System.out.printf("%d * %d = %d\n",a,b,a * b);
				break;
			default:
				System.out.printf("�����ڰ� �̻��ϰ� �Էµ�\n");
				break;
		}
	}
	public static void main(String[] args) 
	{	
		int a = 10;
		int b = 20;
		
		calc(a,b,'+');
		calc(a,b,'-');
		calc(a,b,'*');
//		tot = a + b;
	//	System.out.printf("%d + %d = %d",a,b,tot);
//		tot = a - b;
	//	System.out.printf("%d - %d = %d",a,b,tot);
//		tot = a * b;
	//	System.out.printf("%d * %d = %d",a,b,tot);
	}
}