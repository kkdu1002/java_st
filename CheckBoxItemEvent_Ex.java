package jang8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEvent_Ex extends JFrame
{
	Container contentPane;
	JCheckBox fruits [] = new JCheckBox[3];
	String names [] = {"���","��","ü��"};
	JLabel sumLabel;
	int sum = 0;
	
	CheckBoxItemEvent_Ex()
	{
		setTitle("üũ�ڽ��� ItemEvent����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("��� 100��, �� 500�� , ü�� 20000��"));
		for(int i = 0; i < fruits.length; i++)
		{
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			contentPane.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
		}
		sumLabel = new JLabel("���� 0�� �Դϴ�.");
		contentPane.add(sumLabel);
		setSize(250,200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent e) 
		{
			int selected = 1;
			if(e.getStateChange() == ItemEvent.SELECTED)
				selected = 1;
			else
				selected = -1;
			if(e.getItem() == fruits[0])
				sum = sum + selected * 100;
			else if(e.getItem() == fruits[1])
				sum = sum + selected * 500;
			else
				sum = sum + selected * 20000;
			sumLabel.setText("����" + sum + "�� �Դϴ�.");
		}
	}
	public static void main(String[] args) 
	{
		new CheckBoxItemEvent_Ex();
	}
}