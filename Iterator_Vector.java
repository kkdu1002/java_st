package jang12;

import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Stream;

public class Iterator_Vector 
{
	
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext())
		{
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0;
		it = v.iterator();
		
		while(it.hasNext())
		{
			int n = it.next();
			sum += n;	
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
		
		Stream<Integer> s = v.stream();
		s.forEach(i -> System.out.println(i));
//		�츮�� �л� 5�� Vector�� ������ ���
		/*
		Vector<String> v = new Vector<String>();
		v.add("������");
		v.add("������");
		v.add("������");
		v.add("������");
		v.add("������");
		
		Iterator<String> it = v.iterator();
		while(it.hasNext())
		{
			String x = it.next();
			System.out.println(x);
		}
		*/
	}
}

