package jang12;
// 1. call by value : ��ȯ�� o , �Ű����� o �ִ� �⺻�� ����
//	  ���� �����ؼ� �����ϰ� ���ƿͼ� ���������� ��ȭ x
public class array_uesmain4 
{
	public static String calc(int a ,int b , char c) 
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
		return "a+b";
	}
	public static void main(String[] args) 
	{	
		int a = 10;
		int b = 20;
		String tot;
		tot = calc(a,b,'+');
		tot = calc(a,b,'-');
		tot = calc(a,b,'*');
	}
}