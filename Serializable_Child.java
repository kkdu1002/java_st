package jang8;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Serializable_Child extends No_Serializable_Parent implements Serializable
{
	public String field2; // 자식꺼 , public String field1; 부모꺼
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		out.writeUTF(field1); // 부모객체의 필드값 출력
		out.defaultWriteObject(); // 자식 객체의 필드값을 직렬화
	}
//	주의 : 접근 제한자가 private가 아니면 자동 호출되지 않음. 반드시 private로 해야함
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		field1 = in.readUTF(); // 부모객체의 필드값 읽어옴
//		ClassNotFoundException발생
		in.defaultReadObject(); // 자식객체의 필드값을 역직렬화
	}
}
