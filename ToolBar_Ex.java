package jang9;

import javax.swing.*;
import java.awt.*;

public class ToolBar_Ex extends JFrame
{
	Container contentPane;
	ToolBar_Ex()
	{
		setTitle("���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400,300);
		setVisible(true);
	}
	void createToolBar()
	{
		JToolBar toolBar = new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.setFloatable(false); // ��������
		
		ToolTipManager m = ToolTipManager.sharedInstance();
//		�����ð� �ʱⰪ , on ���� �����ð�
		m.setEnabled(true);
		m.setInitialDelay(100); // �ʱ� �����ð�
		m.setDismissDelay(5000); // on���� �����ð�
		
		JButton jb = new JButton("New");
		jb.setToolTipText("������ �����մϴ�.");
		toolBar.add(jb);
//		toolBar.add(new JButton("New"));
		JButton open = new JButton(new ImageIcon("src/images/open.jpg"));
		open.setToolTipText("������ ���ϴ�.");
		toolBar.add(open);
//		toolBar.add(new JButton(new ImageIcon("src/images/open.jpg")));
		
		toolBar.addSeparator();

		JButton save = new JButton(new ImageIcon("src/images/save.jpg"));
		save.setToolTipText("������ �����մϴ�.");
		toolBar.add(save);
//		toolBar.add(new JButton(new ImageIcon("src/images/save.jpg")));
		
		JTextField feild = new JTextField("text field");
		feild.setToolTipText("ã���� �ϴ� ���ڿ��� �Է��ϼ���.");
		toolBar.add(feild);
//		toolBar.add(new JTextField("text field"));
		JComboBox combo = new JComboBox();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		contentPane.add(toolBar,BorderLayout.NORTH);
	}
	public static void main(String[] args) 
	{
		new ToolBar_Ex();
	}
}
