package jang8;

import javax.swing.*;
import java.awt.*;

public class ComboBox_Ex extends JFrame
{
	Container contentPane;
	String fruits [] = {"apple","banana","kiwi","mango","pear"
			,"peach", "berry","strawberry","blackberry"};
	String name [] = {"kitae","jaemoon","hyosoo","namyun"};
	ComboBox_Ex()
	{
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(fruits);
		contentPane.add(strCombo);
		
		JComboBox nameCombo = new JComboBox();
		for(int i = 0; i < name.length; i++)
			nameCombo.addItem(name[i]);
		contentPane.add(nameCombo);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ComboBox_Ex();
	}
}