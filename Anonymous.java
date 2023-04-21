package jang12;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
/*
	4. Anonymous class : 클래스의 선언과 객체의 생성을 동시에 하는 이름이 없는 클래스
	 (일회용 : 한번만 사용하고 버려지는 객체를 사용할 때 유용하게 쓰인다. Swing에서 많이 씀)
 */
import javax.swing.JFrame;
public class Anonymous extends JFrame
{
	public static void main(String[] args) 
	{
//		객체 프레임 생성
		Anonymous t = new Anonymous();
		//프라임 제목
		t.setTitle("익명내부클래스 연습...");
		//버튼 객체 생성
		JButton btn = new JButton("버튼을 눌러주세요.");
		//프레임에 버튼 붙이기
		t.add(btn);
		//프레임 크기 설정
		t.setSize(500,300);
		t.setLocation(100,100);
		t.setVisible(true);
		// 1인치 -> 2.54cm
		// 이벤트 발생 버튼을 클릭했을시 이벤트 처할 처리기(이벤트 헨들러)연결
		// 이벤트 발생시킬 소스 , 이벤트 연결(이벤트 처리기);
		btn.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						System.out.println(e);
						//이벤트를 발생한 버튼에 있는 글자를 대입
						String select = e.getActionCommand(); //버튼 글자 가져오기
						if(select.equals("버튼을 눌러주세요."))
						{
							System.out.println(select+"...");
							// 시스템 종료 == 프로그램 종료 0 또는 다른 정수
							// 아무거나 보통 0을 많이 사용함
							System.exit(0);
						}
					}
				});
		t.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				System.out.print("닫을 까요?");
				System.exit(0);
			}
		});

		/*
		t.addWindowListener(new WindowListener() 
		{
			
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) 
			{
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) 
			{
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) 
			{
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) 
			{
				System.out.print("닫을까요");
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) 
			{
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) 
			{
				
			}
		});*/
		// 인스턴스 클래스 --> 필드 , 메소드
		// 정적 클래스 --> 필드 ,메소드 , static필드 , static메소드
		// 좋은 프로그램의 조건
//			응집도	:	모듈 내부에 존재하는 구성요소들 사이의 밀접한 정도를 나타낸다.(응집도 ↑)
//			결합도	:	모듈이 실행되는 동안 다른 모듈과 정보교환을 통해 연결되는 정도(결합도 ↓)
	}
}