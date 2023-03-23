package jang3;

public class Ex_04_06 
{
	public static void main(String[] args) 
	{
		System.out.printf("10 & 7 = %d\n",10 & 7);
		// 10 = 1010 
		//	7 = 0111
	// 10 & 7 = 0010 = 2
		
		System.out.printf("123 & 456 = %d\n",123 & 456);
		// 123 = 001111011
		// 456 = 111001000
//   123 & 456 = 001001000 = 72
		
		System.out.printf("0xFFFF & 0000 = %d\n",0xFFFF & 0000);
		// 0 x FFFF = 0 x 1111 1111 1111 1111
		// 0000     = 0 x 0000 0000 0000 0000
//    0xFFFF & 0000	= 0 x 0000 0000 0000 0000 = 0	
	}
}
