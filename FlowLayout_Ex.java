package jang8;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_Ex extends JFrame
{
	FlowLayout_Ex()
	{
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contantPane = getContentPane();
		contantPane.setBackground(Color.YELLOW);
//								레이 아웃 왼쪽부터 ,30px , 20px 에서 시작
		setLayout(new FlowLayout(FlowLayout.LEFT,30,20));
		JButton jbt = new JButton("add");
//							글꼴 , 속성 , 크기
		jbt.setFont(new Font("궁서",Font.BOLD,70));
		jbt.setForeground(Color.BLUE); // 문자색
		jbt.setBackground(new Color(100,255,0)); // 바탕색
		add(jbt);
		add(new Button("sub"));
		add(new Button("mul"));
		add(new Button("div"));
		add(new Button("Calculate"));
		
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String[] args) 
	{	
		new FlowLayout_Ex();
	}
}