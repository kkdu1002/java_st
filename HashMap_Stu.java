package jang12;

import java.util.*;
/*
	Map : HashMap : ����ȭX , �ӵ� �� , ��Ƽ ������ ȯ���� �ƴ϶�� ����
		  HashTable : ����ȭO , �ӵ� �� , ��Ƽ ������ ȯ�濡�� ����
	���� : ���� X / ���ĵ� ����� ���� ������ TreeMap ���
*/
public class HashMap_Stu 
{
	public static void main(String[] args) 
	{
		HashMap<String , Integer> score = new HashMap<String , Integer>();
		
		score.put("��ȫ��", 97);
		score.put("Ȳ����", 34);
		score.put("�̿���", 98);
		score.put("������", 70);
		score.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��� ���� : " + score.size());
		
		Set<String> keys = score.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext())
		{
			String name = it.next();
			int score_ = score.get(name);
			System.out.println(name + ":" + score_);
		}
	}
}