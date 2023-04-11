/*
 생성자와 초기화 블럭
 클래스 변수의 초기화 시점 : 클래스가 처음로딩될때 단 한번 초기화 된다.
 인스턴스변수의 초기화 시점 : 인스턴스가 생성될 때 마다 각 인스턴스별로 초기화가 이루어진다
 
 클래스 변수의 초기화 순서 : 기본값(묵시적초기화) - 명시적 초기화 - 클래스초기화 블럭 - 인스턴스 초기화 블럭
 인스턴스 변수의 초기화 순서 : 기본값(묵시적초기화) - 명시적 초기화 - 인스턴스 초기화 블럭 - 생성자

출력 )
적정초기화
인스턴스 초기화
n : 0 , m : 0 , s : 200
디폴트생성자
ob1.m = 0
ob1.n = 3
n : 3 , m : 0 , s : 200
인스턴스 초기화
n : 0 , m : 0 , s : 200
디폴트 생성자
ob1.m = 0
ob1.n = 3
n : 3 , m : 0 , s : 200
 */
package jang12;

public class init {
	int n;
	int m;
	static int  s;
	init()
	{
	//	 n = 1000;
	//	 m = 3000;
		System.out.println("\n디폴트 생성자");
	}
	
	// 인스턴스 초기화 블럭
	{ // 모두(정적/동적 : 메소드,필드) 허용
	//	 s = 300; //static
	// n = 500;
	// m = 300;
	System.out.println("\n인스턴스 초기화");
	write(); // 동적(인스턴스)메소드
	write2(); // 정적(static)메소드 o
	this.n = 3; // this o
	}
	
	// 정적초기화 블럭
	static 
	{
		s = 900;
		// n = 500; // error 정적필드/메소드만 와야함
		// m = 300; // error 정적필드/메소드만 와야함
		System.out.println("\n정적 초기화 " + s);
	//	write(); // 동적(인스턴스)메소드 x
		write2();
	//	this.n = 3; this x
	}
	
	init(int n, int m)
	{
		this.n = n;
		this.m = m;
	}
	
	void write()
	{
		System.out.println("n :" + n +", m : " + m + ", s : " + s);
	}
	
	static void write2() {}
	
	public static void main(String[] args) 
	{
		init ob1 = new init();
		System.out.println("ob1.m = " + ob1.m);
		System.out.println("ob1.n = " + ob1.n);
		ob1.write();
		
		init ob2 = new init();
		System.out.println("ob2.m = " + ob2.m);
		System.out.println("ob2.n = " + ob2.n);
		ob2.write();
	}

}
