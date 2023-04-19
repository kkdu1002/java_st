package jang12;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Ex 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer , String> score = new TreeMap<Integer , String>();
		score.put(new Integer(87),"ȫ�浿");
		score.put(new Integer(98),"�̵���");
		score.put(new Integer(75),"�ڱ��");
		score.put(new Integer(95),"�ſ��");
		score.put(new Integer(80),"���ڹ�");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = score.firstEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.lastEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = score.lowerEntry(new Integer(95));
		System.out.println("95�� �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.higherEntry(new Integer(95));
		System.out.println("95�� ���� ���� : " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = score.floorEntry(new Integer(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.ceilingEntry(new Integer(85));
		System.out.println("85�� �̰ų� �ٷ� ���� ���� " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		while(!score.isEmpty())
		{
			entry = score.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(���� ��ü �� : " + score.size() + ")");
		}
	}
}