package jang12;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
/*
	4. Anonymous class : Ŭ������ ����� ��ü�� ������ ���ÿ� �ϴ� �̸��� ���� Ŭ����
	 (��ȸ�� : �ѹ��� ����ϰ� �������� ��ü�� ����� �� �����ϰ� ���δ�. Swing���� ���� ��)
 */
import javax.swing.JFrame;
public class Anonymous extends JFrame
{
	public static void main(String[] args) 
	{
//		��ü ������ ����
		Anonymous t = new Anonymous();
		//������ ����
		t.setTitle("�͸���Ŭ���� ����...");
		//��ư ��ü ����
		JButton btn = new JButton("��ư�� �����ּ���.");
		//�����ӿ� ��ư ���̱�
		t.add(btn);
		//������ ũ�� ����
		t.setSize(500,300);
		t.setLocation(100,100);
		t.setVisible(true);
		// 1��ġ -> 2.54cm
		// �̺�Ʈ �߻� ��ư�� Ŭ�������� �̺�Ʈ ó�� ó����(�̺�Ʈ ��鷯)����
		// �̺�Ʈ �߻���ų �ҽ� , �̺�Ʈ ����(�̺�Ʈ ó����);
		btn.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						System.out.println(e);
						//�̺�Ʈ�� �߻��� ��ư�� �ִ� ���ڸ� ����
						String select = e.getActionCommand(); //��ư ���� ��������
						if(select.equals("��ư�� �����ּ���."))
						{
							System.out.println(select+"...");
							// �ý��� ���� == ���α׷� ���� 0 �Ǵ� �ٸ� ����
							// �ƹ��ų� ���� 0�� ���� �����
							System.exit(0);
						}
					}
				});
		t.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				System.out.print("���� ���?");
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
				System.out.print("�������");
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
		// �ν��Ͻ� Ŭ���� --> �ʵ� , �޼ҵ�
		// ���� Ŭ���� --> �ʵ� ,�޼ҵ� , static�ʵ� , static�޼ҵ�
		// ���� ���α׷��� ����
//			������	:	��� ���ο� �����ϴ� ������ҵ� ������ ������ ������ ��Ÿ����.(������ ��)
//			���յ�	:	����� ����Ǵ� ���� �ٸ� ���� ������ȯ�� ���� ����Ǵ� ����(���յ� ��)
	}
}