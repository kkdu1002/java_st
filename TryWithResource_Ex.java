package jang12;

import java.io.FileInputStream;

public class TryWithResource_Ex 
{
	public static void main(String[] args) 
	{
		try(FileInputStream fis = new FileInputStream("file.txt"))
		{
			fis.read();
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}
}