// num1 = (int)123.55f; 강제 캐스팅 = 강제형 변환 = 명시적인 형 변환, 값 보존안됨
// num2 = 200; 자동 캐스팅 = 묵시적인 형변환 = 자동 형 변환, 값 보존 됨
package Ex_03;

public class Ex_03_05 {
	public static void main(String[] args) {
		int num1;
		float num2;
		
		num1 = (int)123.55f;
		num2 = 200;
		
		System.out.printf("num1의 값 == > %d\n",num1);
		System.out.printf("num2의 값 == > %f\n",num2);
	}
}
