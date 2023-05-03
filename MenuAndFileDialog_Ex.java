package jang9;

import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.event.*;
import java.awt.*;

public class MenuAndFileDialog_Ex extends JFrame
{
	Container contentPane;
	JLabel imageLabel = new JLabel();
	MenuAndFileDialog_Ex()
	{
		setTitle("Menu와 JFileChooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(imageLabel);
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	void createMenu()
	{
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		openItem.addActionListener(new OpenActionListener());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	class OpenActionListener implements ActionListener
	{
		JFileChooser chooser;
		OpenActionListener()
		{
			chooser = new JFileChooser();
		}
		@Override
		public void actionPerformed(ActionEvent e) 
		{// 파일 이름에 창에 출력될 문자열 / 파일 필터로 사용되는 확장자. *.jpg , *.gif만 나열됨
			FileNameExtensionFilter filter = new FileNameExtensionFilter
					("JPG & GIF Images","jpg","gif");
//			파일 다이럴로그에 파일 필터 출력
			chooser.setFileFilter(filter);
//			파일 열기 다이얼로그 출력 / null을 주면 전체화면을 기준으로 위치 설정
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION)
			{ //APPROVE_OPTION = 0 열기버튼 누른경우 / APPROVE_OPTION = 1 취소버튼 누른경우 / APPROVE_OPTION = -1 오류발생 또는 사용자가 다이얼로그 닫음
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
//			선택한 파일의 경로명과 파일명
			String filePath = chooser.getSelectedFile().getPath();
//			파일을 로딩하여 이미지 레이블에 출력
			imageLabel.setIcon(new ImageIcon(filePath));
			pack(); // 이미지 크기 만큼 프레임 크기
		}
	}
	public static void main(String[] args)
	{
		new MenuAndFileDialog_Ex();
	}
}