package jang8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonImage_Ex extends JFrame
{
	Container contentPane;
	ButtonImage_Ex()
	{
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("src/images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("src/images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("src/images/pressedIcon.gif");
//		checkbox
		ImageIcon cherryIcon = new ImageIcon("src/images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("src/images/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��",true);
		JCheckBox cherry = new JCheckBox("ü��",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);
		
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ButtonImage_Ex();
	}
}