package jang12;

import java.io.*;

public class FileSize 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("src/jang12/file.txt");
		System.out.println(f.getAbsolutePath());
		System.out.println("������ ũ��" + f.length());
//		FileReader�̿��ؼ� ȭ�鿡 ����ϱ�
		
		//FileWirter�� �����ϱ�
		FileReader fi = null;
		try
		{
			fi = new FileReader("src/jang12/test1.txt");
			while(true)
			{
				int x = fi.read();
				if(x == -1)
					break;
				System.out.print((char)x);
			}
		}
		catch(FileNotFoundException e)
		{
			e.getStackTrace();
		}
		
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("src/jang12/filesize.txt");
			fw.write("�б����� ������ � ������");
		}
		catch(FileNotFoundException e)
		{
			e.getStackTrace();
		}
		finally
		{
			try
			{
				if(fw != null)
					fw.close();
			}
			catch(FileNotFoundException e)
			{
				e.getStackTrace();
			}
		}
	}
}