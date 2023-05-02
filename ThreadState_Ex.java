package jang8;

class StatePrintThread extends Thread
{
	private Thread targetThread;
	public StatePrintThread(Thread targetThread)
	{
		this.targetThread = targetThread;
	}
	public void run()
	{
		while(true)
		{
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� : " + state);
			
			if(state == Thread.State.NEW)
			{
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED)
			{
				break;
			}
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
	}
}
class TargetThread extends Thread
{
	public void run()
	{
		for(long i = 0; i < 1000000000; i++) {}
		try
		{
			Thread.sleep(1500);
		}
		catch(Exception e) {}
		for(long i = 0; i < 1000000000; i++) {}
	}
}
public class ThreadState_Ex 
{
	public static void main(String[] args)
	{
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}