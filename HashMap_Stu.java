package jang12;

import java.util.*;
/*
	Map : HashMap : 동기화X , 속도 ↑ , 멀티 스레드 환경이 아니라면 적용
		  HashTable : 동기화O , 속도 ↓ , 멀티 스레드 환경에서 적용
	공통 : 정렬 X / 정렬된 결과를 보고 싶으면 TreeMap 사용
*/
public class HashMap_Stu 
{
	public static void main(String[] args) 
	{
		HashMap<String , Integer> score = new HashMap<String , Integer>();
		
		score.put("한홍진", 97);
		score.put("황기태", 34);
		score.put("이영희", 98);
		score.put("정원석", 70);
		score.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 : " + score.size());
		
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