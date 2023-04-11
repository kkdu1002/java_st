package jang12;

public class ClassName240 
{
	int field1;
	void method1() {	}
	static int field2;
	static void method2() {		}
	
	static
	{ // 인스턴스 멤버변수 , 인스턴스 멤버 메소드 x
//		field1 = 10;
//		method1();
		field2 = 10;
		method2();
	}
	
	static void method5()
	{ //this.필드x / this.인스턴스 메소드()x
//		this.field1 = 10;
//		this.method1();
		field2 = 10;
		method2();
	}
	
	static void method3()
	{
		ClassName240 obj = new ClassName240();
		obj.field1 = 10;
		obj.method1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
