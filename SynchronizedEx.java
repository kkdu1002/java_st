package jang8;
/*
	����ȭ : �������� �����ϴ� ���� �����ϱ� ���� ���
	�Ӱ迵�� : ��Ƽ �����忡 ���� �����ڿ��� ������ �� �ִ� �ڵ��� ������ ���Ѵ�
	��Ƽ ������ ���α׷����� �Ӱ迵���� ó���ϴ� ��� �ɰ��� ������ �߻��� �� �ִ�.
	�̷��� ��Ȳ�� �ذ��� �� �ִ� ����� ����ȭ�� �̿��ϴ� ���̴�.
	����ȭ�� ó���ϱ� ���� ��� ��ü ��(LOCK)�� ���Խ�Ų��.
	
	LOCK : ���� ��ü�� ���� �����尡 ���ÿ� �������� ���ϵ��� �ϱ� ���� ������
		   ��� ��ü�� �� ������ ������ �� �ڵ����� ����� ����.
		   �߸� ����ȭ ��Ű�� DEAD LOCK(��������)�� �ɸ�
		   
	* ����ȭ ���
	1. �޼ҵ� ��� : �ɼ� ������ ������� ������ . �ӵ� ������
	- public synchronized void synchronizedEx()
	{
		//�Ӱ迵���ڵ�
	}
	2. ����ȭ �� ��� : ����ȭ ������ �پ�ȭ �� �� �ִ�.
	- public void nomalMethod()
	{
		������ü�� ��ü �ڽ��̸� this�� ���� �� �ִ�.
		����ȭ�� ����� �˸��� �뵵�� ���
		�޼ҵ尡 ȣ��� �ν��Ͻ� �ڽ��� ����(synchronized)�� ������� ����ȭ�� �����ϴ� ����
		synchronized(����ȭ�� ��ü �Ǵ� Ŭ������)
		{ 
			�Ӱ迵�� �ڵ�
		}
	
	}
	DEAD LOCK(���� ����)
	�ΰ��̻��� �����尡 �������� ���ϴ� ���·� ��� ��ٸ� �� �߻�
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
		 �������� ����ӵ��� �ʹ� ������ ������
		 �浹�� �߻��� �����ʴ�. �׷��� ���Ƿ� add()�޼ҵ忡
		 ���� �浹�� ���� �߻���Ű�� ���� �ٸ� �����忡�� �纸�ϵ��� ��
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
