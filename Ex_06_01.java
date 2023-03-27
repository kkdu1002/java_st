package jang6;

public class Ex_06_01 {
	public static void main(String[] args) {
		System.out.printf("안녕하세요? 빙글빙글 for 문을 공부중입니다. ^^\n");
		System.out.printf("안녕하세요? 빙글빙글 for 문을 공부중입니다. ^^\n");
		System.out.printf("안녕하세요? 빙글빙글 for 문을 공부중입니다. ^^\n");
		System.out.printf("안녕하세요? 빙글빙글 for 문을 공부중입니다. ^^\n");
		System.out.printf("안녕하세요? 빙글빙글 for 문을 공부중입니다. ^^\n");

		
		System.out.println("for문");
		for (int i = 0; i < 5; i++)
			System.out.printf("안녕하세요? 빙글빙글 for 문을 공부중입니다. ^^\n");

		System.out.println("while문");
		int i = 0;
		  
		while (i < 5) 
		{ 
			System.out.printf("안녕하세요? 빙글빙글 for 문을 공부중입니다. ^^\n");
			i++; 
		}
		 
		System.out.println("do while문");
		int j = 0;

		do 
		{
			j++;
			System.out.printf("안녕하세요? 빙글빙글 for 문을 공부중입니다. ^^\n");
		} 
		while (j < 5);
	}
}