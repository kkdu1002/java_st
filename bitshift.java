package jang2;

public class bitshift {
	public static void main(String[] args) {
		short a = (short) 0x55ff;
		short b = 0x00ff;
		
		System.out.printf("%x\n",a & b);
		System.out.printf("%x\n",a | b);
		System.out.printf("%x\n",a ^ b);
		System.out.printf("%x\n",~a);
		
		byte c = 20; // 0x14
		byte d = -8; // 0xf8
		
		System.out.println(c << 2);
		System.out.println(c >> 2);
		System.out.println(d >> 2);
		System.out.printf("%x\n",d >>> 2);
		
		/*
		 *  a = 0101 0101 1111 1111
			b = 0000 0000 1111 1111

			a & b = 0000 0000 1111 1111 == > 00ff
			a | b = 0101 0101 1111 1111 == > 55ff
			a ^ b = 0101 0101 0000 0000 == > 5500
			~a = 1010 1010 0000 0000 == > ffff aa00

			c = 0000 0000 0001 0100

			c << 2 == > 0000 0000 0101 0000 = 64+16 = 80
			c >> 2 == > 0000 0000 0000 0101 = 5

			d = 1111 1111 1111 1111 x 1111 1111 1111 1000

			d >> 2 == > 1111 1111 0000 0010 = -2
			d >>> 2 ==> 0011 1111 1111 1111 x 1111 1111 1111 1110 = 3FFF FFFE*/
	}
}
