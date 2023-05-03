package jang9;

class MyThread6 extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 20; i++)
		{
			System.out.println("i : " + i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{e.getMessage();}
		}
	}
}
class MyThread61 implements Runnable
{
	public void run()
	{
		for(int k = 1; k <= 20; k++)
		{
			System.out.println("k : " + k);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{e.getMessage();}
		}
	}
}
public class Thread_Ex2 
{
	public static void main(String[] args) {
		System.out.println("main....");
		MyThread6 th = new MyThread6();
		th.start();	
		Thread th2 = new Thread(new MyThread61());
		th2.start();
		System.out.println("프로그램 종료");
	}
}