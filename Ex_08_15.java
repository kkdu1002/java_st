package jang8;

import java.util.Random;

public class Ex_08_15 
{
	public static void main(String[] args) 
	{
			while(true) 
			{
		//		int num = ((int)(Math.random() * 6) + 1);
				int num;
				Random r = new Random();
				num = r.nextInt(6) + 1;
				System.out.println(num);
				if (num == 1) 
				{
					System.out.println("1번이 나왔습니다.");
					break;
				} 
				else if (num == 2) 
				{
					System.out.println("2번이 나왔습니다.");
				} 
				else if (num == 3) 
				{
					System.out.println("3번이 나왔습니다.");
				} 
				else if (num == 4) 
				{
					System.out.println("4번이 나왔습니다.");
				} 
				else if (num == 5) 
				{
					System.out.println("5번이 나왔습니다.");
				} 
				else if (num == 6) 
				{
					System.out.println("6번이 나왔습니다.");
				}
			}
	}
}

