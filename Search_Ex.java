package jang12;

import java.util.Arrays;

public class Search_Ex 
{
	public static void main(String[] args) 
	{
		int[] scores = {99 , 97 , 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores,99);
		System.out.println("ã�� �ε��� : " + index);
		
		String[] names = {"ȫ�浿" , "�ڵ���" , "��μ�"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names,"ȫ�浿");
		System.out.println("ã�� �ε��� : " + index);
		
		Member888 m1 = new Member888("ȫ�浿");
		Member888 m2 = new Member888("�ڵ���");
		Member888 m3 = new Member888("��μ�");
		Member888[] members = {m1,m2,m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members,m1);
		System.out.println("ã�� �ε��� : " + index);
		
	}
}
