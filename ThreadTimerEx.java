package jang8;

import java.awt.*;
import javax.swing.*;
/*
	-프로세스	:	실행중인 프로그램
	-멀티 프로세스	:	두 개 이상의 프로세스가 실행되는 것을 말함(멀티 프로그램방식)
	-멀티 태스킹	:	두 개 이상의 프로세스를 싱행하여 일을 처리하는 것을 말함
	-멀티 프로세싱 시스템	:	컴퓨터 시스템이 동시에 여러작업을 수행하는 시스템을 말하며
		지정된 시간동안에 각 프로세스의 실행 상태저장 , 다음 프로세스의 문맥전화을 통해 이루어짐(처리기 여러개)
	*문맥전환	:	실행중인 프로세스의 상태를 보관하고 새로운 프로세스의 상태를 cpu에 적재하는 과정
	-스레드 : 프로세스 내에서 실행되는 세부 작업단위
	서로다른 프로세스들 간의 전환대신에 단순히 동일 프로세스내에서 동시에 실행되는 여러 다른 함수(메소드)들 간의
	전환으로 그 개념을 확장한것 / 시작점과 진행, 종료점을 가지는 일련된 하나의 작업흐름
	
	멀티 스레드 : 하나의 프로세스에서 여러 개의 스레드가 병행적으로 처리되는 것을 말함
		메모리의 스택영역을 스레드 개수 만큼 분할 스택틱, 힙 공유해서 사용
		프로그램 내에 자원과 메모리 공유
	싱글 스레드 : 메인이 끝나면 모두 끝(thread.setDaemon(true))
	멀티 스레드 : 메인이 끝나도 다른 스레드 계속 수행(thread.setDaemon(false))
	
	스레드의 생명 주기
	스레드는 Thread객체가 생성되면 생명주기를 갖게 되는데 크게 5가지로 나눈다
	new : 스레드가 만들어진 생태
	Runnable : 스레드 객체가 생성된 후에 start()메소드를 호출하면 Runnable 상태로 이동
	Running : Runnable상태에서 스레드 스케쥴러에 의해 Running상태로 이동
	Blocked : 스레드가 다른 특정한 이유로 Running상태에서 Blocked상태로 이동
	Dead : 스레드가 종료되면 그 스레드는 다시 시작할 수 없음
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
		setTitle("ThreadTimerEx 예제");
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
