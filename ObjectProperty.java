package jang12;


public class ObjectProperty 
{
	public static void main(String[] args) 
	{
		Point p = new Point(2,3);
//		Ŭ������ �̸� ��������
		System.out.println(p.getClass().getName());
//		��ü�� �����ϰ� ������ �� �ִ� ���� id���� �����Ѵ�.
//		id ���� ��ü�� ������ �� �־����� ���̴�.
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
		
		Point a = new Point(2,3);
		System.out.println(a.toString());
	}
}