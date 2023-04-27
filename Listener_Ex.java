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
			b.setText("�׼�");
			
			b.setBackground(Color.ORANGE);
			System.out.println(b.getText());
		}
		else if(b.getText().equals("�׼�"))
		{
			b.setText("Action");
			b.setBackground(Color.PINK);
			System.out.println(b.getText());
		}
		
		else if(b.getText().equals("����"))
		{
			b.setText("����");
			System.out.println(b.getText());
		}
		else if(b.getText().equals("����"))
		{
			b.setText("����");
			System.out.println(b.getText());
		}
		
		else if(b.getText().equals("Ǯ��"))
		{
			b.setText("���");
			System.out.println(b.getText());
		}
		else if(b.getText().equals("���"))
		{
			b.setText("Ǯ��");
			System.out.println(b.getText());
		}
	}
}
public class Listener_Ex extends JFrame
{
	Listener_Ex()
	{
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton jb = new JButton("Action");
		JButton jb1 = new JButton("����");
		JButton jb2 = new JButton("Ǯ��");
		
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