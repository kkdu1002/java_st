package jang9;
class ThreadSub extends Thread
{
	public void run()
	{
		for(char ch = 'A'; ch < 'Z'; ch++)
		{
			System.out.println(ch);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Thread_Ex 
{
	public static void main(String[] args) 
	{
		ThreadSub ts = new ThreadSub();
		
		ts.setDaemon(true); //메인이 끝나면 모두 종료
//		ts.setDaemon(false); // 메인과 무관하게 남아 있는 스레드 수행
		System.out.println(Thread.activeCount());
		System.out.println("스레드 초기상태 확인" + ts.isDaemon());
		ts.start();
		for(int i = 0; i < 5; i++)
		{
			System.out.println("main : " + i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
	}
}