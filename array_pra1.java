package jang11;

import java.util.Scanner;

public class array_pra1 
{
	/*
	  �迭
	  1. �迭�̶� ũ��� ������ ���� �Ϸ��� ���ҵ��� ��
	  ������ ���� ������ ���� �ڷ��� ����ü�� �ǹ��ϴ� ������
	  �������� ������ ���� �ڷ�鿡 ���� ���������� �ڷ���(Data Type)�� �ο����� �ʰ�
	  �ϳ��� �̸��� ������ ó���� �������� ����Ѵ�.
	 
	  2. �ڹٿ����� �迭�� ������ ���� ������ ���� ���ȴ�.
	  �迭 ���� -> �迭�� �޸� �Ҵ� -> �迭 ����� �̿�
	  
	  ���� �� ����
	  �ڷ���[]							
   	  ������;							int a[];			int a[] = new int[5];	int a[];		int a[] = {��,.....};
 	  ������ = new�ڷ���[���ũ��];		a = new int[5];								a = new int[]{��,.....};
 	  ������[�ε���] = ��;				a[0] = ��;			a[0] = ��;	
 	  
 	  �⺻�� �迭�� �ʱⰪ, �ʵ��� �ʱⰪ�� ����.
 	  ������ : \u0000
 	  ������ : 0
 	  �Ǽ��� : 0.0
 	  ���� : false
 	  ��ü = �������迭�� �ʱⰪ : null
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
			System.out.printf("i_Array[%d]��° : %d\n",k,i_Array[k]); 
		}
		
		for (int k = 0; k < b.length ; k++) 
		{
			System.out.printf("b[%d]��° : %b\n",k,b[k]); 
		}
		
		for (int k = 0; k < s.length ; k++) 
		{
			System.out.printf("s[%d]��° : %s\n",k,s[k]); 
		}
		
		for (int j = 0; j < 5 ; j++) 
		{
			i_Array[j] = in.nextInt();
			if(i_Array[j] > max)
				max = i_Array[j];
		}
		System.out.printf("�Էµ� �� �߿��� ���� ū ���� %d �Դϴ�.",max);
	}
}