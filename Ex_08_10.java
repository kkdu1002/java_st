package jang8;

public class Ex_08_10 
{
	public static void main(String[] args) 
	{
		// ���� + ���� = ���� + == toString() : ���Ῥ����
		// ���� + ���� = ����
		// ���� + ���� = ����
		// ���� + ���� = ����
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " Ư¡";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str3.toString());
		System.out.println(str4);
	
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj);
	}
}