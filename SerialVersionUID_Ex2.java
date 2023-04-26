package jang8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialVersionUID_Ex2 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("src/jang8/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassC classC = (ClassC) ois.readObject();
		System.out.println("field1 : " + classC.field1);
	}
}