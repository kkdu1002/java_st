package jang12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Stack_homework 
{
	private static final String[] Colors = {"»¡°­","ÁÖÈ²","³ë¶û","ÃÊ·Ï","ÆÄ¶û","³²»ö","º¸¶ó"};
	public static void main(String[] args)
	{
		// stack
		System.out.println("-------------------- stack ------------------------");
		Stack<String> stack = new Stack<String>();

		for(int i = 0; i < Colors.length; i++)
		{
			stack.push(Colors[i]);
		}

		while(!stack.isEmpty())
		{
			String str = stack.pop();
			System.out.print(str + "\t");
		}
		// queue
		System.out.println("\n-------------------- queue ------------------------");
		Queue<String> queue = new LinkedList<String>();

		for(int i = 0; i < Colors.length; i++)
		{
			queue.offer(Colors[i]);
		}
		while(!queue.isEmpty())
		{
			String str = queue.poll();
			System.out.print(str + "\t");
		}
	}
}