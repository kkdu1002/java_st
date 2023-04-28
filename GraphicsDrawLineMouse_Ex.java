package jang8;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GraphicsDrawLineMouse_Ex extends JFrame
{
	Container contentPane;
	GraphicsDrawLineMouse_Ex()
	{
		setTitle("Drawing Line by mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel,BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		Vector<Point> vs = new Vector<Point>();
		Vector<Point> ve = new Vector<Point>();
		
		Point startP = null;
		Point endP = null;
		
		public MyPanel()
		{
			// Mouse 리스너 등록
			// 리스너는 마우스 버튼이 눌러지면 마우스 포인터(시작점)을 vStart 벡터에 저장ㅈ하고
			// 마우스 버튼이 놓여지면 마우스포인터(끝점)을 vEnd 벡터에 기억
			addMouseListener(new MouseAdapter()
			{
				public void mousePressed(MouseEvent e)
				{
					startP = e.getPoint();
					vs.add(startP);
				}
				public void mouseReleased(MouseEvent e)
				{
					endP = e.getPoint();
					ve.add(endP);
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i = 0; i < vs.size(); i++)
			{
				Point s = vs.elementAt(i);
				Point e = ve.elementAt(i);
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
	public static void main(String[] args) 
	{
		new GraphicsDrawLineMouse_Ex();
	}
}