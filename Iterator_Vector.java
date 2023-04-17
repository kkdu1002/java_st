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
		System.out.println("벡터에 있는 정수 합 : " + sum);
		
		Stream<Integer> s = v.stream();
		s.forEach(i -> System.out.println(i));
//		우리반 학생 5명만 Vector로 저장후 출력
		/*
		Vector<String> v = new Vector<String>();
		v.add("ㅇㅇㅇ");
		v.add("ㅂㅂㅂ");
		v.add("ㄹㄹㄹ");
		v.add("ㄷㄷㄷ");
		v.add("ㅎㅎㅎ");
		
		Iterator<String> it = v.iterator();
		while(it.hasNext())
		{
			String x = it.next();
			System.out.println(x);
		}
		*/
	}
}

