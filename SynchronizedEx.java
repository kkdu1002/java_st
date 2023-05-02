package jang8;
/*
	동기화 : 여러명이 접근하는 것을 방지하기 위한 방법
	임계영역 : 멀티 스레드에 의해 공유자원이 참조될 수 있는 코드의 범위를 말한다
	멀티 스레드 프로그램에서 임계영역을 처리하는 경우 심각한 문제가 발생할 수 있다.
	이러한 살황을 해결할 수 있는 방법이 동기화를 이용하는 것이다.
	동기화를 처리하기 위해 모든 객체 락(LOCK)을 포함시킨다.
	
	LOCK : 공유 객체에 여러 스레드가 동시에 접근하지 못하도록 하기 위한 것으로
		   모든 객체가 힙 영역에 생성될 때 자동으로 만들어 진자.
		   잘못 동기화 시키면 DEAD LOCK(교착상태)에 걸림
		   
	* 동기화 방법
	1. 메소드 기반 : 될수 있으면 사용하지 마세요 . 속도 떨어짐
	- public synchronized void synchronizedEx()
	{
		//임계영역코딩
	}
	2. 동기화 블럭 기반 : 동기화 기준을 다양화 할 수 있다.
	- public void nomalMethod()
	{
		공유객체가 객체 자신이면 this를 넣을 수 있다.
		동기화의 대상을 알리는 용도로 사용
		메소드가 호출된 인스턴스 자신의 열쇠(synchronized)를 대상으로 동기화를 진행하는 문장
		synchronized(동기화할 객체 또는 클래스명)
		{ 
			임계영역 코딩
		}
	
	}
	DEAD LOCK(교착 상태)
	두개이상의 스레드가 만족하지 못하는 상태로 계속 기다릴 때 발생
 */
class SyncObject
{
	int sum = 0;
	synchronized void add()
	{
		int n = sum;
		Thread.currentThread().yield();
//		Thread.currentThread().yield();
		/*
		 스레드의 실행속도가 너무 빠르기 때문에
		 충돌이 발생이 쉽지않다. 그래서 고의로 add()메소드에
		 대한 충돌을 쉽게 발생시키기 위해 다른 스레드에게 양보하도록 함
		 */
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	int getSum()
	{
		return sum;
	}
}
class WorkerThread extends Thread
{
	SyncObject sObj;
	WorkerThread(String name,SyncObject sObj)
	{
		super(name);
		this.sObj = sObj;
	}
	public void run()
	{
		int i = 0;
		while(i < 10)
		{
			sObj.add();
			i++;
		}
	}
}
public class SynchronizedEx 
{
	public static void main(String[] args) 
	{
		SyncObject obj = new SyncObject();
		Thread th1 = new WorkerThread("kitae",obj);
		Thread th2 = new WorkerThread("hyosoo",obj);
		th1.start();
		th2.start();
	}
}
