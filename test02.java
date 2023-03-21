package jang2;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		int kor = 20, math = 20, en = 20, total , average;
		total = kor + math + en;
		average = total / 3;
		
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + en);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
		System.out.println("----------- println ---------------" );
		System.out.printf("국어 : %d \n수학 : %d \n영어 : %d \n총점 : %d \n평균 : %d\n",kor,math,en,total,average);

		System.out.println("--------- Scanner -----------");
		
		Scanner test = new Scanner(System.in);
		
		int kor1 , math1 , en1 , total1 , average1;
		
		System.out.print("국어 : ");
		kor1 = test.nextInt();
		System.out.print("영어 : ");
		en1 = test.nextInt();
		System.out.print("수학 : ");
		math1 = test.nextInt();
		
		total1 = kor1 + math1 + en1;
		average1 = total1 / 3;
		
		System.out.println("----------" );
		System.out.println("총점 : " + total1);
		System.out.println("평균 : " + average1);

		System.out.println("----------- println ---------------" );
		System.out.printf("국어 : %d \n영어 : %d \n수학 : %d\n총점 : %d \n평균 : %d",kor1,math1,en1,total1,average1);
		
		test.close();
	}
}
