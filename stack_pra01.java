package jang11;

public class stack_pra01 
{
	public static void main(String[] args) 
	{
		char stack[] = new char[5];
		int top = 0;
		
		//������ �߰���, �����, �Ǻθ� �Լ����� ���, ������ �����ִ� ����, 0 �ּҹ�� LIFO
		//���� push ���� pop
		
		/*
		for(int i = 0; i < stack.length; i++) 
		{
			stack[top] = (char) ('A' + i);
			top++;
			System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top - 1]);
		}
		
		System.out.println(); 
		
		for(int i = stack.length; i > 0 ; i-- ) 
		{
			System.out.printf("%c �ڵ����� �ͳ��� ��������\n", stack[top - 1]);
			top--;
			stack[top] = ' ';
		}*/
		if(top >= 5) 
		{
			System.out.printf("�ͳ��� �� ���� ����");
		}
		else 
		{
			stack[top] = 'A';
			System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
			top++;

			stack[top] = 'B';
			System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
			top++;

			stack[top] = 'C';
			System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
			top++;
		}
		System.out.println();
		
		if(top <= 0)
		{
			System.out.printf("�ͳο� �������� �ڵ����� ����");
		}
		else 
		{
			top--;
			System.out.printf("%c �ڵ����� �ͳ��� ��������\n", stack[top]);
			stack[top] = ' ';

			top--;
			System.out.printf("%c �ڵ����� �ͳ��� ��������\n", stack[top]);
			stack[top] = ' ';

			top--;
			System.out.printf("%c �ڵ����� �ͳ��� ��������\n", stack[top]);
			stack[top] = ' ';
		}
	}
}