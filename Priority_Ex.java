package jang8;

class calcThread extends Thread
{
	public calcThread(String name) 
	{
		setName(name);
	}
	public void run()
	{
		for(int i = 0; i < 20000000; i++)
		{
			
		}
		System.out.println(getName());
	}
}
public class Priority_Ex
{
	
	public static void main(String[] args)
	{
		for(int i = 1; i <= 10; i++)
		{
			Thread thread = new calcThread("thread" + i);
			if(i != 10)
			{
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			else
			{
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}