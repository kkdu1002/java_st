// %d=����,%f=�Ǽ�,o=8����,%x=16����,%c='����',%s="���ڿ�" , %.1f ��ü.�Ҽ���
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