package jang12;
// 1. call by value : 반환형 o , 매개변수 o 있는 기본값 전달
//	  값을 복사해서 전달하고 돌아와서 원래변수에 변화 x
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
				System.out.printf("연산자가 이상하게 입력됨\n");
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