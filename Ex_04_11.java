package jang3;

import java.util.Scanner;

public class Ex_04_11 
{
	public static void main(String[] args) 
	{
		int money , coin = 500 ;
		System.out.printf("## ��ȯ�� ���� ? ==> ");
		Scanner mon = new Scanner(System.in);
		
		while(mon.hasNext()) 
		{
			money = mon.nextInt();
			if( money == 0 )
				break;
			System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
			money = money % coin;
			coin = coin / 5;
			if (coin == 100) 
			{
				System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
				money = money % coin;
				coin = coin / 2;
			}
			if (coin == 50 ) 
			{
				System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
				money = money % coin;
				coin = coin / 5;
			}
			if(coin == 10)
			{
				System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
				System.out.printf("�ٲ��� ���� �ܵ� == > %d �� \n", money % coin);
			}
			coin = 500;
			System.out.printf("## ��ȯ�� ���� ? ==> ");
			/*
			switch(coin) 
			{
				case 500 :
					System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
					money = money % coin;
					coin = coin / 5;
				case 100 : 
					System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
					money = money % coin;
					coin = coin / 2;
				case 50 :
					System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
					money = money % coin;
					coin = coin / 5;
				case 10 :
					System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
					money = money % coin;
					System.out.printf("�ٲ��� ���� �ܵ� == > %d �� \n", money % coin);		
			}
			break;
			*/
			
			/*
			money = mon.nextInt();
			System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
			money = money % coin;
			coin = coin / 5;
			if (coin == 100) 
			{
				System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
				money = money % coin;
				coin = coin / 2;
			}
			if (coin == 50 ) 
			{
				System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
				money = money % coin;
				coin = coin / 5;
			}
			if(coin == 10)
			{
				System.out.printf("%d�� ¥�� == > %d ��\n",coin , money / coin);
				System.out.printf("�ٲ��� ���� �ܵ� == > %d �� \n", money % coin);
				break;
			}
			*/
		}
		mon.close();
	}
}