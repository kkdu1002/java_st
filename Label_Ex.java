package jang8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Label_Ex extends JFrame
{
	Container contentPane;
	Label_Ex()
	{
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("����մϴ�.");
		ImageIcon beauty = new ImageIcon("src/images/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		ImageIcon normalIcon = new ImageIcon("src/images/normalIcon.gif");
		JLabel Label = new JLabel("��������� ��ȭ�ϼ���.",normalIcon,SwingConstants.CENTER);
		
		contentPane.add(textLabel);
		contentPane.add(imageLabel);
		contentPane.add(Label);
		
		setSize(400,600);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Label_Ex();
	}
}