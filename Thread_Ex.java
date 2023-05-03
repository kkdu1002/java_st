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
		
		ts.setDaemon(true); //������ ������ ��� ����
//		ts.setDaemon(false); // ���ΰ� �����ϰ� ���� �ִ� ������ ����
		System.out.println(Thread.activeCount());
		System.out.println("������ �ʱ���� Ȯ��" + ts.isDaemon());
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