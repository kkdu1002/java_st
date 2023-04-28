package jang8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextArea_Ex extends JFrame
{
	Container contentPane;
	TextArea_Ex()
	{
		setTitle("�ؽ�Ʈ ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new MyCenterPanel(),BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
	}
	class MyCenterPanel extends JPanel
	{
		JTextField tf;
		JButton btn;
		JButton btn2;
		JTextArea ta;
		MyCenterPanel()
		{
			tf = new JTextField(20);
			btn = new JButton("�߰�");
			btn2 = new JButton("�����");
			btn.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					ta.append(tf.getText() + "\n");
				}
			});
			btn2.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					tf.setText("");
					ta.setText("");
				}	
			});
			ta = new JTextArea("hello",7,20);
			add(new JLabel("�Ʒ� â�� ���ڿ��� �Է��ϰ� ��ư�� Ŭ���ϼ���"));
			add(tf);
			add(btn);
			add(btn2);
			add(new JScrollPane(ta));
		}	
	}
	public static void main(String[] args) 
	{
		new TextArea_Ex();
	}
}