package jang8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayout_Ex extends JFrame
{
	GridLayout_Ex()
	{
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(5,2);
		grid.setVgap(5);
		setLayout(grid);
		
//		레이블 객체 생성 , 레이블은 기본적으로 투명
		JLabel jb1 = new JLabel("이름",JLabel.CENTER);
		JLabel jb2 = new JLabel("학번",JLabel.CENTER);
		JLabel jb3 = new JLabel("학과",JLabel.CENTER);
		JLabel jb4 = new JLabel("과목",JLabel.CENTER);
		jb1.setOpaque(true); // 불투명하게 만들고 색주기
		jb1.setBackground(Color.cyan);
		
//		텍스트 필트 생성
		JTextField jtf1 = new JTextField(""); 
		JTextField jtf2 = new JTextField(""); 
		JTextField jtf3 = new JTextField(""); 
		JTextField jtf4 = new JTextField(""); 
		jtf1.setBackground(Color.magenta);
		jtf2.setBackground(Color.PINK);
		jtf3.setBackground(Color.WHITE);
		jtf4.setBackground(Color.ORANGE);
		jtf1.setFont(new Font("궁서",Font.BOLD,10));
		
		add(jb1);add(jtf1);
		add(jb2);add(jtf2);
		add(jb3);add(jtf3);
		add(jb4);add(jtf4);
		
		JButton jbt1 = new JButton("확인");
		JButton jbt2 = new JButton("취소");
		jbt1.setFont(new Font("궁서",Font.BOLD,10));
		jbt2.setFont(new Font("궁서",Font.BOLD,10));
//		프레임에 버튼 붙이기
		add(jbt1);add(jbt2);
//		확인 클릭시 이벤트 적용
//		소스 = 컴포넌트.이벤트연결기(add__Listener)(이벤트처리기(){수행할 메소드})
//		이벤트 처리 : 소스.등록(add___Listener(처리기 : new 클래스명(){});
		jbt1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(e);
				System.out.println("이름 : " + jtf1.getText());
				System.out.println("학번 " + jtf2.getText());
				System.out.println("학과 : " + jtf3.getText());
				System.out.println("과목 : " + jtf4.getText());
			}
		});
//		취소 누를때 모든 텍스트 내용 제거
		jbt2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("지우자....");
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
			}
		});
		/*
		add(new JLabel("이름"));
		add(new JTextField(""));
		add(new JLabel("학번"));
		add(new JTextField(""));
		add(new JLabel("학과"));
		add(new JTextField(""));
		add(new JLabel("과목"));
		add(new JTextField(""));
		*/
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new GridLayout_Ex();
	}

}
