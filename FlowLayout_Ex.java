package jang8;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_Ex extends JFrame
{
	FlowLayout_Ex()
	{
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contantPane = getContentPane();
		contantPane.setBackground(Color.YELLOW);
//								���� �ƿ� ���ʺ��� ,30px , 20px ���� ����
		setLayout(new FlowLayout(FlowLayout.LEFT,30,20));
		JButton jbt = new JButton("add");
//							�۲� , �Ӽ� , ũ��
		jbt.setFont(new Font("�ü�",Font.BOLD,70));
		jbt.setForeground(Color.BLUE); // ���ڻ�
		jbt.setBackground(new Color(100,255,0)); // ������
		add(jbt);
		add(new Button("sub"));
		add(new Button("mul"));
		add(new Button("div"));
		add(new Button("Calculate"));
		
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String[] args) 
	{	
		new FlowLayout_Ex();
	}
}