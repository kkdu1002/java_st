package jang8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxAction_Ex2 extends JFrame
{
	Container contentPane;
	String fruits [] = {"apple","banana","kiwi","mango"};
	ImageIcon image [] = {new ImageIcon("../23-04-27_java/src/images/apple.jpg"),
						new ImageIcon("../23-04-27_java/src/images/banana.jpg"),
						new ImageIcon("../23-04-27_java/src/images/kiwi.jpg"),
						new ImageIcon("../23-04-27_java/src/images/mango.jpg")};
	JLabel imgLabel = new JLabel(image[0]);
	ComboBoxAction_Ex2()
	{
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(fruits);
		strCombo.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JComboBox cb = (JComboBox)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(image[index]);
			}
		});
		contentPane.add(strCombo);
		contentPane.add(imgLabel);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ComboBoxAction_Ex2();
	}
}