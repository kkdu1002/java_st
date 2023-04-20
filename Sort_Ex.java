package jang12;

import java.util.Arrays;

public class Sort_Ex 
{
	public static void main(String[] args) 
	{
		int[] scores = {99 , 97 , 98};
		Arrays.sort(scores);
		for(int i = 0; i <scores.length; i++)
		{
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println();
		
		String[] names = {"�垮瘚�" , "夢翕熱" , "梯團熱"};
		Arrays.sort(names);
		for(int i = 0; i <names.length; i++)
		{
			System.out.println("names[" + i + "] = " + names[i]);
		}
		System.out.println();
		
		Member888 m1 = new Member888("�垮瘚�");
		Member888 m2 = new Member888("夢翕熱");
		Member888 m3 = new Member888("梯團熱");
		Member888[] members = {m1,m2,m3};
		Arrays.sort(members);
		for(int i = 0; i <members.length; i++)
		{
			System.out.println("members[" + i + "].name = " + members[i].name);
		}
	}
}
