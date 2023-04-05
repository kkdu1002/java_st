package jang12;
// 1. call by value : 반환형 x , 매개변수 o 있는 기본값 전달
//	  값을 복사해서 전달하고 돌아와서 원래변수에 변화 x
public class array_uesmain3 
{
	// 메소드 원형 / 반환형 x(return 값 x) , 매개변수 o
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
				System.out.printf("연산자가 이상하게 입력됨\n");
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