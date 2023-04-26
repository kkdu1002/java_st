package jang12;

import java.io.*;

public class ObjectInputStream_Ex 
{
	public static void main(String[] args) 
	{
		ObjectInputStream ois = null;
		try
		{
		/*
		 ���Ͽ� ����� ��ü�� �о���̱� ����
		 ObjectInputStream��ü ����
		 ������ȭ : ���� �ڷ������� ��ȯ
		 ������ȭ�Ҷ� �ʿ��� Ŭ���� ������ ã����Ұ��
		 ClassNotFoundException�� �߻���Ų��. 
		 */
			ois = new ObjectInputStream(new FileInputStream("src/jang12/test2.txt"));
			Data data = (Data)ois.readObject(); // ���� ��ü�� ��ȯ
			
			System.out.println("---------------------------");
			System.out.println("��ȣ : " + data.getNo());
			System.out.println("�̸� : " + data.getName());
			System.out.println("�̸��� : " + data.getMail());
			System.out.println("---------------------------");
			System.out.println(data);
			System.out.println("---------------------------");
			System.out.println(data.toString());
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		finally
		{
			try
			{
				if(ois != null)
					ois.close();
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		}
	}
}