package jang2;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		int kor = 20, math = 20, en = 20, total , average;
		total = kor + math + en;
		average = total / 3;
		
		System.out.println("���� : " + kor);
		System.out.println("���� : " + math);
		System.out.println("���� : " + en);
		System.out.println("���� : " + total);
		System.out.println("��� : " + average);
		
		System.out.println("----------- println ---------------" );
		System.out.printf("���� : %d \n���� : %d \n���� : %d \n���� : %d \n��� : %d\n",kor,math,en,total,average);

		System.out.println("--------- Scanner -----------");
		
		Scanner test = new Scanner(System.in);
		
		int kor1 , math1 , en1 , total1 , average1;
		
		System.out.print("���� : ");
		kor1 = test.nextInt();
		System.out.print("���� : ");
		en1 = test.nextInt();
		System.out.print("���� : ");
		math1 = test.nextInt();
		
		total1 = kor1 + math1 + en1;
		average1 = total1 / 3;
		
		System.out.println("----------" );
		System.out.println("���� : " + total1);
		System.out.println("��� : " + average1);

		System.out.println("----------- println ---------------" );
		System.out.printf("���� : %d \n���� : %d \n���� : %d\n���� : %d \n��� : %d",kor1,math1,en1,total1,average1);
		
		test.close();
	}
}
