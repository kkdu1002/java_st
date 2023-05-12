package mini_project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
/*
	��� ���� ��ȸ�� ���� UI�� �˻� ó���� �ϴ� FindPane
	FindPane() : ������� ��ȸ �� ��ü
	- �˻��� ���� ��� ������ �Է� �ޱ����� �ؽ�Ʈ �ʵ�� �����ȸ �ٽþ��� ��ư���� ����
	actionPerformed()
	- ��ȸ��ư�� ������ �ؽ�Ʈ�ʵ��� ����� ��ġ�ϴ� DB�κ��� �о��
	- DB�� ��ȸ�� �� ����� ���
	- �ٽþ��� ��ư�� ������ �ؽ�Ʈ �ʵ��� ������ �ʱ�ȭ
 */
public class FindPane extends JPanel implements ActionListener
{
	private JPanel jp [] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb;
	private JButton rsb;
	
	String caption [] = {" �� �� : "," �� �� : "," �� å : "," �� �� : "," �� �� : "};
	
	public FindPane()
	{
		setLayout(new GridLayout(7,1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		
		int size = caption.length;
		//���̺��� ����
		for(int i = 0; i < size; i++)
		{
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i] = new JPanel();
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
			// �ؽ�Ʈ�ʵ带 �Է� �Ұ����� ���·� �����
			tf[i].setEditable(false);
			if(i == 0 || i == 1)
				// ����� �̸����� �˻��ؾ� �Է� ������ ���·� �����
				tf[i].setEditable(true);
		}
		//�����ȸ, �ٽþ��� ��ư ������ �̺�Ʈ�� ó��, �гο� ����
		jp[size] = new JPanel();
		okb = new JButton("���������ȸ");
		okb.addActionListener(this);
		rsb = new JButton("�ٽþ���");
		rsb.addActionListener(this);
		jp[size].add(okb);
		jp[size].add(rsb);
		add(jp[size]);
	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{ // �̺�Ʈ�� �߻��� ��ư�� ĸ���� ���� ���´�
		String ae_type = ae.getActionCommand();
		
		EmployeeVO evo = null; // �˻��� ��� ������ ������ VO��ü ����
		EmployeeDAO edvo = null; // DBó���� ���� DAO��ü ����
		
		if(ae_type.equals(okb.getText())) // �����ȸ ��ư�� Ŭ���Ǿ��� ���
		{
			try
			{
				// DBó���� ���� DAO��ü ����
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim();
				String sname=tf[1].getText().trim();
				
				// ����� �̸� �Է��� ��� �Է����� ���
				if(!sno.equals("") && !sname.equals(""))
				{
					int no = Integer.parseInt(sno);
					// ���,�̸����� �˻�
					evo = edvo.getEmployeeCheck(no, sname);
				}
				
				//����� �Է� ���� ���
				else if(!sno.equals("") && sname.equals(""))
				{
					int no = Integer.parseInt(sno);
					// ������� �˻�
					evo = edvo.getEmployeeNo(no);
				}
				
				//�̸��� �Է� ���� ���
				else if(sno.equals("") && !sname.equals(""))
				{
					// �̸����� �˻�
					evo = edvo.getEmployeeName(sname);
				}
			}
			catch(Exception e)
			{
				System.out.println("e = [" + e + "]");
			}
				//�ش� ����� �����Ѵٸ�
				if(evo != null)
				{	// �ؽ�Ʈ �ʵ带 �ش� ��� ������ �ʱ�ȭ
					tf[0].setText(evo.getNo() + "");
					tf[1].setText(evo.getName() + "");
					tf[2].setText(evo.getJobgrade() + "");
					tf[3].setText(evo.getDepartment() + "");
					tf[4].setText(evo.getEmail() + "");
				}
				else
				{
					JOptionPane.showMessageDialog(this, "�˻� ����");
				}
		}
		else if(ae_type.equals(rsb.getText()))
		{
			// �ٽþ��� ��ư Ŭ���Ǿ�����
			int size = caption.length;
			//�ؽ�Ʈ �ʵ� �ʱ�ȭ
			for(int i = 0; i < size; i++)
			{
				tf[i].setText("");
			}
		}
	}
}