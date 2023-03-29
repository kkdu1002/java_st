package jang7;

import java.util.Scanner;

public class Ex_07_01 
{
	public static void main(String[] args) 
	{
		Scanner od = new Scanner(System.in);
		int order;
		
		System.out.println("손님 주문 하시겠습니까 ?");
		
		System.out.print("<1> 카페라떼 <2> 카푸치노 <3> 아메리카노 <4> 주문 그만하기 == >");
		order = od.nextInt();
		
		while(true) 
		{
			switch(order) 
			{
				case 1:
					System.out.printf("카페라떼를 주문하였습니다.\n");
					break;
				case 2:
					System.out.printf("카푸치노를 주문하였습니다.\n");
					break;
				case 3:
					System.out.printf("아메리카노를 주문하였습니다.\n");
					break;
				case 4:
					System.out.printf("주문하신 커피 나왔습니다.\n");
					break;
				default:
					System.out.printf("없는 메뉴입니다.\n");
					break;
			}
			if(order == 4) 
			{
				System.out.printf("주문을 그만합니다.");
				break;
			}
			System.out.println();
			System.out.println("손님 주문 하시겠습니까 ?");
			System.out.print("<1> 카페라떼 <2> 카푸치노 <3> 아메리카노 <4> 주문 그만하기 == >");
			
			order = od.nextInt();
		}
		
		/*
		do 
		{
			if (order == 4) 
			{
				System.out.println("주문을 그만합니다.");
				break;
			}
			switch(order) 
				{
					case 1:
						System.out.println("카페라떼를 주문하였습니다.");
						break;
					case 2:
						System.out.println("카푸치노를 주문하였습니다.");
						break;
					case 3:
						System.out.println("아메리카노를 주문하였습니다.");
						break;
					case 4:
					System.out.printf("주문하신 커피 나왔습니다.\n");
					break;
				default:
					System.out.printf("없는 메뉴입니다.\n");
					break;
			}
			if(order == 4) 
			{
				System.out.printf("주문을 그만합니다.");
				break;
			}
			System.out.println();
			System.out.println("손님 주문 하시겠습니까 ?");
			System.out.print("<1> 카페라떼 <2> 카푸치노 <3> 아메리카노 <4> 주문 그만하기 == >");
			
			order = od.nextInt();
		}
		while(true);*/
	}
}