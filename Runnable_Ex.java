package jang10;

public class Runnable_Ex 
{
	public static void main(String[] args) 
	{	/*
		Runnable runnable = () ->
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		*/
		/*
		Thread th = new Thread(() ->
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.println(i);
			}
		});
		th.start();
		*/
		Runnable runnable2 = new Runnable()
		{
			@Override
			public void run() 
			{
				for(int i = 0; i < 10; i++)
				{
					System.out.println(i);
				}		
			}
		};
	}
}