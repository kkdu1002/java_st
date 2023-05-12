package mini_project;

import javax.swing.*;
/*
	사원정보 , 사원관리프레임 객체 : 사원정보입력 탭 객체와 사원정보조회 탭
	객체를 속성으로 갖는다.
	
	MainFrame()
	- 사원정보입력 탭과 사원정보조회 탭객체를 생성하고 프레임에 추가한다.
	- 탭을 구현하기 위해JTabbed
 */
public class MainFrame extends JFrame
{
	private JTabbedPane tp;
	private AddPane ap;
	private FindPane fp;
	private TotalPane tpa;
	
	public MainFrame() 
	{
		//프레임에 추가될 컴포넌트 초기화
		tp = new JTabbedPane();
		ap = new AddPane();	// 사원정보입력
		fp = new FindPane(); // 사원정보조회
		tpa = new TotalPane(); // 사원전체보기
		
		// 탭 추가
		tp.addTab("사원정보입력", ap);
		tp.addTab("사원정보조회", fp);
		tp.addTab("사원전체보기", tpa);
		
		//TabbedPane을 프레임에 추가
		getContentPane().add(tp);
		setTitle("사원관리화면");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} // 생성자 끝
	public static void main(String[] args)
	{
		MainFrame mainF = new MainFrame();
		mainF.setSize(500,500);
	}
}
