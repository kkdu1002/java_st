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
		
		fw.write("FileWriter�� �ѱ۷ε�" + "\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�.");
		
		fw.flush();
		fw.close();
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}
}