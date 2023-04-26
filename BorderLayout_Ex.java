package jang8;

import javax.swing.*;
import java.awt.*;

public class BorderLayout_Ex extends JFrame
{
	BorderLayout_Ex()
	{
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		배치관리자 설정
		setLayout(new BorderLayout(0,0)); //JFrame의 디폴트값
//		프레임에 붙이기
//		add(Component comp , int index)
//		=add(int index , Component comp)
//		comp : 컨테이너에 삽입된 컴포넌트
//		index : 컴포넌트의 위치, 동서남북
		
		add(new JButton("add"),"North");
		add("South",new JButton("sub"));
		JButton jbt3 = new JButton("mul");
		add(jbt3,BorderLayout.EAST);
		add(BorderLayout.CENTER,new JButton("Calculate"));
		add(new JButton("div"),BorderLayout.WEST);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
			new BorderLayout_Ex();
	}
}