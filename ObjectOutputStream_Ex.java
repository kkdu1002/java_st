package jang12;

import java.io.*;
/*
	�޸𸮿� 
 */
public class ObjectOutputStream_Ex
{
	public static void main(String[] args) 
	{
		ObjectOutputStream oos = null;
		try
		{
		oos = new ObjectOutputStream(new FileOutputStream("src/jang12/test2.txt"));
		Data data = new Data();
		data.setNo(30);
		data.setName("ȫ�浿");
		data.setMail("honggildong@naver.com");
//		ObjectOutputStream�� ��ü�� ����ȭ �ؼ� ��Ʈ���� ���� ����� �� ���� wirteObject()�� �����Ѵ�.
		oos.writeObject(data); // ����ȭ �� ������(test2.txt)�� ����
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		finally
		{
			try
			{
				if(oos != null)
				{
					oos.close();
				}
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		}
	}
}