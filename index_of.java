package jang12;

public class index_of 
{
	public static void main(String[] args) 
	{
		String str = "Java�� �����ϴ� �� , Java�� ��վ��.^^";
		
		System.out.println("���ڿ� ==> " + str);
		
		System.out.print("���� ó�� ������ Java ��ġ ==> ");
		System.out.println(str.indexOf("Java"));
		System.out.print("���� �������� ������ Java ��ġ ==> ");
		System.out.println(str.lastIndexOf("Java"));
	}
}