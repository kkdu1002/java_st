package jang8;

import javax.swing.*;
import java.awt.*;

public class BorderLayout_Ex extends JFrame
{
	BorderLayout_Ex()
	{
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		��ġ������ ����
		setLayout(new BorderLayout(0,0)); //JFrame�� ����Ʈ��
//		�����ӿ� ���̱�
//		add(Component comp , int index)
//		=add(int index , Component comp)
//		comp : �����̳ʿ� ���Ե� ������Ʈ
//		index : ������Ʈ�� ��ġ, ��������
		
		add(new JButton("add"),"North");
		add("South",new JButton("sub"));
		JButton jbt3 = new JButton("mul");
		add(jbt3,BorderLayout.EAST);
		add(BorderLayout.CENTER,new JButton("Calculate"));
		add(new JButton("div"),BorderLayout.WEST);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
			new BorderLayout_Ex();
	}
}