// boolean (1) , char (2) , short (2) , int (4) , long (8) byte(1) byte > ������ int���
// float (4) , doulble (8) byte > �Ǽ��� float f=2.5f(O) f=2.5(X) > �Ǽ� �⺻�� double
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
