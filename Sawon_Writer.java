package jang12;

import java.io.*;

public class Sawon_Writer 
{
	public static void main(String[] args) throws IOException 
	{
		String file_Name = "src/jang12/sawon.txt";
		FileWriter fw = null;
		PrintWriter pw = null;
		try
		{
//			(String file_Name,boolean append)
//			�߰� x , �⺻(����) flase : ����� , true : �߰�
			fw = new FileWriter(file_Name,false);
//			������ ������ ���
			pw = new PrintWriter(fw);
			pw.println("ȫ�浿,90,90,90,90");
			pw.println("ȫ���,90,90,90,90");
			pw.println("����,90,90,90,90");
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		finally
		{
			fw.close();
			pw.close();
		}
	}
}