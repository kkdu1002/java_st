package jang12;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Ex 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer , String> score = new TreeMap<Integer , String>();
		score.put(new Integer(87),"홍길동");
		score.put(new Integer(98),"이동수");
		score.put(new Integer(75),"박길순");
		score.put(new Integer(95),"신용권");
		score.put(new Integer(80),"김자바");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = score.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = score.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.higherEntry(new Integer(95));
		System.out.println("95점 위의 점수 : " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = score.floorEntry(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.ceilingEntry(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수 " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		while(!score.isEmpty())
		{
			entry = score.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수 : " + score.size() + ")");
		}
	}
}