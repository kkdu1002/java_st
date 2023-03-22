package jang2;

public class Unary_Operator {

	public static void main(String[] args) {
		int opr = 0;
		opr += 3;
		
		System.out.println(opr++);
		System.out.println(opr);
		
		System.out.println(++opr);
		System.out.println(opr);
		
		System.out.println(opr--);
		System.out.println(opr);
		
		System.out.println(--opr);
		System.out.println(opr);
	}
}
