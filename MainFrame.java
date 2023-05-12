package mini_project;

import javax.swing.*;
/*
	������� , ������������� ��ü : ��������Է� �� ��ü�� ���������ȸ ��
	��ü�� �Ӽ����� ���´�.
	
	MainFrame()
	- ��������Է� �ǰ� ���������ȸ �ǰ�ü�� �����ϰ� �����ӿ� �߰��Ѵ�.
	- ���� �����ϱ� ����JTabbed
 */
public class MainFrame extends JFrame
{
	private JTabbedPane tp;
	private AddPane ap;
	private FindPane fp;
	private TotalPane tpa;
	
	public MainFrame() 
	{
		//�����ӿ� �߰��� ������Ʈ �ʱ�ȭ
		tp = new JTabbedPane();
		ap = new AddPane();	// ��������Է�
		fp = new FindPane(); // ���������ȸ
		tpa = new TotalPane(); // �����ü����
		
		// �� �߰�
		tp.addTab("��������Է�", ap);
		tp.addTab("���������ȸ", fp);
		tp.addTab("�����ü����", tpa);
		
		//TabbedPane�� �����ӿ� �߰�
		getContentPane().add(tp);
		setTitle("�������ȭ��");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} // ������ ��
	public static void main(String[] args)
	{
		MainFrame mainF = new MainFrame();
		mainF.setSize(500,500);
	}
}
