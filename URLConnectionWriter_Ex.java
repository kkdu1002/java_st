package jang10;

import java.io.*;
import java.net.*;

public class URLConnectionWriter_Ex 
{
	public static void main(String[] args) 
	{
		try
		{
			URL aURL = new URL("http://www.httpbin.org/post");
			URLConnection uc = aURL.openConnection();
			uc.setDoOutput(true);
			OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream());
			out.write("fname = Kitae&Iname = Hwang");
			out.close();
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			String inputLine;
			while((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();	
		}
		catch(IOException e)
		{
			System.out.println("URL에 데이터를 입출력 중에 오류가 발생했습니다.");
		}
	}
}