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
		setTitle("Drawing Line by mouse ����");
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
			// Mouse ������ ���
			// �����ʴ� ���콺 ��ư�� �������� ���콺 ������(������)�� vStart ���Ϳ� ���夸�ϰ�
			// ���콺 ��ư�� �������� ���콺������(����)�� vEnd ���Ϳ� ���
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