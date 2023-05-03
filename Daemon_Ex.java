package jang9;
/*
	������ Ȱ�� : Thread class�� ��ӹ޾Ƽ� �����ϱ�
	main���� ����ǰ� Sub ����
	Thread ����
	- User Thread : main ����� ������� thread�� ��� �����
	[setDaemon(false)]�� ����
	- Daemon Thread : main ����� thread���� : Daemon : ����������
	ex) gc, [setDaemon(true)]�� ����.
	���α׷��� �Ϸ�Ǿ����� �����尡 ������ ������ �϶� JVM�� ������� �ʵ����ϴ� ������
	JVM�� ������ �ʿ信 ���� ����ϴ� ��
	
	Thread.activeCount(); ���� �������� thread ����
	Thread ������ ���
	������ ������ �����ٸ� : �������� �켱���� ������ �켱������ ���� �����带 ���� �����Ű�� ���
	������ ������ �����ٸ� : �������� �����尡 CPU������ �ٸ� �����忡�� �ѱ� ������ ��ٸ��� ���
	- JVM�� �켱������ ���� ������ ������ �����ٸ������ ����Ѵ�.
	- �켱������ �����ٰ� �ؼ� ���� ������� �ʴ´�.
	�۾����� ���� ������ , �켱������ �����ϻ�
	- ��Ƽ �����尡 ���౮ �� � �����尡 ���� ��������� ������ �����ٷ��� �����ϰ� �ȴ�.
 */
class AutoSaveThread extends Thread
{
	public void save()
	{
		System.out.println("�۾� ������ ������");
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
		System.out.println("���� ������ ����");
	}
}