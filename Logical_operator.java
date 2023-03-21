package jang2;

public class Logical_operator {

@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println('a' > 'b');
// 		ASCII a =  0x61 , ASCII b = 0x62 false
		System.out.println(3 >= 2); // true
		System.out.println(-1 < 0); // true
		System.out.println(3.45 <= 2); // false
		System.out.println(3 == 2); // false
		System.out.println(3 != 2); // true
		System.out.println(!(3 != 2)); // (!(true)) = false
		System.out.println((3 > 2) && (3 > 4)); //(true) and (false) = false
		System.out.println((3 != 2) || (-1 > 0)); // (true) or (false) = true
		System.out.println((3 != 2) ^ (-1 > 0)); // (true) nor (false) = true
	}
}
