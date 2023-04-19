package jang12;

import java.util.*;
/*
	ť(Queue)
	ť�� FIFO(First in First Out) ������ ���� �Էµ� �ڷḦ ���� ����ϸ�
	Queue�������̽��� ������ Ŭ������ ť�� ���õ� �پ��� ����� �����Ѵ�.
	
	Queue�������̽� �ν��Ͻ��� �����ϱ� ���ؼ��� new �����ڸ� �̿��Ͽ� Queue �������̽��� ������
	Ŭ������ �����ڸ� ȣ���ϴ� ����� ���ؼ� �����Ѵ�.
	ex)	Queue ob = new LinkedList();
	
	- E element()
	ť�� head��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.
	- boolean offer(E o)
	������ ��Ҹ� ť�� �����Ѵ�.
	- E peek()
	ť�� head ��Ҹ� ��ȯ�ϰ� �������������� , ť�� empty�� ��� null�� ��ȯ�Ѵ�.
	- E poll()
	ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ� , ť�� empty�� ��� null�� ��ȯ�Ѵ�.
	- E remove()
	ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�. 
*/
public class Queue_Ex 
{
	// ���� front <-- rear(����)
	// ���� head <-- tail(����)
	// ���� offer <-- poll(����) --> �ڹٿ��� ����
	public static void main(String[] args) 
	{
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSMS","�ſ��"));
		messageQueue.offer(new Message("sendKakaotalk","ȫ�α�"));
		
		while(!messageQueue.isEmpty())
		{
			Message message = messageQueue.poll();
			switch(message.command)
			{
				case "sendMail":
					System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
					break;
				case "sendSMS":
					System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
					break;
			}
		}
	}
}