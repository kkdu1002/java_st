package jang8;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File_Ex {

	public static void main(String[] args) throws Exception 
	{
		File dir = new File("c:/tmp/dir");
		File file1 = new File("c:/tmp/file1.txt");
		File file2 = new File("c:/tmp/file2.txt");
		File file3 = new File(new URI("file:///C:/tmp/file3.txt"));
		
		if(dir.exists() == false)
		{
			dir.mkdirs();
		}
		if(file1.exists() == false)
		{
			file1.createNewFile();
		}
		if(file2.exists() == false)
		{
			file3.createNewFile();
		}
		if(file3.exists() == false)
		{
			file3.createNewFile();
		}
		
		File tmp = new File("C:/tmp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd  a  HH:mm");
		File[] contents = tmp.listFiles();
		System.out.println("날짜             시간       형태    크기     이름");
		System.out.println("--------------------------------------------------");
		for(File file : contents)
		{
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory())
			{
				System.out.print("\t<DIR>\t\t" + file.getName());
			}
			else
			{
				System.out.print("\t\t"+ file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}

}
