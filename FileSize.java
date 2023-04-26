package jang12;

import java.io.*;

public class FileSize 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("src/jang12/file.txt");
		System.out.println(f.getAbsolutePath());
		System.out.println("파일의 크기" + f.length());
//		FileReader이용해서 화면에 출력하기
		
		//FileWirter로 저장하기
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
			fw.write("학교종이 땡땡땡 어서 모이자");
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