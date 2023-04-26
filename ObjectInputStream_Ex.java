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
		 파일에 저장된 객체를 읽어들이기 위해
		 ObjectInputStream객체 생성
		 역직렬화 : 원래 자료형으로 변환
		 역질렬화할때 필요한 클래스 파일을 찾기못할경우
		 ClassNotFoundException을 발생시킨다. 
		 */
			ois = new ObjectInputStream(new FileInputStream("src/jang12/test2.txt"));
			Data data = (Data)ois.readObject(); // 원래 객체로 변환
			
			System.out.println("---------------------------");
			System.out.println("번호 : " + data.getNo());
			System.out.println("이름 : " + data.getName());
			System.out.println("이메일 : " + data.getMail());
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