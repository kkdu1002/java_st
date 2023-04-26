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
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치");
		ps.println("프린트가 출력하는것 처럼 ");
		ps.println("데이터를 출력합니다.");
		
		ps.flush();
		ps.close();
		fos.close();
	}
}