package jang8;

import javax.swing.*;
import java.awt.*;

public class Color_homework extends JFrame
{
	Container contentPane;
	JLabel [] label = new JLabel [16];
	String x [] = new String [16];
	Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
	                       Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
	                       Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
	                       Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA  };
	Color_homework()
	{
		setTitle("Graphics Color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(4,4));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Color_homework();
	}
}