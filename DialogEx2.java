package jang9;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyModalDialog extends JDialog 
{
	JTextField tf = new JTextField(10);
	JButton okButton = new JButton("OK");
	public MyModalDialog(JFrame frame, String title) 
	{
		super(frame,title, true);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
		okButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
			}
		});
	}
	String getInput() 
	{
		if(tf.getText().length() == 0) return null;
		else return tf.getText();
	}
}

public class DialogEx2 extends JFrame {
	MyModalDialog dialog = new MyModalDialog(this,"Test Modal Dialog");
	public DialogEx2() 
	{
		super("DialogEx2 ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn  = new JButton("Show Modal Dialog");
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dialog.setVisible(true);
				// ��� ���̾�α� �̹Ƿ� setVisible() �޼ҵ�� 
				// ���̾�αװ� ���� ������ �������� �ʴ´�.
				String text = dialog.getInput();
				if(text == null) return;
				JButton btn = (JButton)e.getSource();
				btn.setText(text);
			}
		});
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new DialogEx2();
	}
}