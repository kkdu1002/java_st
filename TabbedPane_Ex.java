package jang9;

import javax.swing.*;
import java.awt.*;

public class TabbedPane_Ex extends JFrame
{
	Container contentPane;
	TabbedPane_Ex()
	{
		setTitle("텝팬 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		JTabbedPane pane = createTabbedPane();
		contentPane.add(pane,BorderLayout.CENTER);
		setSize(250,200);
		setVisible(true);
	}
	JTabbedPane createTabbedPane()
	{
		JTabbedPane pane = new JTabbedPane(JTabbedPane.LEFT);
		pane.addTab("tab1", new JLabel(new ImageIcon("src/images/img1.jpg")));
		pane.addTab("tab", new JLabel(new ImageIcon("src/images/img2.jpg")));
		pane.addTab("tab3",new MyPanel());
		return pane;
	}
	class MyPanel extends JPanel
	{
		MyPanel()
		{
			this.setBackground(Color.YELLOW);
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.BLACK);
			g.drawString("tab3에 들어가는 JPanel입니다.", 30, 50);
		}
	}
	public static void main(String[] args) 
	{
		new TabbedPane_Ex();
	}
}