package jang12;

public class ClassName240 
{
	int field1;
	void method1() {	}
	static int field2;
	static void method2() {		}
	
	static
	{ // �ν��Ͻ� ������� , �ν��Ͻ� ��� �޼ҵ� x
//		field1 = 10;
//		method1();
		field2 = 10;
		method2();
	}
	
	static void method5()
	{ //this.�ʵ�x / this.�ν��Ͻ� �޼ҵ�()x
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
