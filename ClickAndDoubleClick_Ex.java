package jang8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ClickAndDoubleClick_Ex extends JFrame
{
	JPanel contentPane = new JPanel();
	JLabel la;
	ClickAndDoubleClick_Ex()
	{
		setTitle("ClickAndDoubleClick_Ex ¿¹Á¦");
		setContentPane(contentPane);
		contentPane.addMouseListener(new MyMouseListener3());
		contentPane.addMouseMotionListener(new MyMouseListener3());
		la = new JLabel("No Mouse Event");
		contentPane.add(la);
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener3 extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent e) 
		{
			if(e.getClickCount() == 2)
			{
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				JPanel p = (JPanel)e.getSource();
				p.setBackground(new Color(r,b,g));
				System.out.println(p.getBackground());
			}
		}
	}

	public static void main(String[] args) 
	{
		new ClickAndDoubleClick_Ex();
	}
}