package jang8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUID_Ex1 
{
	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fos = new FileOutputStream("src/jang8/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassC classC = new ClassC();
		classC.field1 = 1;
		oos.writeObject(classC);
		oos.flush();
		oos.close();
		fos.close();
	}
}