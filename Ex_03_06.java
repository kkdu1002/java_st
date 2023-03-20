package Ex_03;

public class Ex_03_06 {
	public static void main(String[] args) {
		int i_num1,i_num2;
		float f_num1,f_num2;
		
		i_num1 = 100;
		i_num2 = i_num1;
		
		f_num1 = 111.1f;
		f_num2 = f_num1; 
		
		System.out.printf("i_num1, i_num2의 값 ==> %d , %d\n", i_num1,i_num2);
		System.out.printf("f_num1, f_num2의 값 ==> %5.1f , %5.1f\n", f_num1,f_num2);
	}
}
