package jang12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;
/*
	java.util.Dictionary<K,V> <- HashTable<K,V> <- Properties<K,V>
	HashTable : Ű�� ���� �پ��� Ÿ������ ����
	Properties : Ű�� ���� String Ÿ������ ������
	�ݵ�� *.properties�� �����ؾ��� (Ű��)
*/
public class Properties_Ex 
{ // MIME ( Multipurpose Internet Mail Extension ) ���ڿ����� ���� ������ ǥ������
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		Properties propertise = new Properties();
		String path = Properties_Ex.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		propertise.load(new FileReader(path));
		
		String driver = propertise.getProperty("driver");
		String url = propertise.getProperty("url");
		String username = propertise.getProperty("username");
		String password = propertise.getProperty("password");
		String contry = propertise.getProperty("contry");
		String language = propertise.getProperty("language");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("contry : " + contry);
		System.out.println("language : " + language);
	}

}
