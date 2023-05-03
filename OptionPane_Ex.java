package jang9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OptionPane_Ex extends JFrame
{
	Container contentPane;
	OptionPane_Ex()
	{
		setTitle("옵션 팬 예제");
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
					String name = JOptionPane.showInputDialog("이름을 입력하세요.");
					if(name != null)
						tf.setText(name);
				}
			});
			// 확인 다이얼로그 --> 자바스클립트에서 확인 취소 confirm();
//			예 / 아니오 2개의 버튼중에 선택하지않고 다이얼 로그를 종료할 경우(CLOSED_OPTION)
//			YES_OPTION / NO_OPTION
			confirmBtn.addActionListener(new ActionListener() 
			{
//				확인 다이얼로그 생성
//				showConfirmDialog(Component parentComponent, Object message,String title,int optionType)
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					int result = JOptionPane.showConfirmDialog(null, "계속할 것입니까?",
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
					JOptionPane.showMessageDialog(null, "조심하세요", "Message", JOptionPane.ERROR_MESSAGE);
				}
			});
		}
	}
	public static void main(String[] args) 
	{
		new OptionPane_Ex();
	}
}
