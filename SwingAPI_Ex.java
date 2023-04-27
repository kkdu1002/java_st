package jang8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingAPI_Ex extends JFrame
{
	Container contentPane;
	JLabel la;
	JButton b1,b2,b3,b4;
	SwingAPI_Ex()
	{
		setTitle("Swing 공통 메소드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		b1 = new JButton("위치와 크기 정보");
		b1.addActionListener(new MyButtonListener());
		contentPane.add(b1);
		
		b2 = new JButton("모양 정보");
		b2.setOpaque(true);
		b2.setForeground(Color.MAGENTA);
		b2.setBackground(Color.YELLOW);
		b2.setFont(new Font("고딕체",Font.ITALIC,20));
		b2.addActionListener(new MyButtonListener());
		contentPane.add(b2);
		
		b3 = new JButton("작동하지 않는 버튼");
		b3.setEnabled(false);
		b3.addActionListener(new MyButtonListener());
		contentPane.add(b3);
		
		b4 = new JButton("숨기기 / 보이기");
		b4.addActionListener(new MyButtonListener());
		contentPane.add(b4);
		
		setSize(250,200);
		setVisible(true);
	}
	class MyButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Object source = e.getSource();
			if(source == b1)
			{
				System.out.println("버튼의 위치와 크기");
				System.out.println("위치 = (" + b1.getX() + "," + b1.getY() +")");
				System.out.println("크기 = (" + b1.getWidth() + "x" + b1.getHeight() +")");
			
				// 부모 컨테이너주소 알아내기
				JPanel c = (JPanel)b2.getParent();
				System.out.println("컨텐트팬의 위치와 크기");
				System.out.println("위치 = (" + c.getX() + "," + c.getY() +")");
				System.out.println("크기 = (" + c.getWidth() + "x" + c.getHeight() +")");
			}
			else if(source == b2)
			{
				System.out.println("폰트 = " + b2.getFont());
				System.out.println("배경색 = " + b2.getBackground());
				System.out.println("글자색 = " + b2.getForeground());
			}
			else
			{
				if(b1.isVisible())
				{
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
				}
				else
				{
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
				}
			}
		}
		
	}
	public static void main(String[] args) 
	{
		new SwingAPI_Ex();
	}
}