package jang8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Ex 
{
	public static void main(String[] args) throws Exception 
	{
		File file = new File("src\\jang8\\file.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("FileWriter는 한글로된" + "\n");
		fw.write("문자열을 바로 출력할 수 있다.");
		
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}