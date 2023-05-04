package jang10;

import java.net.*;
import java.io.*;

public class URLRead_Ex 
{
	public static void main(String[] args) 
	{
		try
		{
			URL aURL = new URL("https://www.naver.com/");
			BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream(),"UTF-8"));
			String inputLine;
			
			while((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();
		}
		catch(IOException e)
		{
			System.out.println("URL에서 데이터를 읽는 중 오류가 발생했습니다");
		}

	}

}
