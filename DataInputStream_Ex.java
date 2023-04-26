package jang12;
//	�����(�����ڵ�) file.text�� �⺻������ �о����
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
//			DataInputStream�� �⺻�ڷ����� ������ä�� ����� ���� �о���� �� �ִ� read()�� �ִ�.
//			�о���� ���� �ݵ�� ����� ������� �о�;��Ѵ�.
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			System.out.println("i�� = " + i);
			System.out.println("d�� = " + d);
			System.out.println("s�� = " + s);
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