package jang9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyDialog extends JDialog
{
	JTextField tf = new JTextField(10);
	JButton okButton = new JButton("OK");
	public MyDialog(JFrame frame,String title)
	{
		super(frame,title);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200,100);
		okButton.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
			}
		});
	}
}

public class Dialog_Ex extends JFrame
{
	MyDialog dialog = new MyDialog(this,"Test Dialog");
	public Dialog_Ex()
	{
		super("Dialog_Ex 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Dialog");
		btn.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				dialog.setVisible(true);
			}
		});
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Dialog_Ex();
	}
}