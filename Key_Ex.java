package jang12;

import java.util.HashMap;
class A
{
	public String toString()
	{
		return "��ü�� ó�� �Ǿ����ϴ�.";
	}
}
public class Key_Ex 
{
	public static void main(String[] args) 
	{
		HashMap<Key , String> hashMap = new HashMap<Key , String>();
		
		hashMap.put(new Key(1), "ȫ�浿");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		A a = new A();
		System.out.println(a);
		System.out.println(a.toString());
	}
}