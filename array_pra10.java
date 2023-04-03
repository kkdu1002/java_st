package jang11;

import java.util.Scanner;

public class array_pra10 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int student;
		System.out.print("입력 처리할 학생 수(명) : ");
		student = input.nextInt();
		
		String name[] = new String[student];
		String phone[] = new String[student];
		
		for(int i = 0; i < student; i++) 
		{
			System.out.printf("이름 전화번호 입력(%d)[공백구분] : ",i + 1);
			name[i] = input.next(); //공백문자 안읽음
			phone[i] = input.next();
		}
		System.out.println("-----------------");
		System.out.printf("전체 학생 수 : %d\n",student);
		System.out.println("-----------------");
		
		System.out.println("이름	전화번호");
		for(int i = 0; i < name.length; i++) 
		{
			System.out.printf("%s	%s\n",name[i],phone[i]);
		}
	}
}