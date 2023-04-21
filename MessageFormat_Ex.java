package jang12;

import java.text.MessageFormat;

public class MessageFormat_Ex 
{
	public static void main(String[] args) 
	{
		String id = "java";
		String name = "�ſ��";
		String tel = "010-123-5678";
		
		String text = "ȸ�� ID : {0} \nȸ�� �̸� : {1} \nȸ�� ��ȭ : {2}";
		String result1 = MessageFormat.format(text , id , name , tel);
//		insert , delete , update , select => SQL, '����' , ����(''���� ���)		
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values({0},{1},{2})";
//		insert into member values('java','�ſ��','010-123-5678')
		Object[] arguments = {"'java'" , "'�ſ��'" , "'010-123-5678'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}