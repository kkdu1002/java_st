package jang12;
import java.util.*;
public class HashMapDic_Ex 
{
	public static void main(String[] args) 
	{
		HashMap<String,String> dic = new HashMap<String , String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Set<String> Keys = dic.keySet();
		Iterator<String> it = Keys.iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++)
		{
			System.out.print("찾고싶은 단어는 ?");
			String eng = scanner.next();
			System.out.println(dic.get(eng));
		}
	}
}