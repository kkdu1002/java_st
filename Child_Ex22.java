package jang12;

public class Child_Ex22 
{
	public static void main(String[] args) 
	{
		Parent22 p22 = new Parent22();
		p22.field1 = "data1";
		
		p22.method1();
		p22.method2();
		
//		p22.field2 = "data2";
//		p22.method3();

		
		Child22 c22 = new Child22();
		c22.field2 = "yyy";
		c22.method3();
	}
}