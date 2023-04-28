package jang8;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Label_homework extends JFrame
{
	Container contentPane;
	String Money []= {"오만원","만원","천원","500원","100원","50원","10원","1원"};
	int money []= {50000,10000,1000,500,100,50,10,1};
	int count_money [] = new int [money.length];
	JTextField S_count_money [] =  new JTextField [Money.length];
	
	Label_homework()
	{
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(null); // 레이아웃 사용자가 마음대로 설정
		contentPane.setBackground(Color.YELLOW);
		
		JLabel label = (new JLabel("금액"));
		label.setSize(50, 20);
		label.setLocation(20,20);
		add(label);
	    
		JTextField jtf = new JTextField();
	    jtf.setSize(80, 20);
	    jtf.setLocation(80,20);
		add(jtf);
	    
		JButton jbt = new JButton("계산");
	    jbt.setSize(100, 20);
	    jbt.setLocation(180,20);
	    add(jbt);
	    
	    jbt.addActionListener(new ActionListener() {
	     @Override
	    public void actionPerformed(ActionEvent e) {
	    int input_money = Integer.parseInt(jtf.getText());
	    for(int i = 0; i < money.length; i++)
		{
			count_money[i] = input_money / money[i] ;
			input_money = input_money - (count_money[i] * money[i]);
			S_count_money[i].setText(Integer.toString(count_money[i]));
		}
	    }});
	    for(int i = 0; i < Money.length; i++)
		{
	    	JLabel p = new JLabel((Money[i]));
	    	p.setSize(50, 20);
	    	p.setLocation(30, 50 + i * 20);
			add(p);
				
			S_count_money[i] = new JTextField(30);
			S_count_money[i].setSize(60,20);
			S_count_money[i].setLocation(90, 50 + i * 20);
		    add(S_count_money[i]);
		}
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{	
		new Label_homework();
	}
}