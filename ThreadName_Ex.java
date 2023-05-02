package jang8;

class ThreadA extends Thread
{
	ThreadA()
	{
		setName("ThreadA");
	}
	public void run()
	{
		for(int i = 0; i < 2; i++)
		{
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
class ThreadB extends Thread
{
	public void run()
	{
		for(int i = 0; i < 2; i++)
		{
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
public class ThreadName_Ex 
{
	public static void main(String[] args) 
	{
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸� : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸� : " + threadB.getName());
		threadB.start();
	}
}