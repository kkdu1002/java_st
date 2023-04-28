package jang8;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Label_homework2 extends JFrame
{
	Container contentPane;
	Label_homework2()
	{
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		String Money []= {"오만원","만원","천원","500원","100원","50원","10원","1원"};
		int money []= {50000,10000,1000,500,100,50,10,1};
		JTextField input_money;
		int count_money [] = new int [money.length];
		JTextField S_count_money [] = new JTextField [Money.length];
		
		public MyPanel()
		{
			setBackground(new Color(255,255,200));
			setLayout(null);
	
			JLabel label = (new JLabel("금액"));
			label.setSize(50, 20);
			label.setLocation(20,20);
			add(label);
		    
			input_money = new JTextField(30);
			input_money.setSize(100, 20);
			input_money.setLocation(100,20);
			add(input_money);
		    
			JButton jbt = new JButton("계산");
		    jbt.setSize(70, 20);
		    jbt.setLocation(210,20);
		    add(jbt);
			
		    for(int i = 0; i < 8; i++)
			{
		    	label = new JLabel(Money[i]);

		    	label.setSize(50, 20);
		    	label.setLocation(50, 50 + i * 20);
		    	add(label);	
		    	
		    	S_count_money[i] = new JTextField(30);
		    	S_count_money[i].setSize(70,20);
		    	S_count_money[i].setLocation(120, 50 + i * 20);
		    	add(S_count_money[i]);
			}
		    
		    jbt.addActionListener(new ActionListener() {
		     @Override
		    public void actionPerformed(ActionEvent e) {
		    int input_money1 = Integer.parseInt(input_money.getText());
		    for(int i = 0; i < money.length; i++)
			{
				count_money[i] = input_money1 / money[i] ;
				S_count_money[i].setText(Integer.toString(count_money[i]));
				input_money1 = input_money1 - (count_money[i] * money[i]);
		        System.out.println(count_money[i] + " " + input_money1);
			}
		    }});
		}
	}
	public static void main(String[] args) 
	{	
		new Label_homework2();
	}
}