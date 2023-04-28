package jang8;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImage_Ex extends JFrame
{
	Container contentPane;
	GraphicsDrawImage_Ex()
	{
		setTitle("drawImage 사용 예제 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel,BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		ImageIcon imageIcon = new ImageIcon("../23-04-27_java/src/images/image0.jpg");
		Image image = imageIcon.getImage();
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setClip(100, 20, 150, 150);
			g.drawImage(image, 0 , 0 , getWidth() , getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("SanSerif",Font.ITALIC,40));
			g.drawString("Go Gato", 100, 150);
//			g.drawImage(image, 20, 20, 250, 100, 100, 50, 200, 200, this); // 자르기
//			g.drawImage(image, 20, 20, this); // this : 이미지 그리기를 완료를 통보받는 객체 원본
		}
	}
	public static void main(String[] args) 
	{
		new GraphicsDrawImage_Ex();
	}
}