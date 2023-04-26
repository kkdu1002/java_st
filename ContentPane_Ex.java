package jang8;
/*
	JFrame :
	스윙의 JFrame은 AWT의 Frame과 달리 좀 복잡한 구조로 되어있다. 프레임 자체로 구성괴어
	있는 것이 아니라 그 안에 4개의 페인(pane)이 층으로 구성되어 있다.
1. JRootPane : 실질적인 윈도우 기능을 수행하는 경량의 컨테이너이다.
				모든 윈도우들의 동작이나 사용방법등이 같아지고, 다른 컴포넌트들과
				잘 조화가 될 수 있도록 도와주기 때문이다.
				GlassPane과 LayeredPane으로 구성되어 있고
				LayeredPane은 JMenuBar,ContentPane을 포함한다.
1.1 GlassPane : 기본적으로 숨겨진 상태로 되어있다. 다른 패널 위에 존재하는 패널이다.
			주로 마우스 이벤트를 처리하기 위해 가장 먼저 루트페인에 추가된다 (Component)
1.2 LayeredPane : 루트 페인에 대해 레이어를 할 수 있도록 여러 층의 패널을 포함 할 수 있는
				패널로 여러 컴포넌트를 서로 오버랩(다른 컴포넌트를 붙이는 작업)할 수 있도록 한다.
				윗부분은 JMenuBar 아랫부분은 ContentPane로 이루어져 있다.
1.2.1 ContentPane : 일반적인 컴포넌트를 가질 수 있는 패널. 프레임 객체의 getContentPane()
					을 이용해서 얻을 수 있다.(메뉴를 제외한 모든 GUI 컴포넌트들을 부착하는 공간)
1.2.2 JMenuBar : 윈도우의 메뉴를 제공하는 역할로 생략이 가능하다.
					JMenu , JMenuItem등을 이용해서 메뉴를 구성하여 setJMenuBar()를
					이용해서 등록 할 수 있다.
 */
import javax.swing.*;
import java.awt.*;

public class ContentPane_Ex extends JFrame
{
//	border / flow
	ContentPane_Ex()
	{
		setTitle("ContentPane과 JFrame");
//		X를 누르면 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		컨텐트 페인 얻기
		Container contentPane = getContentPane();
//		frame에 바탕색 설정 / 적용		
		contentPane.setBackground(Color.ORANGE);
//		프레임에 직접 색을 적용했을때 바탕색 적용 X
//		setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());//왼쪽에서 오른쪽으로 배치하고 좁혀지면 아래로 흐름 , 패널
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(350,150);
		setVisible(true); // 프레임 화면 보이기 
	}
	public static void main(String[] args) 
	{
		new ContentPane_Ex();
	}
}