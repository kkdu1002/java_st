package jang9;
/*
  	WorkObject ==> Object
  	
  	����ȭ�� ������� ����ȭ ��Ͽ��� �ٸ� �����忡�� ������� �ѱ��� ���Ѵ�.
  	�̿� ���� ����ȭ�� ��Ͽ��� �����尣�� ���(������� �ѱ�)�ϱ� ���ؼ���
  	wait() = �Һ��� , notify() = ������ , notifyAll()�޼ҵ带 ����ؾ��Ѵ�.
  	�̷� �޼ҵ带 ����� �� ������ ���� synchronized ��� �޼��忡 ����ؾ� �ǹ̰� �ִ�.
	synchronized ����� �ƴѰ�쿡 ����� ���
	jang.lang.IllegalMonitorStateException�� �߻��Ѵ�.
 */
class WorkObject
{
	public synchronized void methodA()
	{
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();
		try
		{
			wait();
		}
		catch(InterruptedException e) 
		{}
	}
	public synchronized void methodB()
	{
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();
		try
		{
			wait();
		}
		catch(InterruptedException e) 
		{}
	}
}
class ThreadA extends Thread
{
	private WorkObject workObjct;
	public ThreadA(WorkObject workObjct)
	{
		this.workObjct = workObjct;
	}
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			workObjct.methodA();
		}
	}
}
class ThreadB extends Thread
{
	private WorkObject workObjct;
	public ThreadB(WorkObject workObjct)
	{
		this.workObjct = workObjct;
	}
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			workObjct.methodB();
		}
	}
}
public class WaitNotify_Ex 
{
	public static void main(String[] args) 
	{
		WorkObject sharedObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
	}
}