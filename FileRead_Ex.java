package jang8;

import java.io.FileReader;

public class FileRead_Ex 
{
	public static void main(String[] args) throws Exception 
	{
		FileReader fr = new FileReader("src\\jang8\\FileRead_Ex.java");
		
		int readCharno;
		char[] cbuf = new char[100];
		while((readCharno = fr.read(cbuf)) != -1)
		{
			String data = new String(cbuf , 0 , readCharno);
			System.out.print(data);
		}
		fr.close();
	}
}