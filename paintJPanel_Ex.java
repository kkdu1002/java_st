package jang8;

import javax.swing.*;
import java.awt.*;

public class paintJPanel_Ex extends JFrame
{
	Container contentPane;
	paintJPanel_Ex()
	{
		setTitle("JPanel paintComponent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel , BorderLayout.CENTER);
		setSize(350,300);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.fillRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.drawRect(90, 90, 50, 50);
			
			g.setColor(Color.RED);
			g.drawString("자바는 재밌다~",50,170);
			g.drawString("얼마나? 하늘만큼 땅만큼!",80,200); 
		}
	}
	public static void main(String[] args) 
	{
		new paintJPanel_Ex();
	}
}