// boolean (1) , char (2) , short (2) , int (4) , long (8) byte(1) byte > 정수형 int취급
// float (4) , doulble (8) byte > 실수형 float f=2.5f(O) f=2.5(X) > 실수 기본형 double
package Ex02;

public class Ex02_01 {
	public static void main(String[] args) {
		int i , j ;
		int result ;
		i = 100;
		j = 50;
		
		result = i + j;
		System.out.println(i + "+" + j + "=" + result);
		
		result = i - j;
		System.out.println(i + "-" + j + "=" + result);
		
		result = i * j;
		System.out.println(i + "*" + j + "=" + result);
		
		result = i / j;
		System.out.println(i + "/" + j + "=" + result);
	}
}
