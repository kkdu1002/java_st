package test;

public class test01 {
//	�������
//	���������� ������ �ڷ�Ÿ�� ������ = �ʱⰪ;
//	�⺻�� �ʱ�ȭ �Ǿ�����.
//  �⺻�� , �޸𸮴� �����Ϸ��� ũ�� ���� , ���ÿ���
//	����
	boolean b; // false  1byte
//  ������
	byte    by; // 0      1byte
	short   sh; // 0      2byte
	char    ch; // \0 = NULL    2byte
	int     i;  // 0   4byte
	long    l;  // 0   8byte
//  �Ǽ���
	float   f; // 0.0  4byte
	double  d; // 0.0  8byte
//  ������ - ������ �� ���޸𸮿� ����Ȯ��)
	String  str;// NULL(���� �޸𸮰� ����.)
	public static void main(String[] args) {
		test01 t = new test01(); // ��ü ����
		
		System.out.println("---------�⺻��----------");
		System.out.println("boolean b = " + t.b);
		System.out.println("byte by = " + t.by);
		System.out.println("short sh = " + t.sh);
		System.out.println("char ch = " + t.ch);
		System.out.println("int i = " + t.i);
		System.out.println("long l = " + t.l);
		System.out.println("float f = " + t.f);
		System.out.println("double d = " + t.d);
		
		System.out.println("---------������----------");
		System.out.println("String str = " + t.str);
	}
}
