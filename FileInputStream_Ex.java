package jang8;

import java.io.FileInputStream;

public class FileInputStream_Ex 
{
	public static void main(String[] args) 
	{
		try
		{
//			바이트 스트림 생성
			FileInputStream fis = 
			new FileInputStream("C:\\javaA_class\\util\\eclipse-workspace\\23-04-25_java"
									+ "\\src\\jang8\\FileInputStream_Ex.java");
			
			int data;
			while((data = fis.read()) != -1)
			{
				//print()는 문자로 출력할 경우는 캐스팅 해야함 , 그냥 출력은 10진 정수로 출력함
				//System.out.print((char)data); // 화면에 문자로 변환해서 출력
				System.out.write(data); // 화면에 문자 그래도 출력
			}
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}