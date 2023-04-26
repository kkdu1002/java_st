package jang12;
/*
	PrintStream
	��� �ڷ����� ����� �� �ִ� print(),println()�޼ҵ尡 �����ε� �Ǿ��ִ�.
	���α׷��� ���۵Ǹ� ��ġ�� ����� ��� ��Ʈ���� System.in , System.out ,
	System.err ��ü�� PrintStream��ü�̴�
	�ٸ� ��Ʈ������ �ٸ��� �÷�������� �ڵ����� ó���� �� �ִ� �����ڸ� �������ִ�.
	��� �޼ҵ�� ����ó���� ���� �ʴ´�.
	
	PrintWriter
	PrintWriter�� ���� ��Ʈ���� �ٸ��� ����Ʈ ��� ��Ʈ���� �������
	��Ʈ���� ������ ��ü�� ������ �� �ִ� Ŭ�����̴�.
	�ڵ� �÷������(auto flush)�� �����ִ�.
	PrintWriter Ŭ������ �����ڴ� FileNotFoundException���ܸ�
	�߻��ϱ� ������ �ݵ�� ����ó���� �ؾ��Ѵ�
 */

import java.io.*;
public class PrintWriter_Ex
{

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintWriter pw = null;
		
		try
		{
			fos = new FileOutputStream("src/jang12/test1.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos,true);
			pw.println("������ ��ħ�Դϴ�.");
			pw.println("��� ���� ���� �� ����.");
			pw.println(150000);
			pw.println(true);
		}
		catch(FileNotFoundException e)
		{
			e.getStackTrace();
		}
		finally
		{
			try
			{
				if(fos != null)
					fos.close();
				if(bos != null)
					bos.close();
				if(pw != null)
					pw.close();
			}
			catch(FileNotFoundException e)
			{
				e.getStackTrace();
			}
		}
	}
}