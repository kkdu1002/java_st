package jang12;

import java.io.IOException;
import java.io.InputStream;

public class System_In_Ex2 
{
	public static void main(String[] args) throws IOException 
	{
		byte [] datas = new byte[100];
		InputStream is = System.in;
		
		System.out.print("�̸� : ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes - 2);
		
		System.out.print("�ϰ� ������ : ");
		int commentBytes = is.read(datas);
		String comment = new String(datas , 0 , commentBytes - 2);
		
		System.out.println("�Է��� �̸� : " + name);
		System.out.println("�Է��� �ϰ� ���� �� : " + comment);
	}
}