package jang12;
/*
	��Ű�� �ּ� ó���ϰ� �������� �Ŀ� ����ô� ��������
	c:\> javac ConsoleExample.java ����������
	c:\> java ConsoleExample �����ؾ���
	classpath = java_home\lib;. �ؾ� �ε��� �� �ִ�.
	
	��Ź��
1.	�ܹ��� : ���� , �۽� , ���� , tv
2.	�����(������) : ����/�۽� ���ð��� , ��ȭ��
3.	������ : �۽�/���� ��� ������, ����x, ������
 */
import java.io.Console;

public class Console_Ex 
{
	public static void main(String[] args) 
	{
		Console console = System.console();
		
		System.out.print("���̵� : ");
		String id = console.readLine();
		
		System.out.print("�н����� : ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("---------------------");
		System.out.println(id);
		System.out.println(strPassword);
	}
}