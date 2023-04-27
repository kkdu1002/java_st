package jang8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAll_Ex extends JFrame
{
	JPanel contentPane = new JPanel();
	JLabel la;
	MouseListenerAll_Ex()
	{
		setTitle("MouseListener¿Í MouseMOtionListener ¿¹Á¦");
		setContentPane(contentPane);
		contentPane.addMouseListener(new MyMouseListener3());
		contentPane.addMouseMotionListener(new MyMouseListener3());
		la = new JLabel("No Mouse Event");
		contentPane.add(la);
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener3 implements MouseListener,MouseMotionListener
	{
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			la.setText("MouseDragged (" + e.getX()+ "," + e.getY()+ ")");
		}
		@Override
		public void mouseMoved(MouseEvent e)
		{
			la.setText("MouseMoved (" + e.getX()+ "," + e.getY()+ ")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) 
		{
			la.setText("MousePressed (" + e.getX()+ "," + e.getY()+ ")");
		}

		@Override
		public void mouseReleased(MouseEvent e) 
		{
			la.setText("MouseReleased (" + e.getX()+ "," + e.getY()+ ")");
		}

		@Override
		public void mouseEntered(MouseEvent e) 
		{
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) 
		{
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.YELLOW);
		}
	}
	public static void main(String[] args) 
	{
		new MouseListenerAll_Ex();
	}
}