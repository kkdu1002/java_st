package jang12;

import java.util.Iterator;
/*
	Enumeration �� Iterator �������̽�
	
	�÷��� �����ӿ�ũ( Collection Framework)���� Enumeration �� Iterator��� �������̽��� �̚�.
	�������� �ǹ̷δ� �ݺ� , ��ȯ ���� �ǹ̸� ������ ������ � ��ü���� ������ ������
	�� ��ü���� � ������ ���� �ϳ��� �����Ͽ� ����ϱ� ���� �������̽���� ������ �� �ִ�.
	
	- java.util.Enumeration<E> �������̽�
	  �� �������̽��� ���� �� ���� �޼ҵ常�� �����ϸ� hasMoreElements() �޼ҵ带 ���� �������̽� �ȿ� ���� ��Ұ� �ִ����� ���� ���Ǹ� �Ѵ�.
	  ���� true�� ��ȯ�Ǿ��ٸ� ���� �ε��� ��Ұ� �����Ѵٴ� �ǹ��̸� nextElement() �޼ҵ�� ���� ��Ҹ� ������ ����ϸ� �ȴ�.
	  
	  ex) v ��� ���� �ڷᱸ���� ����� ��� ��� ���
	  for(Enumeration e = v.elements(); e.hasMoreElements;)
	  {
	  	System.out.println(e.nextElement());
	  }
	  
	  java.util.Iterator<E> �������̽�
	  Enumeration�� �������� ���� remove() �޼ҵ尡 �߰��� �� ���̴�.
	  hasNext()�� next�޼ҵ�� �̸��� �ణ �ٸ���
	  Enumeration �������̽��� hasMoreElements()�� nextElement()�� ��Ȯ�� ��ġ�ϴ� ����� �Ѵ�.
	  Enumeration ��� Iterator�� JAVA2���� �߰��Ͽ� ����ϴ� ������ Enumeration �������̽��� ���� ������ ��Ҹ� ������ �����
	  ���� ������ �̸� �����ϱ� ���ؼ� ���� ���� Iterator�̶� �� �� �ִ�.
	  
	  hasNext() : ���� ��ġ�� ���(������)�� ������ true�� ��ȯ�Ѵ�.
	  next() : ���� ��ġ�� ���(������)�� ��ȯ�Ѵ�.
	  remove() : �ݺ���(Iterator)�� ���� ������ ��ȯ�� ��Ҹ� �����Ѵ�.
	  
	  collection �������̽�
	  list(�ߺ����� , ���İ���) - ArrayList , vector , stack , queue , linkedlist
	  set(�ߺ��Ұ��� , ���ĺҰ���) - HashSet
	  Map�������̽�(Ű,��) �ѽ� : (Ű �ߺ� �Ұ��� , �� �ߺ����� ,���� x) - HashMap , HashTable
 */
import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2, 100);
		
		System.out.println("���� ���� ��� ��ü �� : " + v.size());
		System.out.println("������ ���� �뷮 : " + v.capacity());
		
		for(int i = 0; i < v.size(); i++)
		{
			int n = v.get(i);
			System.out.println(n);
		}
		int sum = 0;
		for(int i = 0; i < v.size(); i++)
		{
			int n = v.elementAt(i);
			sum += n;

		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
		
		System.out.println("-----------------------");
		/*
		   ���ͷ�����(Iterator) �� ���� ��ü ���
		   hasNext() : ���� ������ ��Ұ� �ִ��� ���θ� ��ȯ
	  	   next() : ���� ������ ��Ҽ��� ���������� ��ȯ
		   Vector , ArrayList , linkedList , Set�� ���� �÷��ǿ��� ��Ҹ�
		   ���������� �˻��� �� ���ϰ� ����ϴ� Iterator<E>�������̽��̴�.
		 */
		Iterator<Integer> it = v.iterator();
		int str;
		while(it.hasNext())
		{
			str = it.next();
			System.out.println(str + " ");
		}
	}
}