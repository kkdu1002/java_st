package Ex_03;

public class Ex_03_07 {
	public static void main(String[] args) {
		int num1,num2,num3,num4;
		
		num1 = 100 + 100;
		num2 = num1 + 100;
		num3 = num1 + num2 - 100;
		num4 = num1 + num2 + num3;
		System.out.printf("num1 , num2 , num3 , num4의 값 == > %d , %d , %d , %d\n",num1 , num2 , num3 ,num4);
		
		num1 = num2 = num3 = num4 = 100;
		System.out.printf("num1 , num2 , num3 , num4의 값 == > %d , %d , %d , %d\n",num1 , num2 , num3 ,num4);
		
		num1 = 100;
		num1 = num1 + 200;
		System.out.printf("num1의 값 == > %d\n",num1);
	}
}
