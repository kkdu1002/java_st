package jang8;

public class Ex_08_07 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		int totalPieces = apple * 10;
		int temp = totalPieces - number;
		
		double result = apple  - number * pieceUnit; // float�� �⺻�� �ݿø� , double�� �ݿø� ����
		double result2 = temp / 10.0;
		
		System.out.println("��� �Ѱ����� ");
		System.out.println("0.7 ������ ���� , ");
		System.out.println(result + " ������ ���´�.");
		
		System.out.println("��� �Ѱ����� ");
		System.out.println("0.7 ������ ���� , ");
		System.out.println(result2 + " ������ ���´�.");
	}
}