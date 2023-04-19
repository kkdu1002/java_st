package jang12;

import java.util.*;
/*
	큐(Queue)
	큐는 FIFO(First in First Out) 구조로 먼저 입력된 자료를 먼저 출력하며
	Queue인터페이스를 구현한 클래스는 큐와 관련된 다양한 기능을 제공한다.
	
	Queue인터페이스 인스턴스를 생성하기 위해서는 new 연산자를 이용하여 Queue 인터페이스를 구현한
	클래스의 생성자를 호출하는 방법을 통해서 진행한다.
	ex)	Queue ob = new LinkedList();
	
	- E element()
	큐의 head요소를 반환하며 삭제하지 않는다.
	- boolean offer(E o)
	지정된 요소를 큐에 삽입한다.
	- E peek()
	큐의 head 요소를 반환하고 삭제하지않으며 , 큐가 empty인 경우 null을 반환한다.
	- E poll()
	큐의 head 요소를 반환하고 삭제하며 , 큐가 empty인 경우 null을 반환한다.
	- E remove()
	큐의 head 요소를 반환하고 삭제한다. 
*/
public class Queue_Ex 
{
	// 삭제 front <-- rear(삽입)
	// 삭제 head <-- tail(삽입)
	// 삭제 offer <-- poll(삽입) --> 자바에서 지원
	public static void main(String[] args) 
	{
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","신용권"));
		messageQueue.offer(new Message("sendKakaotalk","홍두깨"));
		
		while(!messageQueue.isEmpty())
		{
			Message message = messageQueue.poll();
			switch(message.command)
			{
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}
	}
}