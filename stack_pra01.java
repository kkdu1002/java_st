package jang11;

public class stack_pra01 
{
	public static void main(String[] args) 
	{
		char stack[] = new char[5];
		int top = 0;
		
		//연산의 중간값, 결과값, 되부름 함수에서 사용, 한쪽이 막혀있는 구조, 0 주소방식 LIFO
		//삽입 push 삭제 pop
		
		/*
		for(int i = 0; i < stack.length; i++) 
		{
			stack[top] = (char) ('A' + i);
			top++;
			System.out.printf("%c 자동차가 터널에 들어감\n", stack[top - 1]);
		}
		
		System.out.println(); 
		
		for(int i = stack.length; i > 0 ; i-- ) 
		{
			System.out.printf("%c 자동차가 터널을 빠져나감\n", stack[top - 1]);
			top--;
			stack[top] = ' ';
		}*/
		if(top >= 5) 
		{
			System.out.printf("터널이 꽉 차서 못들어감");
		}
		else 
		{
			stack[top] = 'A';
			System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
			top++;

			stack[top] = 'B';
			System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
			top++;

			stack[top] = 'C';
			System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
			top++;
		}
		System.out.println();
		
		if(top <= 0)
		{
			System.out.printf("터널에 빠져나갈 자동차가 없음");
		}
		else 
		{
			top--;
			System.out.printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
			stack[top] = ' ';

			top--;
			System.out.printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
			stack[top] = ' ';

			top--;
			System.out.printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
			stack[top] = ' ';
		}
	}
}