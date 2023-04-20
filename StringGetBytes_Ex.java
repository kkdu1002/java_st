package jang12;

import java.io.UnsupportedEncodingException;

public class StringGetBytes_Ex 
{
	public static void main(String[] args) 
	{
		String str = "�ȳ��ϼ���";
/*		���ڿ��� ����Ʈ �迭�� �����ϴ� ��� ��Ʈ��ũ�� ���ڿ��� �����ϰų�,
		���ڿ��� ��ȣȭ �� �� ���ڿ��� ����Ʈ �迭�� ����Ѵ�
		���ڿ��� ���ڵ� -> ���ڵ�
 */
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);
		
		try
		{
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			String str2 = new String(bytes2 , "EUC-KR");
			System.out.println("bytes2 -> String : " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes3.length);
			String str3 = new String(bytes3 , "UTF-8");
			System.out.println("bytes3 -> String : " + str3);
		}
		catch(UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
	}
}