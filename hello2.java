package jang2;

public class hello2 {
//	메소드 원형
//	접근지정자 지정자 변환형 메소드명(매개변수타입 변수명){return 반환값;}
	public static int sum(int n,int m) { // 전달받을 자료 타입
		return n + m;
	}
	public static void main(String[] args) {
//		System.out.println(args[0] + args[1]);
//		int i = Integer.parseInt(args[0]) == > 문자열을 정수로 변환
//		지역변수 : {}내에서만 사용가능 , 사용전에 반드시 초기화 되어있어야함
		int i = 20 ,s;
		char a;
		
		s = sum(i,10); // 자료타입에 맞는 값을 전달해야함 , 메소드 호출
		a = '?';
		System.out.printf("%c\n",a);
		System.out.printf("hello2\n");
		System.out.printf("%d",s);
	}
}
