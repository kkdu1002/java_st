package jang8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class TimerRunnable1 extends JLabel implements Runnable
{
	JLabel timerLabel;
	public TimerRunnable1(JLabel timerLabel)
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
public class ThreadInterruptEx extends JFrame
{
	Thread th;
	ThreadInterruptEx()
	{
		setTitle("ThreadInterruptEx ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		TimerRunnable1 runnable = new TimerRunnable1(timerLabel);
		th = new Thread(runnable);
		c.add(timerLabel);
		
		JButton btn = new JButton("kill timer");
		btn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				th.interrupt();
				JButton btn = (JButton) e.getSource();
				btn.setEnabled(false);
			}
		});
		c.add(btn);
		setSize(300,150);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) 
	{
		new ThreadInterruptEx();
	}
}