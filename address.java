package jang12;

class Myint
{
	int a;
}
// call by reference == call by address : �ּ� ���� ��� : �������� �ش���
// ȣ���ϰ� ó���� �Ŀ� ������ ��ȭ �ִ�.
public class address 
{
	static void func1(Myint m) // ������ (parameter)
	{
		m.a = m.a + 1;
		System.out.printf("���޹��� a ==> %d\n", m.a);
	}
	public static void main(String[] args) 
	{
		Myint m = new Myint();
		m.a = 10;
		
		func1(m); //��������(argument)
		System.out.printf("���� ���� a ==> %d\n", m.a);
	}
}