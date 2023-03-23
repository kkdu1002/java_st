package jang3;

import java.util.Scanner;

public class Ex_04_11 
{
	public static void main(String[] args) 
	{
		int money , coin = 500 ;
		System.out.printf("## 교환할 돈은 ? ==> ");
		Scanner mon = new Scanner(System.in);
		
		while(mon.hasNext()) 
		{
			money = mon.nextInt();
			if( money == 0 )
				break;
			System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
			money = money % coin;
			coin = coin / 5;
			if (coin == 100) 
			{
				System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
				money = money % coin;
				coin = coin / 2;
			}
			if (coin == 50 ) 
			{
				System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
				money = money % coin;
				coin = coin / 5;
			}
			if(coin == 10)
			{
				System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
				System.out.printf("바꾸지 못한 잔돈 == > %d 원 \n", money % coin);
			}
			coin = 500;
			System.out.printf("## 교환할 돈은 ? ==> ");
			/*
			switch(coin) 
			{
				case 500 :
					System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
					money = money % coin;
					coin = coin / 5;
				case 100 : 
					System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
					money = money % coin;
					coin = coin / 2;
				case 50 :
					System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
					money = money % coin;
					coin = coin / 5;
				case 10 :
					System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
					money = money % coin;
					System.out.printf("바꾸지 못한 잔돈 == > %d 원 \n", money % coin);		
			}
			break;
			*/
			
			/*
			money = mon.nextInt();
			System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
			money = money % coin;
			coin = coin / 5;
			if (coin == 100) 
			{
				System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
				money = money % coin;
				coin = coin / 2;
			}
			if (coin == 50 ) 
			{
				System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
				money = money % coin;
				coin = coin / 5;
			}
			if(coin == 10)
			{
				System.out.printf("%d원 짜리 == > %d 개\n",coin , money / coin);
				System.out.printf("바꾸지 못한 잔돈 == > %d 원 \n", money % coin);
				break;
			}
			*/
		}
		mon.close();
	}
}