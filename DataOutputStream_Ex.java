package jang12;
/*
	DataInputStream/DataOutputStream :
	바이트 스트림으로부터 자바 기본 자료형 Data를 읽는다
	기본 자료형을 바이트스트림으로 출력한다
	특정 데이터 타입과 포맷을 유지한 채 데이터를 기록하고 읽어올 수 있는 스트림
	특정 데이터 타입과 포맷에 맞게 읽고 쓸 수 있는 readBoolean(), writeBoolean(boolean v), readInt(),
	writeInt(int v), readUTF(), writeUTF(String s)등의 메소드 제공
	
	생성자
	DataInputStream(InputStream stream)
	DataOutputStream(OutputStream stream)
 */
import java.io.*;

public class DataOutputStream_Ex 
{	// 기본자료값을 바이트로 저장 (file.txt)
	public static void main(String[] args) 
	{
//		DataInputStream은 기본자료형 타입 그대로 스트림을 통해서 기록 할 수 있다.
//		1차스트림이 아니기 때문에 다른 스트림을 이요해서 특정device와 연결될 수 있다.(필터 = 보조스트림)
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		try
		{
//			DataOutputStream과 연결된 FileOutputStream객체생성
			fos = new FileOutputStream("src/jang12/file.txt");
//			기본 자료형의 타입을 유지한채 기록할 수 있는
//			DataOutputStream객체 생성
			dos = new DataOutputStream(fos);
			int i = 10;
			double d = 3.14;
			String s = "Java프로그램";
//			DataOutputStream은 기본 자료형별로 write메소드가 존재
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fos != null)
					fos.close();
			}
			catch(IOException e)
			{
				try
				{
					if(dos != null)
						dos.close();e.printStackTrace();
				}
				catch(IOException e1)
				{
					e1.printStackTrace();
				}
			}
		}
	}
}