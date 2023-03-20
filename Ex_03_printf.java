// %d=정수,%f=실수,o=8진수,%x=16진수,%c='문자',%s="문자열" , %.1f 전체.소수만
package Ex_03;

public class Ex_03_printf {
	public static void main(String[] args) {
		System.out.printf("100 + 100");
		System.out.printf("\n");
		System.out.printf("%d",100 + 100);
		System.out.printf("\n");
		System.out.printf("%d + %d = %d\n",100,200,100 + 200);
		System.out.printf("%d / %d = %.1f\n",100,200,100 / 200f);
		System.out.printf("%d / %d = %f",100,200,0.5);
		}
}