package jang8;

public class Ex_08_04 {

	public static void main(String[] args) {
		char c1 = 'A' + 1; // 문자 리터널 +1 하면 형변환 일어나지 않는다.
		char c2 = 'A';
		//char c3 = c2 + 1; 컴파일 에러
		//char 형 변수 +1 하면 int형으로 형 변환됨.
		char c3 = (char)(c2 + 1);
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
	}

}
