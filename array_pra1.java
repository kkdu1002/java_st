package jang11;

import java.util.Scanner;

public class array_pra1 
{
	/*
	  배열
	  1. 배열이란 크기와 성격이 같은 일련의 원소들이 모여
	  공동의 집합 구조를 갖는 자료의 집합체를 의미하는 것으로
	  동질적인 성격을 가진 자료들에 대해 개별적으로 자료형(Data Type)을 부여하지 않고
	  하나의 이름을 가지고 처리할 목적으로 사용한다.
	 
	  2. 자바에서의 배열은 다음과 같은 순서에 의해 사용된다.
	  배열 선언 -> 배열에 메모리 할당 -> 배열 요소의 이용
	  
	  형식 및 구조
	  자료형[]							
   	  변수명;							int a[];			int a[] = new int[5];	int a[];		int a[] = {값,.....};
 	  변수명 = new자료형[요소크기];		a = new int[5];								a = new int[]{값,.....};
 	  변수명[인덱스] = 값;				a[0] = 값;			a[0] = 값;	
 	  
 	  기본형 배열의 초기값, 필드의 초기값과 같다.
 	  문자형 : \u0000
 	  정수형 : 0
 	  실수형 : 0.0
 	  불형 : false
 	  객체 = 참조형배열의 초기값 : null
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int i_Array[] = new int[5];
		int max = 0;
		boolean b[] = new boolean[5];
		String s[] = new String[5];
		
		for (int k = 0; k < i_Array.length ; k++) 
		{
			System.out.printf("i_Array[%d]번째 : %d\n",k,i_Array[k]); 
		}
		
		for (int k = 0; k < b.length ; k++) 
		{
			System.out.printf("b[%d]번째 : %b\n",k,b[k]); 
		}
		
		for (int k = 0; k < s.length ; k++) 
		{
			System.out.printf("s[%d]번째 : %s\n",k,s[k]); 
		}
		
		for (int j = 0; j < 5 ; j++) 
		{
			i_Array[j] = in.nextInt();
			if(i_Array[j] > max)
				max = i_Array[j];
		}
		System.out.printf("입력된 수 중에서 가장 큰 수는 %d 입니다.",max);
	}
}