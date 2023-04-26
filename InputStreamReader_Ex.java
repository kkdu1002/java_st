package jang8;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReader_Ex 
{
	public static void main(String[] args) throws Exception 
	{
		InputStream is = System.in;
//		InputStreamReader 중계 스트림 , 키보드로 입력해서 화면으로 읽어오기
//		2			<-		2 ----------------- 1
		Reader reader = new InputStreamReader(is);
		
		int readCharno;
		char[] cbuf = new char[100];
		while((readCharno = reader.read(cbuf)) != -1)
		{
			String data = new String(cbuf , 0 , readCharno);
			System.out.print(data);
		}
		reader.close();
	}
}