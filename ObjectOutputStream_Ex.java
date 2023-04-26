package jang12;

import java.io.*;
/*
	메모리에 
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
		data.setName("홍길동");
		data.setMail("honggildong@naver.com");
//		ObjectOutputStream을 객체를 직렬화 해서 스트림을 통해 기록할 숭 씨는 wirteObject()를 제공한다.
		oos.writeObject(data); // 직렬화 된 데이터(test2.txt)에 저장
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