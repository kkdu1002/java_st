package jang8;

public class Ex_08_09 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		double currentBalance2 = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
		
		if(Double.isNaN(val)) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val = 0.0;
		}
		currentBalance2 += val;
		System.out.println(currentBalance2);
	}
}