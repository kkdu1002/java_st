package jang12;
/*
	PrintStream
	모든 자료형을 출력할 수 있는 print(),println()메소드가 오버로딩 되어있다.
	프로그램이 시작되면 장치와 연결된 출력 스트림인 System.in , System.out ,
	System.err 객체가 PrintStream객체이다
	다른 스트림과는 다르게 플러쉬기능을 자동으로 처리할 수 있는 생성자를 가지고있다.
	모든 메소드는 예외처리를 하지 않는다.
	
	PrintWriter
	PrintWriter는 가른 스트림과 다르게 바이트 출력 스트림과 문자출력
	스트림을 가지고 객체를 생성할 수 있는 클래스이다.
	자동 플러쉬기능(auto flush)을 갖고있다.
	PrintWriter 클래스의 생성자는 FileNotFoundException예외를
	발생하기 때문에 반드시 예외처리를 해야한다
 */

import java.io.*;
public class PrintWriter_Ex
{

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintWriter pw = null;
		
		try
		{
			fos = new FileOutputStream("src/jang12/test1.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos,true);
			pw.println("상쾌한 아침입니다.");
			pw.println("기분 좋게 공부 해 봐요.");
			pw.println(150000);
			pw.println(true);
		}
		catch(FileNotFoundException e)
		{
			e.getStackTrace();
		}
		finally
		{
			try
			{
				if(fos != null)
					fos.close();
				if(bos != null)
					bos.close();
				if(pw != null)
					pw.close();
			}
			catch(FileNotFoundException e)
			{
				e.getStackTrace();
			}
		}
	}
}