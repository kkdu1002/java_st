package jang12;

import java.util.*;

public class Linked_List 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(); // �����˻�,�������Ի���
		List<String> list2 = new LinkedList<String>(); // �߰����Ի���
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++)
		{
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð� : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++)
		{
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� : " + (endTime - startTime) + "ns");
	}
}