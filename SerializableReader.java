package jang8;

import java.io.*;

public class SerializableReader 
{
	public static void main(String[] args)
	{
//		try
//		{
////			1.FileNotFoundException
//			fis = new FileInputStream("src/jang8/Object.dat");
////			2. IOException �߻�
//			ois = new ObjectInputStream(fis);
////			ClassNotFoundException�߻�
//			ClassA v = (ClassA) ois.readObject();
//			System.out.println("field1 : " + v.field1);
//			System.out.println("field2.field1 : " + v.field2.field1);
//			System.out.println("field3 : " + v.field3);
//			System.out.println("field4 : " + v.field4);
//		}
//		catch(FileNotFoundException e)
//		{
//			System.out.print("������ ã�� �� �����ϴ�.");
//		}
//		catch(IOException e)
//		{
//			System.out.print("������� ã�� �� �����ϴ�.");
//		}
//		catch(ClassNotFoundException e)
//		{
//			System.out.print("Ŭ������ ã�� �� �����ϴ�.");
//		}
//		catch(Exception e)
//		{
//			e.getStackTrace();
//		}
//		finally
//		{
//			try
//			{
//				if(fis != null)
//					fis.close();
//				if(ois != null)
//					ois.close();
//			}
//			catch(Exception e)
//			{
//				e.getStackTrace();
//			}
//		}
		try(FileInputStream fis = new FileInputStream("src/jang8/Object.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);)
		{
			ClassA v = (ClassA) ois.readObject();
			System.out.println("field1 : " + v.field1);
			System.out.println("field2.field1 : " + v.field2.field1);
			System.out.println("field3 : " + v.field3);
			System.out.println("field4 : " + v.field4);
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}