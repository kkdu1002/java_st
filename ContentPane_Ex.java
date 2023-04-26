package jang8;
/*
	JFrame :
	������ JFrame�� AWT�� Frame�� �޸� �� ������ ������ �Ǿ��ִ�. ������ ��ü�� ��������
	�ִ� ���� �ƴ϶� �� �ȿ� 4���� ����(pane)�� ������ �����Ǿ� �ִ�.
1. JRootPane : �������� ������ ����� �����ϴ� �淮�� �����̳��̴�.
				��� ��������� �����̳� ��������� ��������, �ٸ� ������Ʈ���
				�� ��ȭ�� �� �� �ֵ��� �����ֱ� �����̴�.
				GlassPane�� LayeredPane���� �����Ǿ� �ְ�
				LayeredPane�� JMenuBar,ContentPane�� �����Ѵ�.
1.1 GlassPane : �⺻������ ������ ���·� �Ǿ��ִ�. �ٸ� �г� ���� �����ϴ� �г��̴�.
			�ַ� ���콺 �̺�Ʈ�� ó���ϱ� ���� ���� ���� ��Ʈ���ο� �߰��ȴ� (Component)
1.2 LayeredPane : ��Ʈ ���ο� ���� ���̾ �� �� �ֵ��� ���� ���� �г��� ���� �� �� �ִ�
				�гη� ���� ������Ʈ�� ���� ������(�ٸ� ������Ʈ�� ���̴� �۾�)�� �� �ֵ��� �Ѵ�.
				���κ��� JMenuBar �Ʒ��κ��� ContentPane�� �̷���� �ִ�.
1.2.1 ContentPane : �Ϲ����� ������Ʈ�� ���� �� �ִ� �г�. ������ ��ü�� getContentPane()
					�� �̿��ؼ� ���� �� �ִ�.(�޴��� ������ ��� GUI ������Ʈ���� �����ϴ� ����)
1.2.2 JMenuBar : �������� �޴��� �����ϴ� ���ҷ� ������ �����ϴ�.
					JMenu , JMenuItem���� �̿��ؼ� �޴��� �����Ͽ� setJMenuBar()��
					�̿��ؼ� ��� �� �� �ִ�.
 */
import javax.swing.*;
import java.awt.*;

public class ContentPane_Ex extends JFrame
{
//	border / flow
	ContentPane_Ex()
	{
		setTitle("ContentPane�� JFrame");
//		X�� ������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		����Ʈ ���� ���
		Container contentPane = getContentPane();
//		frame�� ������ ���� / ����		
		contentPane.setBackground(Color.ORANGE);
//		�����ӿ� ���� ���� ���������� ������ ���� X
//		setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());//���ʿ��� ���������� ��ġ�ϰ� �������� �Ʒ��� �帧 , �г�
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(350,150);
		setVisible(true); // ������ ȭ�� ���̱� 
	}
	public static void main(String[] args) 
	{
		new ContentPane_Ex();
	}
}