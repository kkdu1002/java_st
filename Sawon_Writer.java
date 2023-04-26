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
//			추가 x , 기본(생략) flase : 덮어쓰기 , true : 추가
			fw = new FileWriter(file_Name,false);
//			프린터 라이터 사용
			pw = new PrintWriter(fw);
			pw.println("홍길동,90,90,90,90");
			pw.println("홍길순,90,90,90,90");
			pw.println("고길순,90,90,90,90");
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