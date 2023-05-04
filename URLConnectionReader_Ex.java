package jang10;

import java.io.*;
import java.net.*;

public class URLConnectionReader_Ex 
{
	public static void main(String[] args) 
	{
		try
		{
			URL aURL = new URL("https://www.naver.com/");
			
			URLConnection uc = aURL.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream(),"UTF-8"));
			String inputLine;
			while((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();
		}
		catch(IOException e)
		{
			System.out.println("URL���� �����͸� �д� �� ������ �߻��߽��ϴ�.");
		}
	}
}