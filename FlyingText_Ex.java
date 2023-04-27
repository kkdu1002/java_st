package jang8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlyingText_Ex extends JFrame
{
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("HELLO");
	final int FLYING_UNIT = 10;
	FlyingText_Ex()
	{
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener2());
		la.setLocation(50, 50);
		la.setSize(100,20);
		contentPane.add(la);
		setSize(300,300);
		setVisible(true);
		contentPane.requestFocus();
	}
	class MyKeyListener2 extends KeyAdapter
	{
		@Override
		public void keyPressed(KeyEvent e) 
		{
			int keyCode = e.getKeyCode();
			switch(keyCode)
			{
				case KeyEvent.VK_UP:
					la.setLocation(la.getX() , la.getY() - FLYING_UNIT);
					System.out.println(la.getX() + (la.getY() - FLYING_UNIT));
					break;
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX() , la.getY() + FLYING_UNIT);
					System.out.println(la.getX() + (la.getY() + FLYING_UNIT));
					break;
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX() - FLYING_UNIT , la.getY());
					System.out.println((la.getX() - FLYING_UNIT) + la.getY());
					break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX() + FLYING_UNIT , la.getY());
					System.out.println((la.getX() + FLYING_UNIT) + la.getY());
					break;
			}
		}
	}
	public static void main(String[] args) 
	{
		new FlyingText_Ex();
	}
}