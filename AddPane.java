package mini_project;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

/*
	ȭ�� ���̾ƿ�
	- ����ڷκ��� �Է��� �ްų� ó���� ����� �����ֱ� ���� ���ø����̼��� ���������̼� ����� �����Ѵ�.
	- ����ڰ� ���� ����� �� �ֵ��� UI(User Interface)������Ʈ�� �迭�ϰ�, navigation��å�� �����
	
	AddOane() : ��� ���� �Է� �� ��ü
	- ������ �Է� �ޱ� ���� �ؽ�Ʈ �ʵ� �迭, �����ϱ� ��ư , �ٽþ��� ��ư���� �����ȴ�
	
	actionPerformed() :
	- �����ϱ� ��ư : ������ �ؽ�Ʈ �ʵ��� ������ ����ſ� ����
	- �ٽþ��� ��ư : ������ �ؽ���Ʈ �ʵ��� ������ �ʱ�ȭ
 */
public class AddPane extends JPanel implements ActionListener , ItemListener
{
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb; // ����
	private JButton rsb; // �ٽþ���
	private int department = 10;
	// �Է¹��� �׸��� ����
	String caption [] = {" �̸� : "," �� å : "," �� �� : "," �� �� : "};
	AddPane()
	{
		setLayout(new GridLayout(6,1));
		EtchedBorder eb = new EtchedBorder(); // ���鿡 ȿ�� �ֱ�
		//  �ش� ���۳�Ʈ�� ��踦 ����
		setBorder(eb);
		
		// �Է� ���� �׸��� ����
		int size = caption.length;
		System.out.println(size);
		
		//�ؽ�Ʈ �ʵ�� ���̺��� �гο� ��� AddPane�� ���δ�
		int i,j = 1;
		for(i = 0; i < size - 1; i++)
		{
			j++;
			System.out.print(i + " ");
			System.out.print(caption[i]);
			
			jp[i] = new JPanel();
			jp[i].setBackground(new Color(j * 60 , j * 50 , j * 30));
			jl[i] = new JLabel(caption[i]); // �Է¹��� ������ ���� ���̺�
			tf[i] = new JTextField(15); // ��� ���� �Է��� ���� �ؽ�Ʈ �ʵ�
			
			jp[i].add(jl[i]); // �гο� ���̺� ���̱�
			jp[i].add(tf[i]); // �гο� �ؽ�Ʈ �ʵ� ���̱�
			
			System.out.println(this + ".....");
			setBackground(Color.YELLOW);
			add(jp[i]); // �г� ���̱�
		}
	
	
	// ȭ���� �̷��ϰ� ����� ���� ������ Ȯ���ϱ� ���� �г� �߰� / ������ 4��° �г�
	System.out.println("\n������ �г� " + i);
	jp[i] = new JPanel();
	jp[i].setBackground(Color.CYAN);
	jl[i] = new JLabel(caption[i]);
	jp[i].add(jl[i]); // ȭ�� ���� Ȯ��
	add(jp[i]);
	
	// �μ� ������ ���� �޺��ڽ� ����
	JComboBox combo = new JComboBox();
	combo.addItem("�μ���ȣ�� �����ϼ���.");
	
	// 10 ~ 50������ �μ���ȣ�� �޺��ڽ� �׸����� �߰�
	for(int c = 1; c <= 5; c++)
		combo.addItem(c * 10);
	System.out.println("\n�޺��� �г���ġ : " + i);
	jp[i].add(combo); // �޺��ڽ��� �гο� �߰�
//	combo.addActionListener(this); //�޺��ڽ� �̺�Ʈ ó��
	combo.addItemListener(this);
	
	jp[size] = new JPanel(); // �г� �迭�� ������ ���� ���� 5��° �г�
//	��ư���� / �̺�Ʈ ó��
	okb = new JButton("�����ϱ�");
	okb.addActionListener(this);
	rsb = new JButton("�ٽþ���");
	rsb.addActionListener(this);
	jp[size].setBackground(Color.PINK);
	
	// �гο� ��ư �߰�
	jp[size].add(okb); // size �Է� ���� �׸��� ������ ����
	jp[size].add(rsb);
	add(jp[size]); // ��ư�� ������ �г��� AppPane�� �߰�
	}
	// ��ư�� ���� �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		String ae_type = ae.getActionCommand();
		EmployeeVO evo = new EmployeeVO();
		EmployeeDAO edvo = null;
		
		if(ae_type.equals(okb.getText()))
		{
			//�����ϱ� ��ư�� Ŭ���Ǿ��� ���
			try
			{
				evo = new EmployeeVO(0, tf[0].getText(), tf[1].getText() , department , tf[2].getText());
				//�Է¹��� ��� ������ DB�� �߰��ϱ� ���� DAO��ü ����
				edvo = new EmployeeDAO();
				
				// DB�� �߰��ϱ� ���� �޼ҵ� ȣ��
				evo = edvo.getEmployeeregiste(evo);
			}
			catch(Exception e)
			{
				System.out.println("���� �����ư Ŭ���� e= [" + e + "]");
			}
			if(edvo != null)
				JOptionPane.showMessageDialog(this, tf[0].getText() + "���� ���������� �߰���");
		}
		else if(ae_type.equals(rsb.getText()))
		{
			// �ٽþ��� ��ư�� Ŭ���Ǿ��� ���
			int size = caption.length;
			
			// �ؽ�Ʈ �ʵ� �ʱ�ȭ
			for(int i = 0; i < size - 1; i++)
			{
				tf[i].setText("");
			}
		}
		System.out.println(evo.toString());
	}
	// �޺��ڽ��� ���õǾ����� ȣ��Ǵ� �̺�Ʈ ó�� �޼ҵ�
	@Override
	public void itemStateChanged(ItemEvent ie) 
	{
		System.out.println("���õ� ������ = " + ie.getItem());
		if(ie.getStateChange() == ItemEvent.SELECTED) // �и��� ���õǸ�
			department = Integer.parseInt(ie.getItem().toString()); // ���õ� �׸��� ������ ��ȯ �� ����
	}
}