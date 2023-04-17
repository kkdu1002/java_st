package jang12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class Vector_homework2
{
	public static void main(String[] args) 
	{
		ArrayList<Double> array = new ArrayList<Double>();
		for(int i = 0; i < 20; i++)
		{
			array.add((Double) ((Math.random() * 100) + 1));
		}
		
		Iterator<Double> it = array.iterator();
		
		while(it.hasNext())
		{
			Double x = (Double)it.next();
			System.out.printf("Iterator : %.1f\n", x);
		}
		
		Stream<Double> h = array.stream();
		h.forEach(i -> System.out.printf("Stream : %.1f\n" , i));
	}
}