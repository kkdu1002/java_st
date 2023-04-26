package jang8;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStream_Ex 
{
	public static void main(String[] args) throws Exception 
	{
		String originalFileName = 
		"src\\jang8\\dd.jpg";
		String targetFileName = "c:/tmp/ddd.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNO;
		byte[] readBytes = new byte[100];
		while( (readByteNO = fis.read(readBytes)) != -1)
		{
			fos.write(readBytes , 0 , readByteNO);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("복사가 잘 되었습니다.");
	}

}
