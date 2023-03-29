package jang7;

public class Ex_07_12 {

	public static void main(String[] args) {
		// int형이 long형으로 자동 캐스팅 -> 묵시적인 캐스팅
		long var1 = 10;
		long var2 = 20L;
	// 	long var3 = 1000_000_000_000; int형 범위에서 벗어남
		long var4 = 1000_000_000_000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
