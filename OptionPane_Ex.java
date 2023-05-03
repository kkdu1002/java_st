package jang9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OptionPane_Ex extends JFrame
{
	Container contentPane;
	OptionPane_Ex()
	{
		setTitle("�ɼ� �� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setSize(500,200);
		contentPane.add(new MyPanel(),BorderLayout.NORTH);
		setVisible(true);
	}
	class MyPanel extends Panel
	{
		JButton inputBtn = new JButton("Input Name");
		JTextField tf = new JTextField(10);
		JButton confirmBtn = new JButton("Confirm");
		JButton messageBtn = new JButton("Message");
		MyPanel()
		{
			setBackground(Color.LIGHT_GRAY);
			add(inputBtn);
			add(confirmBtn);
			add(messageBtn);
			add(tf);
			inputBtn.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
					if(name != null)
						tf.setText(name);
				}
			});
			// Ȯ�� ���̾�α� --> �ڹٽ�Ŭ��Ʈ���� Ȯ�� ��� confirm();
//			�� / �ƴϿ� 2���� ��ư�߿� ���������ʰ� ���̾� �α׸� ������ ���(CLOSED_OPTION)
//			YES_OPTION / NO_OPTION
			confirmBtn.addActionListener(new ActionListener() 
			{
//				Ȯ�� ���̾�α� ����
//				showConfirmDialog(Component parentComponent, Object message,String title,int optionType)
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					int result = JOptionPane.showConfirmDialog(null, "����� ���Դϱ�?",
							"Confirm",JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.CLOSED_OPTION)
						tf.setText("Just Closed without Selection");
					else if(result == JOptionPane.YES_OPTION)
						tf.setText("Yes");
					else
						tf.setText("No");
				}
			});
			messageBtn.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					JOptionPane.showMessageDialog(null, "�����ϼ���", "Message", JOptionPane.ERROR_MESSAGE);
				}
			});
		}
	}
	public static void main(String[] args) 
	{
		new OptionPane_Ex();
	}
}
