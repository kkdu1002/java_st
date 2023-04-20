package jang12;

import java.io.UnsupportedEncodingException;

public class StringGetBytes_Ex 
{
	public static void main(String[] args) 
	{
		String str = "안녕하세요";
/*		문자열을 바이트 배열로 변경하는 경우 네트워크상에 문자열을 전송하거나,
		문자열을 암호화 할 떄 문자열을 바이트 배열로 사용한다
		문자열을 인코딩 -> 디코딩
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