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
		setTitle("Menu�� JFileChooser Ȱ�� ����");
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
		{// ���� �̸��� â�� ��µ� ���ڿ� / ���� ���ͷ� ���Ǵ� Ȯ����. *.jpg , *.gif�� ������
			FileNameExtensionFilter filter = new FileNameExtensionFilter
					("JPG & GIF Images","jpg","gif");
//			���� ���̷��α׿� ���� ���� ���
			chooser.setFileFilter(filter);
//			���� ���� ���̾�α� ��� / null�� �ָ� ��üȭ���� �������� ��ġ ����
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION)
			{ //APPROVE_OPTION = 0 �����ư ������� / APPROVE_OPTION = 1 ��ҹ�ư ������� / APPROVE_OPTION = -1 �����߻� �Ǵ� ����ڰ� ���̾�α� ����
				JOptionPane.showMessageDialog(null, "������ �������� �ʾҽ��ϴ�.", "���", JOptionPane.WARNING_MESSAGE);
				return;
			}
//			������ ������ ��θ�� ���ϸ�
			String filePath = chooser.getSelectedFile().getPath();
//			������ �ε��Ͽ� �̹��� ���̺� ���
			imageLabel.setIcon(new ImageIcon(filePath));
			pack(); // �̹��� ũ�� ��ŭ ������ ũ��
		}
	}
	public static void main(String[] args)
	{
		new MenuAndFileDialog_Ex();
	}
}