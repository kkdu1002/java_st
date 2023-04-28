package jang8;

import javax.swing.*;
import java.awt.*;

public class graphicsColor_Ex extends JFrame
{
	Container contentPane;
	graphicsColor_Ex()
	{
		setTitle("JPanel paintComponent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel , BorderLayout.CENTER);
		setSize(350,450);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			g.drawString("�ڹٴ� ��մ�~",30,30);
			g.setColor(new Color(255,0,0));
			g.setFont(new Font("Arial",Font.ITALIC,30));
			g.drawString("How much",30,60);
			g.setColor(new Color(0x00ff00ff));
			for(int i = 1; i <= 5; i++)
			{
				g.setFont(new Font("Jokerman",Font.ITALIC,i*10));
				g.drawString("This much!!", 30, 60+i*60);
			}
		}
	}
	public static void main(String[] args) 
	{
		new graphicsColor_Ex();
	}
}