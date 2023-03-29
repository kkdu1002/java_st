package jang8;

public class Ex_08_13 {

	public static void main(String[] args) {
		int charCode = 'A'; // 65
		// 65 >= 65   and   65 <= 90  ( true = true and true)
		if((charCode >= 65) & (charCode <= 90))
		{	// 양쪽 다 검사
			System.out.println("대문자 이군요");
		}
		// 65 >= 97   and   65 <= 122  ( false = false and true)
		if((charCode >= 97) && (charCode <= 122))
		{ // 왼쪽만 검사 false 더 효율적임
			System.out.println("소문자 이군요");
		}
		// !(65 >= 48)   and   !(65 <= 57)  !(false) == true and !(true) == false
		if(!(charCode < 48) && !(charCode > 57))
		{
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		if((value  % 2 == 0) | (value % 3 == 0))
		{
			System.out.println("2또는 3의 배수 이군요");
		}
		if((value  % 2 == 0) || (value % 3 == 0))
		{ // 왼쪽만 true 검사
			System.out.println("2또는 3의 배수 이군요");
		}
	}

}
