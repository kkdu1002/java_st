package jang3;

public class Ex_04_07 
{
	public static void main(String[] args) 
	{
		byte a ='A' , b;
		byte mask = 0x0F;
		
		System.out.printf("%x & %x = %x \n",a ,mask ,a & mask);
		// A = 0100 0001
	//  0x0F = 0000 1111
//  A & 0x0F = 0000 0001  =  1
		
		System.out.printf("%x | %x = %x \n",a ,mask ,a | mask);
		// A = 0100 0001
	//  0x0F = 0000 1111
//  A | 0x0F = 0100 1111  =  4F	
		
		mask = 'a' - 'A';
	//   97 - 65 = 32
		
		b = (byte) (a ^ mask);
		System.out.printf("%c ^ %d = %c \n",a ,mask ,b);
		//  A = 0100 0001
	//   mask = 0010 0000  
//   A ^ mask = 0110 0001 = 61 = a
		
		a = (byte) (b ^ mask);
		System.out.printf("%c ^ %d = %c \n",b ,mask ,a);
	//      a = 0110 0001
	//   mask = 0010 0000  
//   a ^ mask = 0100 0001 = 41 = A 
	}

}
