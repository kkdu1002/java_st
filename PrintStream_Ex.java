package jang8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStream_Ex
{
	public static void main(String[] args) throws Exception 
	{	
		FileOutputStream fos = new FileOutputStream("C:/tmp/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[������ ���� ��Ʈ��]");
		ps.print("��ġ");
		ps.println("����Ʈ�� ����ϴ°� ó�� ");
		ps.println("�����͸� ����մϴ�.");
		
		ps.flush();
		ps.close();
		fos.close();
	}
}