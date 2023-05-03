package jang9;
/*
	스레드 활용 : Thread class를 상속받아서 구현하기
	main부터 실행되고 Sub 실행
	Thread 종류
	- User Thread : main 종료와 상관없이 thread가 계속 실행됨
	[setDaemon(false)]와 같다
	- Daemon Thread : main 종료시 thread종료 : Daemon : 보조스레드
	ex) gc, [setDaemon(true)]와 같다.
	프로그램이 완료되었지만 스레드가 여전히 실행중 일때 JVM이 종료되지 않도록하는 스레드
	JVM이 스스로 필요에 의해 사용하는 것
	
	Thread.activeCount(); 현재 실행중인 thread 개수
	Thread 스케줄 방식
	선점형 스레드 스케줄링 : 스레드의 우선권을 가지고 우선순위가 높은 스레드를 먼저 수행시키는 방식
	비선점형 스레드 스케줄링 : 실행중인 스레드가 CPU사용권을 다른 스레드에게 넘길 때까지 기다리는 방식
	- JVM은 우선순위에 따른 선점형 스레드 스케줄링방식을 사용한다.
	- 우선순위가 빠르다고 해서 먼저 수행되지 않는다.
	작업량에 따라 결정됨 , 우선순위는 참고일뿐
	- 멀티 스레드가 수행괼 때 어떤 스레드가 먼저 수행될지는 스레드 스케줄러가 결정하게 된다.
 */
class AutoSaveThread extends Thread
{
	public void save()
	{
		System.out.println("작업 내용을 저장함");
	}
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				break;
			}
			save();
		}
	}
}
public class Daemon_Ex 
{
	public static void main(String[] args) 
	{
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{}
		System.out.println("메인 스레드 종료");
	}
}