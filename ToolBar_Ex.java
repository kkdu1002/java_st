package jang9;

import javax.swing.*;
import java.awt.*;

public class ToolBar_Ex extends JFrame
{
	Container contentPane;
	ToolBar_Ex()
	{
		setTitle("툴바 만들기 예제");
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
		toolBar.setFloatable(false); // 고정상태
		
		ToolTipManager m = ToolTipManager.sharedInstance();
//		지연시간 초기값 , on 상태 지연시간
		m.setEnabled(true);
		m.setInitialDelay(100); // 초기 지연시간
		m.setDismissDelay(5000); // on상태 지연시간
		
		JButton jb = new JButton("New");
		jb.setToolTipText("파일을 생성합니다.");
		toolBar.add(jb);
//		toolBar.add(new JButton("New"));
		JButton open = new JButton(new ImageIcon("src/images/open.jpg"));
		open.setToolTipText("파일을 엽니다.");
		toolBar.add(open);
//		toolBar.add(new JButton(new ImageIcon("src/images/open.jpg")));
		
		toolBar.addSeparator();

		JButton save = new JButton(new ImageIcon("src/images/save.jpg"));
		save.setToolTipText("파일을 저장합니다.");
		toolBar.add(save);
//		toolBar.add(new JButton(new ImageIcon("src/images/save.jpg")));
		
		JTextField feild = new JTextField("text field");
		feild.setToolTipText("찾고자 하는 문자열을 입력하세요.");
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
