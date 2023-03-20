package test;

public class test01 {
//	멤버변수
//	접근지정자 지정자 자료타입 변수명 = 초기값;
//	기본값 초기화 되어있음.
//  기본형 , 메모리는 컴파일러가 크기 결정 , 스택영역
//	논리형
	boolean b; // false  1byte
//  정수형
	byte    by; // 0      1byte
	short   sh; // 0      2byte
	char    ch; // \0 = NULL    2byte
	int     i;  // 0   4byte
	long    l;  // 0   8byte
//  실수형
	float   f; // 0.0  4byte
	double  d; // 0.0  8byte
//  참조형 - 실행할 때 힙메모리에 영역확보)
	String  str;// NULL(아직 메모리가 없다.)
	public static void main(String[] args) {
		test01 t = new test01(); // 객체 생성
		
		System.out.println("---------기본형----------");
		System.out.println("boolean b = " + t.b);
		System.out.println("byte by = " + t.by);
		System.out.println("short sh = " + t.sh);
		System.out.println("char ch = " + t.ch);
		System.out.println("int i = " + t.i);
		System.out.println("long l = " + t.l);
		System.out.println("float f = " + t.f);
		System.out.println("double d = " + t.d);
		
		System.out.println("---------참조형----------");
		System.out.println("String str = " + t.str);
	}
}
