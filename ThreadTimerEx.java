package jang8;

import java.awt.*;
import javax.swing.*;
/*
	-���μ���	:	�������� ���α׷�
	-��Ƽ ���μ���	:	�� �� �̻��� ���μ����� ����Ǵ� ���� ����(��Ƽ ���α׷����)
	-��Ƽ �½�ŷ	:	�� �� �̻��� ���μ����� �����Ͽ� ���� ó���ϴ� ���� ����
	-��Ƽ ���μ��� �ý���	:	��ǻ�� �ý����� ���ÿ� �����۾��� �����ϴ� �ý����� ���ϸ�
		������ �ð����ȿ� �� ���μ����� ���� �������� , ���� ���μ����� ������ȭ�� ���� �̷����(ó���� ������)
	*������ȯ	:	�������� ���μ����� ���¸� �����ϰ� ���ο� ���μ����� ���¸� cpu�� �����ϴ� ����
	-������ : ���μ��� ������ ����Ǵ� ���� �۾�����
	���δٸ� ���μ����� ���� ��ȯ��ſ� �ܼ��� ���� ���μ��������� ���ÿ� ����Ǵ� ���� �ٸ� �Լ�(�޼ҵ�)�� ����
	��ȯ���� �� ������ Ȯ���Ѱ� / �������� ����, �������� ������ �Ϸõ� �ϳ��� �۾��帧
	
	��Ƽ ������ : �ϳ��� ���μ������� ���� ���� �����尡 ���������� ó���Ǵ� ���� ����
		�޸��� ���ÿ����� ������ ���� ��ŭ ���� ����ƽ, �� �����ؼ� ���
		���α׷� ���� �ڿ��� �޸� ����
	�̱� ������ : ������ ������ ��� ��(thread.setDaemon(true))
	��Ƽ ������ : ������ ������ �ٸ� ������ ��� ����(thread.setDaemon(false))
	
	�������� ���� �ֱ�
	������� Thread��ü�� �����Ǹ� �����ֱ⸦ ���� �Ǵµ� ũ�� 5������ ������
	new : �����尡 ������� ����
	Runnable : ������ ��ü�� ������ �Ŀ� start()�޼ҵ带 ȣ���ϸ� Runnable ���·� �̵�
	Running : Runnable���¿��� ������ �����췯�� ���� Running���·� �̵�
	Blocked : �����尡 �ٸ� Ư���� ������ Running���¿��� Blocked���·� �̵�
	Dead : �����尡 ����Ǹ� �� ������� �ٽ� ������ �� ����
 */
class Timer_Thread extends Thread
{
	JLabel timerLabel;
	public Timer_Thread(JLabel timerLabel)
	{
		this.timerLabel = timerLabel;
	}
	public void run()
	{
		int n = 0;
		while(true)
		{
			timerLabel.setText(Integer.toString(n));
			n++;
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				return;
			}
		}
	}
}
public class ThreadTimerEx extends JFrame
{
	public ThreadTimerEx()
	{
		setTitle("ThreadTimerEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
			
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
			
		Timer_Thread th = new Timer_Thread(timerLabel);
		c.add(timerLabel);
			
		setSize(300,150);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) 
	{
		new ThreadTimerEx();
		
	}
}
