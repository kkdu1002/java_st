package jang8;

import javax.swing.*;
import java.awt.*;

public class RadioButton_Ex extends JFrame
{
	Container contentPane;
	RadioButton_Ex()
	{
		setTitle("라디오 버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		ImageIcon cherryIcon = new ImageIcon("src/images/cherry.jpg");
		ImageIcon selectedCherry = new ImageIcon("src/images/selectedCherry.jpg");

		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배",true);
		JRadioButton cherry = new JRadioButton("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherry);
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new RadioButton_Ex();
	}
}