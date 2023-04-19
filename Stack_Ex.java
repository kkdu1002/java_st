package jang12;

import java.util.Stack;

/*
	스택 (Stack)
	Stack 클래스는 오브젝트 후입선출(LIFO) 구조의 Stack를 나타낸다.
	이는 벡터를 스택으로 처리하는 5개의 메소드로 Vector클래스를 확장하게 된다.
	
	통상의 push()메소드와 pop메소드가 제공되는 것 외에
	스택의 선두 항목으로 peek()을 실시하는 메소드,
	스택이 비어있는지의 여부를 확인하는 메소드 isEmpty(),
	스택으로 항목을 찾아서 선두로부터 몇 번째인지를 찾아내는 메소드가 제공된다.
	
	스택이 처음으로 작성되었을때 , 항목은 존재하지 않는다.
	
	- boolean empty()
		스택이 비어있는지 확인한다.
	- E Object peek()
		스택의 맨 위의 객체를 스택에서 제거하지 않고 반환한다.
	- E Object push()
		객체를 스택 자료구조에 저장한다.
	- E Object pop()
		스택의 맨 위의 객체를 반환하고 스택에서 제거한다.
	- int search(Object o)
		스택의 맨 위에서부터 파라미터 값으로 넘겨받은 객체까지의 거리를 반환한다.
		맨위의 객체의 경우 1을 반환하고 
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
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}