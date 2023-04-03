package jang10;

public class Ex_10_05 
{
	public static void main(String[] args) 
	{
		int a = 10 , b = -10;
		
		System.out.printf("~a : %s\n",Integer.toBinaryString(~a));
		System.out.printf("a : %s\n",Integer.toBinaryString(a));
		System.out.printf("b : %s\n",Integer.toBinaryString(b));
		System.out.printf("10진수 a : %2s\n" , a);
		System.out.printf("10진수 2의 보수 a :%2s\n" , ~a);
		
		
		System.out.printf("10진수 b : %2s\n", b);
		System.out.printf("10진수 2의 보수 b %3s\n :" , ~b);

		System.out.println(toBinaryString(a));
	}
	// 메소드 원형은 main 밖에 사용해야함
	public static String toBinaryString(int a) 
	{
		String str = Integer.toBinaryString(a);
		while(str.length() < 32) 
		{
			str = "0" + str;
		}
		return str;
	}
}