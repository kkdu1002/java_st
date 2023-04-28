package jang8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RaidoButtonItemEvent_Ex extends JFrame
{
//	
	Container contentPane;
	JRadioButton [] radio = new JRadioButton [3];
	String [] text = {"���","��","ü��"};
	ImageIcon [] image = {new ImageIcon("../23-04-27_java/src/images/apple.jpg"),
						new ImageIcon("../23-04-27_java/src/images/pear.jpg"),
						new ImageIcon("../23-04-27_java/src/images/cherry.jpg")};
	JLabel imageLabel = new JLabel();
	RaidoButtonItemEvent_Ex()
	{
		setTitle("������ư Item Event ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i = 0; i < radio.length; i++)
		{
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			panel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		radio[2].setSelected(true);
		contentPane.add(panel,BorderLayout.NORTH);
		contentPane.add(imageLabel,BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(250,200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent e) 
		{
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if(radio[0].isSelected())
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else
				imageLabel.setIcon(image[2]);
		}
	}
	public static void main(String[] args) 
	{
		new RaidoButtonItemEvent_Ex();
	}
}