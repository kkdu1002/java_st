package jang8;

public class Ex_08_07 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		int totalPieces = apple * 10;
		int temp = totalPieces - number;
		
		double result = apple  - number * pieceUnit; // float은 기본이 반올림 , double은 반올림 없음
		double result2 = temp / 10.0;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면 , ");
		System.out.println(result + " 조각이 남는다.");
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면 , ");
		System.out.println(result2 + " 조각이 남는다.");
	}
}