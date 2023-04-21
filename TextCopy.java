package jang12;

import java.io.*;

public class TextCopy 
{
	public static void main(String[] args)
	{
		File src = new File("C:\\windows\\system.ini");
		File dst = new File("C:\\tmp\\system.txt");
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		
		int c;
		try
		{
			fr = new FileReader(src);
			fw = new FileWriter(dst);
			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);
			while((c = in.read()) != -1)
			{
				out.write((char)c);
			}
			in.close();
			out.close();
			fr.close();
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("���� ���� ����");
		}
	}
}