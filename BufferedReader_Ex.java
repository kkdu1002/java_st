package jang8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReader_Ex
{
	public static void main(String[] args) throws Exception 
	{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력 : ");
		String lineString = br.readLine();
		
		System.out.println("출력 : " + lineString);
	}
}