package jang8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class List_Ex extends JFrame
{
	Container contentPane;
	String fruits [] = {"apple","banana","kiwi","mango","pear"
						,"peach", "berry","strawberry","blackberry"};
	ImageIcon images [] = {new ImageIcon("../23-04-27_java/src/images/icon1.png"),
			new ImageIcon("../23-04-27_java/src/images/icon2.png"),
			new ImageIcon("../23-04-27_java/src/images/icon3.png"),
			new ImageIcon("../23-04-27_java/src/images/icon4.png")};
	List_Ex()
	{
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JList strList = new JList(fruits);
		contentPane.add(strList);
		strList.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				System.out.println("�ε��� : " + strList.getSelectedIndex());
				System.out.println("�� : " + strList.getSelectedValue());
			}
		});
		
		JList imageList = new JList();
		imageList.setListData(images);
		contentPane.add(imageList);
		imageList.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				System.out.println("�ε��� : " + imageList.getSelectedIndex());
				System.out.println("�� : " + imageList.getSelectedValue());
//				System.out.println("�� : " + images[imageList.getSelectedIndex()]);
			}
		});
		
		JList scrollList = new JList(fruits);
		contentPane.add(new JScrollPane(scrollList));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new List_Ex();
	}
}