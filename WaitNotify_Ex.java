package jang9;
/*
  	WorkObject ==> Object
  	
  	동기화된 스레드는 동기화 블록에서 다른 스레드에게 제어권을 넘기지 못한다.
  	이와 같이 동기화된 블록에서 스레드간의 통신(제어권을 넘김)하기 위해서는
  	wait() = 소비자 , notify() = 생산자 , notifyAll()메소드를 사용해야한다.
  	이런 메소드를 사용할 때 주의할 점은 synchronized 블록 메서드에 사용해야 의미가 있다.
	synchronized 블록이 아닌경우에 사용할 경우
	jang.lang.IllegalMonitorStateException이 발생한다.
 */
class WorkObject
{
	public synchronized void methodA()
	{
		System.out.println("ThreadA의 methodA() 작업 실행");
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
		System.out.println("ThreadB의 methodB() 작업 실행");
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