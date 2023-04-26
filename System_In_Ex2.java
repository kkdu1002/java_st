package jang12;

import java.io.IOException;
import java.io.InputStream;

public class System_In_Ex2 
{
	public static void main(String[] args) throws IOException 
	{
		byte [] datas = new byte[100];
		InputStream is = System.in;
		
		System.out.print("이름 : ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes - 2);
		
		System.out.print("하고 싶은말 : ");
		int commentBytes = is.read(datas);
		String comment = new String(datas , 0 , commentBytes - 2);
		
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 하고 싶은 말 : " + comment);
	}
}