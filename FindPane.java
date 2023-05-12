package mini_project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
/*
	사원 정보 조회를 위한 UI와 검색 처리를 하는 FindPane
	FindPane() : 사원정보 조회 탭 객체
	- 검색을 위한 사원 정보를 입력 받기위한 텍스트 필드와 사원조회 다시쓰기 버튼으로 구성
	actionPerformed()
	- 조회버튼을 누르면 텍스트필드의 내용과 일치하는 DB로부터 읽어옴
	- DB를 조회한 후 결과를 출력
	- 다시쓰기 버튼을 누르면 텍스트 필드의 내용을 초기화
 */
public class FindPane extends JPanel implements ActionListener
{
	private JPanel jp [] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb;
	private JButton rsb;
	
	String caption [] = {" 사 번 : "," 이 름 : "," 직 책 : "," 부 서 : "," 메 일 : "};
	
	public FindPane()
	{
		setLayout(new GridLayout(7,1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		
		int size = caption.length;
		//레이블의 길이
		for(int i = 0; i < size; i++)
		{
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i] = new JPanel();
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
			// 텍스트필드를 입력 불가능한 상태로 만든다
			tf[i].setEditable(false);
			if(i == 0 || i == 1)
				// 사번과 이름으로 검색해야 입력 가능한 상태로 만든다
				tf[i].setEditable(true);
		}
		//사원조회, 다시쓰기 버튼 생성후 이벤트를 처리, 패널에 붙임
		jp[size] = new JPanel();
		okb = new JButton("사원정보조회");
		okb.addActionListener(this);
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);
		jp[size].add(okb);
		jp[size].add(rsb);
		add(jp[size]);
	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{ // 이벤트가 발생한 버튼의 캡션의 값을 얻어온다
		String ae_type = ae.getActionCommand();
		
		EmployeeVO evo = null; // 검색한 사원 정보를 저장할 VO객체 생성
		EmployeeDAO edvo = null; // DB처리를 위한 DAO객체 생성
		
		if(ae_type.equals(okb.getText())) // 사원조회 버튼이 클릭되었을 경우
		{
			try
			{
				// DB처리를 위한 DAO객체 생성
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim();
				String sname=tf[1].getText().trim();
				
				// 사번과 이름 입력을 모두 입력했을 경우
				if(!sno.equals("") && !sname.equals(""))
				{
					int no = Integer.parseInt(sno);
					// 사번,이름으로 검색
					evo = edvo.getEmployeeCheck(no, sname);
				}
				
				//사번만 입력 했을 경우
				else if(!sno.equals("") && sname.equals(""))
				{
					int no = Integer.parseInt(sno);
					// 사번으로 검색
					evo = edvo.getEmployeeNo(no);
				}
				
				//이름만 입력 했을 경우
				else if(sno.equals("") && !sname.equals(""))
				{
					// 이름으로 검색
					evo = edvo.getEmployeeName(sname);
				}
			}
			catch(Exception e)
			{
				System.out.println("e = [" + e + "]");
			}
				//해당 사원이 존재한다면
				if(evo != null)
				{	// 텍스트 필드를 해당 사원 값으로 초기화
					tf[0].setText(evo.getNo() + "");
					tf[1].setText(evo.getName() + "");
					tf[2].setText(evo.getJobgrade() + "");
					tf[3].setText(evo.getDepartment() + "");
					tf[4].setText(evo.getEmail() + "");
				}
				else
				{
					JOptionPane.showMessageDialog(this, "검색 실패");
				}
		}
		else if(ae_type.equals(rsb.getText()))
		{
			// 다시쓰기 버튼 클릭되었을때
			int size = caption.length;
			//텍스트 필드 초기화
			for(int i = 0; i < size; i++)
			{
				tf[i].setText("");
			}
		}
	}
}