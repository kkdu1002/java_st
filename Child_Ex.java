package jang12;

public class Child_Ex 
{
	public static void main(String[] args) 
	{
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		
//		parent.method3(); // �θ� ����� ���� ����
		Child child2 = (Child) parent; // �ٿ� ĳ����
		child2.method3();
	}
}