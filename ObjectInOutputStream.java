package jang8;

import java.io.*;

public class ObjectInOutputStream 
{
	public static void main(String[] args) throws Exception 
	{
//		 ��� : ����ȭ(��ü�� ������(�ʵ尪)�� �Ϸ��� �������� ����Ʈ�� ����
		FileOutputStream fos = new FileOutputStream("C:/tmp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1 , 2 , 3});
		oos.writeObject(new String("ȫ�浿"));
		
		oos.flush();
		oos.close();
		fos.close();
		
		System.out.println("======== �Է� : ������ȭ(������ ����) : �������� ����Ʈ�� ��ü�� =========");
		FileInputStream fis = new FileInputStream("C:/tmp/Object.dat");	
		ObjectInputStream ois = new ObjectInputStream(fis); //����Ʈ -> object�� �о��
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int []) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		fis.close();
		ois.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + obj3[1] + obj3[2]);
		System.out.println(obj4);
	}
}