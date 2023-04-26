package jang8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayout_Ex extends JFrame
{
	GridLayout_Ex()
	{
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(5,2);
		grid.setVgap(5);
		setLayout(grid);
		
//		���̺� ��ü ���� , ���̺��� �⺻������ ����
		JLabel jb1 = new JLabel("�̸�",JLabel.CENTER);
		JLabel jb2 = new JLabel("�й�",JLabel.CENTER);
		JLabel jb3 = new JLabel("�а�",JLabel.CENTER);
		JLabel jb4 = new JLabel("����",JLabel.CENTER);
		jb1.setOpaque(true); // �������ϰ� ����� ���ֱ�
		jb1.setBackground(Color.cyan);
		
//		�ؽ�Ʈ ��Ʈ ����
		JTextField jtf1 = new JTextField(""); 
		JTextField jtf2 = new JTextField(""); 
		JTextField jtf3 = new JTextField(""); 
		JTextField jtf4 = new JTextField(""); 
		jtf1.setBackground(Color.magenta);
		jtf2.setBackground(Color.PINK);
		jtf3.setBackground(Color.WHITE);
		jtf4.setBackground(Color.ORANGE);
		jtf1.setFont(new Font("�ü�",Font.BOLD,10));
		
		add(jb1);add(jtf1);
		add(jb2);add(jtf2);
		add(jb3);add(jtf3);
		add(jb4);add(jtf4);
		
		JButton jbt1 = new JButton("Ȯ��");
		JButton jbt2 = new JButton("���");
		jbt1.setFont(new Font("�ü�",Font.BOLD,10));
		jbt2.setFont(new Font("�ü�",Font.BOLD,10));
//		�����ӿ� ��ư ���̱�
		add(jbt1);add(jbt2);
//		Ȯ�� Ŭ���� �̺�Ʈ ����
//		�ҽ� = ������Ʈ.�̺�Ʈ�����(add__Listener)(�̺�Ʈó����(){������ �޼ҵ�})
//		�̺�Ʈ ó�� : �ҽ�.���(add___Listener(ó���� : new Ŭ������(){});
		jbt1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(e);
				System.out.println("�̸� : " + jtf1.getText());
				System.out.println("�й� " + jtf2.getText());
				System.out.println("�а� : " + jtf3.getText());
				System.out.println("���� : " + jtf4.getText());
			}
		});
//		��� ������ ��� �ؽ�Ʈ ���� ����
		jbt2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("������....");
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
			}
		});
		/*
		add(new JLabel("�̸�"));
		add(new JTextField(""));
		add(new JLabel("�й�"));
		add(new JTextField(""));
		add(new JLabel("�а�"));
		add(new JTextField(""));
		add(new JLabel("����"));
		add(new JTextField(""));
		*/
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new GridLayout_Ex();
	}

}
