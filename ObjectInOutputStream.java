package jang8;

import java.io.*;

public class ObjectInOutputStream 
{
	public static void main(String[] args) throws Exception 
	{
//		 출력 : 직렬화(객체의 데이터(필드값)을 일려로 연속적인 바이트로 변경
		FileOutputStream fos = new FileOutputStream("C:/tmp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1 , 2 , 3});
		oos.writeObject(new String("홍길동"));
		
		oos.flush();
		oos.close();
		fos.close();
		
		System.out.println("======== 입력 : 역직렬화(원래로 복원) : 연속적인 바이트를 객체로 =========");
		FileInputStream fis = new FileInputStream("C:/tmp/Object.dat");	
		ObjectInputStream ois = new ObjectInputStream(fis); //바이트 -> object로 읽어옴
		
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