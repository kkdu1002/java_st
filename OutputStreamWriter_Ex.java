package jang8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriter_Ex 
{
	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fos = new FileOutputStream("src/jang8/file.txt");
		Writer writer = new OutputStreamWriter(fos);
//		OutputStreamWriter �߰� ��Ʈ�� , �Ʒ�����(���α׷�)���� ���Ϸ� ����
//		2			<-		2 ----------------- 1
		String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("���� ������ �������ϴ�.");
	}
}
