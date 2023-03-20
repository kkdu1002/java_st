package Ex_03;

public class Ex_03_11 {
	public static void main(String[] args) {
		int a,b;
		char c,d;
		
		a = 0xF90A;
		b = 0x50;
		
		System.out.printf("%c \n",(char) a);
		
		c = (char) b;
		System.out.printf("%c \n",(char) c);
		
		d = '#';
		System.out.printf("%c의 ASCII값은 %d입니다. \n",d,(int) d);
	}
}
