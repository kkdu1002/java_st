package jang10;

public class UsingLocalVariable_Ex {
	void method(int arg)
	{ // �Ű����� ���������� ��� final
		int localVar = 40;
		
//		arg = 31;
//		localVar = 41;
		MyFunctionalInterface fi = () ->
		{
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar + "\n");
		};
		fi.method();
	}
	public static void main(String... args) 
	{
		UsingLocalVariable_Ex ulv = new UsingLocalVariable_Ex();
		ulv.method(20);
	}
}