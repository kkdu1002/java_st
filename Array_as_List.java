package jang12;

import java.util.Arrays;
import java.util.List;

public class Array_as_List 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("È«±æµ¿","½Å¿ë±Ç","±èÀÚ¹Ù");
		for(String name : list)
		{
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1 , 2 , 3);
		for(int num : list2)
		{
			System.out.println(num);
		}
	}
}