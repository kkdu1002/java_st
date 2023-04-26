package jang8;
import java.io.*;
public class NonSerializable_Parent_Ex 
{
	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fos = new FileOutputStream("src/jang8/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Serializable_Child child = new Serializable_Child();
		child.field1 = "È«±æµ¿";
		child.field2 = "È«»ï¿ø";
		oos.writeObject(child);
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("src/jang8/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Serializable_Child v = (Serializable_Child) ois.readObject();
		System.out.println("field1 : " + v.field1);
		System.out.println("field2 : " + v.field2);
		fis.close();
		ois.close();
	}
}