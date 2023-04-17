package jang12;

import java.util.Iterator;
/*
	Enumeration 과 Iterator 인터페이스
	
	컬렉션 프레임워크( Collection Framework)에는 Enumeration 과 Iterator라는 인터페이스가 이싿.
	사전적인 의미로는 반복 , 순환 등의 의미를 가지고 있으며 어떤 객체들의 모임이 있을떄
	이 객체들을 어떤 순서에 의해 하나씩 접근하여 사용하기 위한 인터페이스라고 정리할 수 있다.
	
	- java.util.Enumeration<E> 인터페이스
	  이 인터페이스는 단지 두 개의 메소드만을 제공하며 hasMoreElements() 메소드를 통해 인터페이스 안에 다음 요소가 있는지에 대한 질의를 한다.
	  만약 true가 반환되었다면 다음 인덱스 요소가 존재한다는 의미이며 nextElement() 메소드로 다음 요소를 꺼내어 사용하면 된다.
	  
	  ex) v 라는 벡터 자료구조에 저장된 모든 요소 출력
	  for(Enumeration e = v.elements(); e.hasMoreElements;)
	  {
	  	System.out.println(e.nextElement());
	  }
	  
	  java.util.Iterator<E> 인터페이스
	  Enumeration과 차이점은 단지 remove() 메소드가 추가된 것 뿐이다.
	  hasNext()와 next메소드는 이름만 약간 다를뿐
	  Enumeration 인터페이스의 hasMoreElements()와 nextElement()와 정확히 일치하는 기능을 한다.
	  Enumeration 대신 Iterator를 JAVA2에서 추가하여 사용하는 이유는 Enumeration 인터페이스는 집합 내에서 요소를 제거할 방법이
	  없기 때문에 이를 보완하기 위해서 나온 것이 Iterator이라 할 수 있다.
	  
	  hasNext() : 다음 위치에 요소(데이터)가 있으면 true를 반환한다.
	  next() : 다음 위치의 요소(데이터)를 반환한다.
	  remove() : 반복자(Iterator)에 의해 마지막 반환된 요소를 삭제한다.
	  
	  collection 인터페이스
	  list(중복가능 , 정렬가능) - ArrayList , vector , stack , queue , linkedlist
	  set(중복불가능 , 정렬불가능) - HashSet
	  Map인터페이스(키,값) 한쌍 : (키 중복 불가능 , 값 중복가능 ,정렬 x) - HashMap , HashTable
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
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량 : " + v.capacity());
		
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
		System.out.println("벡터에 있는 정수 합 : " + sum);
		
		System.out.println("-----------------------");
		/*
		   이터레이터(Iterator) 를 통해 전체 출력
		   hasNext() : 다음 데이터 요소가 있는지 여부를 반환
	  	   next() : 다음 데이터 요소수를 직접적으로 반환
		   Vector , ArrayList , linkedList , Set과 같은 컬렉션에서 요소를
		   순차적으로 검색할 때 편리하게 사용하는 Iterator<E>인터페이스이다.
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