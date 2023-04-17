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
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"�͹̳�����");
		myList.add(2,"�ƹ�Ÿ");
		
		System.out.println("������-----------------");
		printList(myList);
		
		System.out.println("������-----------------");
		Collections.sort(myList);
		printList(myList);
		
		System.out.println("\n�̺а˻�-----------------");
		int index = Collections.binarySearch(myList, "Ʈ��������") + 1;
		System.out.println("Ʈ�������Ӵ� " + index + "��° ����Դϴ�.");
	
		System.out.println("\n�������-----------------");
		Collections.reverse(myList);
		printList(myList);
	}
}