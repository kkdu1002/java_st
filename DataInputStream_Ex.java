package jang12;
//	저장된(이진코드) file.text를 기본형으로 읽어오기
import java.io.*;

public class DataInputStream_Ex 
{
	public static void main(String[] args) 
	{
		DataInputStream dis = null;
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("src/jang12/file.txt");
			dis = new DataInputStream(fis);
//			DataInputStream은 기본자료형을 유지한채로 저장된 값을 읽어들일 수 있는 read()가 있다.
//			읽어들일 떄는 반드시 기록한 순서대로 읽어와야한다.
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			System.out.println("i값 = " + i);
			System.out.println("d값 = " + d);
			System.out.println("s값 = " + s);
		}
		catch(FileNotFoundException e)
		{
			e.getStackTrace();
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
		finally
		{
			try
			{
				if(fis != null)
					fis.close();
			}
			catch(IOException e)
			{
				try
				{
					if(dis != null)
						dis.close();
				}
				catch(IOException e1)
				{
					e1.getStackTrace();
				}
			}
		}
	}
}