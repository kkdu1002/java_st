package jang12;
/*
	DataInputStream/DataOutputStream :
	����Ʈ ��Ʈ�����κ��� �ڹ� �⺻ �ڷ��� Data�� �д´�
	�⺻ �ڷ����� ����Ʈ��Ʈ������ ����Ѵ�
	Ư�� ������ Ÿ�԰� ������ ������ ä �����͸� ����ϰ� �о�� �� �ִ� ��Ʈ��
	Ư�� ������ Ÿ�԰� ���˿� �°� �а� �� �� �ִ� readBoolean(), writeBoolean(boolean v), readInt(),
	writeInt(int v), readUTF(), writeUTF(String s)���� �޼ҵ� ����
	
	������
	DataInputStream(InputStream stream)
	DataOutputStream(OutputStream stream)
 */
import java.io.*;

public class DataOutputStream_Ex 
{	// �⺻�ڷᰪ�� ����Ʈ�� ���� (file.txt)
	public static void main(String[] args) 
	{
//		DataInputStream�� �⺻�ڷ��� Ÿ�� �״�� ��Ʈ���� ���ؼ� ��� �� �� �ִ�.
//		1����Ʈ���� �ƴϱ� ������ �ٸ� ��Ʈ���� �̿��ؼ� Ư��device�� ����� �� �ִ�.(���� = ������Ʈ��)
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		try
		{
//			DataOutputStream�� ����� FileOutputStream��ü����
			fos = new FileOutputStream("src/jang12/file.txt");
//			�⺻ �ڷ����� Ÿ���� ������ä ����� �� �ִ�
//			DataOutputStream��ü ����
			dos = new DataOutputStream(fos);
			int i = 10;
			double d = 3.14;
			String s = "Java���α׷�";
//			DataOutputStream�� �⺻ �ڷ������� write�޼ҵ尡 ����
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