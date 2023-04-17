package jang12;

import java.util.*;

public class CollectionsEx 
{
	static void printList(LinkedList<String> l)
	{
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext())
		{
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
			{
				separator = "->";
			}
			else
			{
				separator = "\n";
			}
			System.out.print(e + separator);
		}
	}
	public static void main(String[] args) 
	{
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		System.out.println("정렬전-----------------");
		printList(myList);
		
		System.out.println("정렬후-----------------");
		Collections.sort(myList);
		printList(myList);
		
		System.out.println("\n이분검색-----------------");
		int index = Collections.binarySearch(myList, "트랜스포머") + 1;
		System.out.println("트랜스포머는 " + index + "번째 요소입니다.");
	
		System.out.println("\n역순출력-----------------");
		Collections.reverse(myList);
		printList(myList);
	}
}