// -붙이면 왼쪽으로 찍고 나머지 공백 , 7.3f = 전체자리 7개 + 소수점 세번째자리까지
package Ex_03;

public class Ex_03_03 {
	public static void main(String[]args) {
		System.out.printf("%d\n",123);
		System.out.printf("%-5d\n",123);
		System.out.printf("%05d\n",123);
		
		System.out.printf("%f\n",123.45);
		System.out.printf("%7.1f\n",123.45);
		System.out.printf("%7.3f\n",123.45);
		
		System.out.printf("%s\n","Hi~Java");
		System.out.printf("%10s\n","Hi~Java");
	}
}
