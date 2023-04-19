package jang12;

import java.util.Stack;

/*
	���� (Stack)
	Stack Ŭ������ ������Ʈ ���Լ���(LIFO) ������ Stack�� ��Ÿ����.
	�̴� ���͸� �������� ó���ϴ� 5���� �޼ҵ�� VectorŬ������ Ȯ���ϰ� �ȴ�.
	
	����� push()�޼ҵ�� pop�޼ҵ尡 �����Ǵ� �� �ܿ�
	������ ���� �׸����� peek()�� �ǽ��ϴ� �޼ҵ�,
	������ ����ִ����� ���θ� Ȯ���ϴ� �޼ҵ� isEmpty(),
	�������� �׸��� ã�Ƽ� ���ηκ��� �� ��°������ ã�Ƴ��� �޼ҵ尡 �����ȴ�.
	
	������ ó������ �ۼ��Ǿ����� , �׸��� �������� �ʴ´�.
	
	- boolean empty()
		������ ����ִ��� Ȯ���Ѵ�.
	- E Object peek()
		������ �� ���� ��ü�� ���ÿ��� �������� �ʰ� ��ȯ�Ѵ�.
	- E Object push()
		��ü�� ���� �ڷᱸ���� �����Ѵ�.
	- E Object pop()
		������ �� ���� ��ü�� ��ȯ�ϰ� ���ÿ��� �����Ѵ�.
	- int search(Object o)
		������ �� ���������� �Ķ���� ������ �Ѱܹ��� ��ü������ �Ÿ��� ��ȯ�Ѵ�.
		������ ��ü�� ��� 1�� ��ȯ�ϰ� 
 */
public class Stack_Ex 
{
	public static void main(String[] args) 
	{
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty())
		{
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : " + coin.getValue() + "��");
		}
	}
}