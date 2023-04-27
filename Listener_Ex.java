package jang8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyActionListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
		{
			b.setText("액션");
			
			b.setBackground(Color.ORANGE);
			System.out.println(b.getText());
		}
		else if(b.getText().equals("액션"))
		{
			b.setText("Action");
			b.setBackground(Color.PINK);
			System.out.println(b.getText());
		}
		
		else if(b.getText().equals("문제"))
		{
			b.setText("과정");
			System.out.println(b.getText());
		}
		else if(b.getText().equals("과정"))
		{
			b.setText("문제");
			System.out.println(b.getText());
		}
		
		else if(b.getText().equals("풀이"))
		{
			b.setText("결과");
			System.out.println(b.getText());
		}
		else if(b.getText().equals("결과"))
		{
			b.setText("풀이");
			System.out.println(b.getText());
		}
	}
}
public class Listener_Ex extends JFrame
{
	Listener_Ex()
	{
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton jb = new JButton("Action");
		JButton jb1 = new JButton("문제");
		JButton jb2 = new JButton("풀이");
		
		MyActionListener listener = new MyActionListener();
		jb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				jb.setBackground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				jb.setBackground(Color.YELLOW);
			}
		});
	/*	jb.addMouseListener(new MouseListener() 
		{
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e)	{}
			
			@Override
			public void mouseExited(MouseEvent e) 
			{
				jb.setBackground(Color.RED);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				jb.setBackground(Color.YELLOW);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
		});*/
		
		jb.addActionListener(listener);
		jb1.addActionListener(listener);
		jb2.addActionListener(listener);
		
		add(jb);
		add(jb1);
		add(jb2);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Listener_Ex();
	}
}