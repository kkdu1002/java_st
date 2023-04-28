package jang8;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliderChange_Ex extends JFrame
{
	Container contentPane;
	JLabel colorLabel;
	JSlider [] sl = new JSlider [3];
	SliderChange_Ex()
	{
		setTitle("�����̴��� ChangeEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		colorLabel = new JLabel("	SLIDER EXAMPLE	");
		for(int i = 0; i < sl.length; i++)
		{
			sl[i] = new JSlider(JSlider.HORIZONTAL,0,255,128);
			sl[i].setPaintLabels(true); //��ġ(label)�� ���̵���
			sl[i].setPaintTicks(true);	//����(Tick)�� ���̵���
			sl[i].setPaintTrack(true);	// �⺻ true ���� // track == ����
			sl[i].setMajorTickSpacing(50);	// ū���� ������ 50px
			sl[i].setMinorTickSpacing(10);	// ���� ���� ���� 10px
			sl[i].addChangeListener(new MyChangeListener());
			contentPane.add(sl[i]);
		}
		sl[0].setForeground(Color.RED);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(sl[0].getValue(),
				sl[1].getValue(),sl[2].getValue()));
		contentPane.add(colorLabel);
		setSize(300,300);
		setVisible(true);
	}
	class MyChangeListener implements ChangeListener
	{
		@Override
		public void stateChanged(ChangeEvent e) 
		{
			colorLabel.setBackground(new Color(sl[0].getValue(),
				sl[1].getValue(),sl[2].getValue()));
		}
	}
	public static void main(String[] args) 
	{
		new SliderChange_Ex();
	}
}