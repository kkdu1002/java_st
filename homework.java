package jang7;

import java.util.Scanner;

public class homework 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int people , kor , math , en , all = 0 , all_1 = 0;
		int start;
		System.out.print("인원수 : ");
		people = input.nextInt();
		
		
		for (start = 1; start <= people;start++) 
		{
			System.out.printf("%d) 국어점수 :",start);
			kor = input.nextInt();
			System.out.printf("%d) 영어점수 :",start);
			en = input.nextInt();
			System.out.printf("%d) 수학점수 :",start);
			math = input.nextInt();
			all += kor + en + math;	
			System.out.printf("%d) 평균 : %d\n",start ,all / 3);
			System.out.printf("\n");
			all_1 += kor + en + math;		
			all = 0;
		}
		System.out.printf("전체합계 : %d\n",all_1);
		System.out.printf("전체평균 : %d\n",all_1 / 3);
	}
}