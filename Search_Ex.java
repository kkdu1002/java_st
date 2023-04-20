package jang12;

import java.util.Arrays;

public class Search_Ex 
{
	public static void main(String[] args) 
	{
		int[] scores = {99 , 97 , 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores,99);
		System.out.println("Ã£´Â ÀÎµ¦½º : " + index);
		
		String[] names = {"È«±æµ¿" , "¹Úµ¿¼ö" , "±è¹Î¼ö"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names,"È«±æµ¿");
		System.out.println("Ã£´Â ÀÎµ¦½º : " + index);
		
		Member888 m1 = new Member888("È«±æµ¿");
		Member888 m2 = new Member888("¹Úµ¿¼ö");
		Member888 m3 = new Member888("±è¹Î¼ö");
		Member888[] members = {m1,m2,m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members,m1);
		System.out.println("Ã£´Â ÀÎµ¦½º : " + index);
		
	}
}
