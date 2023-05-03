package jang9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MenuActionEvent_Ex extends JFrame
{
	Container contentPane;
	JLabel label = new JLabel("Hello");
	MenuActionEvent_Ex()
	{
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label,BorderLayout.CENTER);
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	void createMenu()
	{
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItem = new JMenuItem[4];
		String itemTitle [] = {"Color","Font","Top","Bottom"};
		JMenu fileMenu = new JMenu("Text");
		for(int i = 0; i < menuItem.length; i++)
		{
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(new MenuActionListener());
			fileMenu.add(menuItem[i]);
		}
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	class MenuActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String cmd = e.getActionCommand();
			if(cmd.equals("Color"))
				label.setForeground(Color.blue);
			else if(cmd.equals("Font"))
				label.setFont(new Font("Ravie",Font.ITALIC,30));
			else if(cmd.equals("Top"))
				label.setVerticalAlignment(SwingConstants.TOP);
			else
				label.setVerticalAlignment(SwingConstants.BOTTOM);
		}
	}
	public static void main(String[] args) 
	{
		new MenuActionEvent_Ex();
	}
}
