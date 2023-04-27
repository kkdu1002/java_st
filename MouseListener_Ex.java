package jang8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListener_Ex extends JFrame
{
	JLabel la;
	MouseListener_Ex()
	{
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());
	
		la = new JLabel("hello");
		la.setSize(50,20);
		la.setLocation(30, 20);
		la.setOpaque(true);
		la.setBackground(Color.BLACK);
		la.setFont(new Font("궁서",Font.ITALIC,10));
		la.setForeground(Color.CYAN);
		add(la);
		
		setSize(400,400);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener
	{
		@Override
		public void mousePressed(MouseEvent e) 
		{
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {	}
	}
	public static void main(String[] args) 
	{
		new MouseListener_Ex();
	}
}