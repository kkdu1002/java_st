package jang8;

import java.io.FileInputStream;

public class FileInputStream_Ex 
{
	public static void main(String[] args) 
	{
		try
		{
//			����Ʈ ��Ʈ�� ����
			FileInputStream fis = 
			new FileInputStream("C:\\javaA_class\\util\\eclipse-workspace\\23-04-25_java"
									+ "\\src\\jang8\\FileInputStream_Ex.java");
			
			int data;
			while((data = fis.read()) != -1)
			{
				//print()�� ���ڷ� ����� ���� ĳ���� �ؾ��� , �׳� ����� 10�� ������ �����
				//System.out.print((char)data); // ȭ�鿡 ���ڷ� ��ȯ�ؼ� ���
				System.out.write(data); // ȭ�鿡 ���� �׷��� ���
			}
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}