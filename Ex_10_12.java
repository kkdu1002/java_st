package jang10;

import java.util.Scanner;

public class Ex_10_12 
{
	public static void main(String[] args) 
	{
		int empty , coke , sprite;
		Scanner drink = new Scanner(System.in);
		
		System.out.print("콜라 값 입력");
		coke = drink.nextInt();
		
		System.out.print("사이다 값 입력");
		sprite = drink.nextInt();
		
		System.out.println("--------no change -------");
		System.out.printf("coke = %d\n" , coke);
		System.out.printf("sprite = %d\n" , sprite);
		
		empty = coke;
		coke = coke ^ sprite;
		sprite = coke ^ sprite;
		coke = coke ^ sprite;
		
		System.out.println("-------- change -------");
		System.out.printf("empty = %d\n" , empty);
		System.out.printf("change_coke = %d\n" , coke);
		System.out.printf("change_sprite = %d\n" , sprite);
	}
}