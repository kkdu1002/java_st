package jang8;

import javax.swing.*;

public class MyFrame extends JFrame
{
	MyFrame()
	{
		this.setTitle("첫번째 프레임");
		setSize(300,400); // row , col
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		MyFrame mf = new MyFrame();
	}
}