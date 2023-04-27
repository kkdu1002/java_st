package jang8;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class NullContainer_Ex extends JFrame
{
	NullContainer_Ex()
	{
		setTitle("Null Containter Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!",JLabel.CENTER);
		la.setLocation(130, 50);
		la.setSize(200, 20);
		la.setBorder(new LineBorder(Color.RED,5));
		add(la);
		for(int i = 1; i < 10; i++)
		{
			JButton jb = new JButton(Integer.toString(i));
			/*
				������ 4���� : CMYK �þ�(û��) ����Ÿ(����) �뷩 ����
				��(��)�� 3���� : RGB
				��+�� = �� / ��+�� = ����Ÿ / ��+�� = �þ�
			 */
//				������ ����				  ( R	 ,	G	,	B)
			jb.setBackground(new Color(i * 25, 200 , i * 25));
			jb.setLocation(i * 15 , i * 15);
			jb.setSize(50, 20);
			add(jb);
		}
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new NullContainer_Ex();
	}
}