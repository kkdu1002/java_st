package jang8;
import javax.swing.*;

public class MyApp 
{
	public static void main(String[] args) 
	{
		JFrame f = new JFrame();
		f.setTitle("첫번째 프레임");
		f.setSize(300,300);
//		setLocation(500,300);
//		setBounds(500,300,500,500) ; 
//		pack(); //컴포넌트의 크기만큼 화면 자동조절
		f.setVisible(false);
	}
}