package jang8;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Serializable_Child extends No_Serializable_Parent implements Serializable
{
	public String field2; // �ڽĲ� , public String field1; �θ�
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		out.writeUTF(field1); // �θ�ü�� �ʵ尪 ���
		out.defaultWriteObject(); // �ڽ� ��ü�� �ʵ尪�� ����ȭ
	}
//	���� : ���� �����ڰ� private�� �ƴϸ� �ڵ� ȣ����� ����. �ݵ�� private�� �ؾ���
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		field1 = in.readUTF(); // �θ�ü�� �ʵ尪 �о��
//		ClassNotFoundException�߻�
		in.defaultReadObject(); // �ڽİ�ü�� �ʵ尪�� ������ȭ
	}
}
