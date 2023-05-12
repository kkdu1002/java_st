package mini_project;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

/*
	화면 레이아웃
	- 사용자로부터 입력을 받거나 처리된 결과를 보여주기 위한 어플리케이션의 프레젠테이션 기능을 구현한다.
	- 사용자가 쉽게 사용할 수 있도록 UI(User Interface)컴포넌트를 배열하고, navigation정책을 세운다
	
	AddOane() : 사원 정보 입력 탭 객체
	- 정보를 입력 받기 위한 텍스트 필드 배열, 저장하기 번튼 , 다시쓰기 버튼으로 구성된다
	
	actionPerformed() :
	- 저장하기 버튼 : 누르면 텍스트 필드의 내용을 디버거에 저장
	- 다시쓰기 버튼 : 누르면 텍스ㅡ트 필드의 내용을 초기화
 */
public class AddPane extends JPanel implements ActionListener , ItemListener
{
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb; // 저장
	private JButton rsb; // 다시쓰기
	private int department = 10;
	// 입력받을 항목의 제목
	String caption [] = {" 이름 : "," 직 책 : "," 메 일 : "," 부 서 : "};
	AddPane()
	{
		setLayout(new GridLayout(6,1));
		EtchedBorder eb = new EtchedBorder(); // 경계면에 효과 주기
		//  해당 컴퍼넌트의 경계를 설정
		setBorder(eb);
		
		// 입력 받을 항목의 개수
		int size = caption.length;
		System.out.println(size);
		
		//텍스트 필드와 레이블을 패널에 묶어서 AddPane에 붙인다
		int i,j = 1;
		for(i = 0; i < size - 1; i++)
		{
			j++;
			System.out.print(i + " ");
			System.out.print(caption[i]);
			
			jp[i] = new JPanel();
			jp[i].setBackground(new Color(j * 60 , j * 50 , j * 30));
			jl[i] = new JLabel(caption[i]); // 입력받을 제목을 위한 레이블
			tf[i] = new JTextField(15); // 사원 정보 입력을 위한 텍스트 필드
			
			jp[i].add(jl[i]); // 패널에 레이블 붙이기
			jp[i].add(tf[i]); // 패널에 텍스트 필드 붙이기
			
			System.out.println(this + ".....");
			setBackground(Color.YELLOW);
			add(jp[i]); // 패널 붙이기
		}
	
	
	// 화면을 미려하게 만들기 위해 공간을 확보하기 위한 패널 추가 / 마지막 4번째 패널
	System.out.println("\n마지막 패널 " + i);
	jp[i] = new JPanel();
	jp[i].setBackground(Color.CYAN);
	jl[i] = new JLabel(caption[i]);
	jp[i].add(jl[i]); // 화면 공간 확보
	add(jp[i]);
	
	// 부서 선택을 위한 콤보박스 생성
	JComboBox combo = new JComboBox();
	combo.addItem("부서번호를 선택하세요.");
	
	// 10 ~ 50번까지 부서번호를 콤보박스 항목으로 추가
	for(int c = 1; c <= 5; c++)
		combo.addItem(c * 10);
	System.out.println("\n콤보의 패널위치 : " + i);
	jp[i].add(combo); // 콤보박스를 패널에 추가
//	combo.addActionListener(this); //콤보박스 이벤트 처리
	combo.addItemListener(this);
	
	jp[size] = new JPanel(); // 패널 배열의 마지막 원소 생성 5번째 패널
//	버튼생성 / 이벤트 처리
	okb = new JButton("저장하기");
	okb.addActionListener(this);
	rsb = new JButton("다시쓰기");
	rsb.addActionListener(this);
	jp[size].setBackground(Color.PINK);
	
	// 패널에 버튼 추가
	jp[size].add(okb); // size 입력 받을 항목의 개수를 구함
	jp[size].add(rsb);
	add(jp[size]); // 버튼을 포함한 패널을 AppPane에 추가
	}
	// 버튼에 대한 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		String ae_type = ae.getActionCommand();
		EmployeeVO evo = new EmployeeVO();
		EmployeeDAO edvo = null;
		
		if(ae_type.equals(okb.getText()))
		{
			//저장하기 버튼이 클릭되었을 경우
			try
			{
				evo = new EmployeeVO(0, tf[0].getText(), tf[1].getText() , department , tf[2].getText());
				//입력받은 사원 정보를 DB에 추가하기 원한 DAO객체 생성
				edvo = new EmployeeDAO();
				
				// DB에 추가하기 위한 메소드 호출
				evo = edvo.getEmployeeregiste(evo);
			}
			catch(Exception e)
			{
				System.out.println("여기 저장버튼 클릭시 e= [" + e + "]");
			}
			if(edvo != null)
				JOptionPane.showMessageDialog(this, tf[0].getText() + "님이 성공적으로 추가됨");
		}
		else if(ae_type.equals(rsb.getText()))
		{
			// 다시쓰기 버튼이 클릭되었을 경우
			int size = caption.length;
			
			// 텍스트 필드 초기화
			for(int i = 0; i < size - 1; i++)
			{
				tf[i].setText("");
			}
		}
		System.out.println(evo.toString());
	}
	// 콤보박스가 선택되었을때 호출되는 이벤트 처리 메소드
	@Override
	public void itemStateChanged(ItemEvent ie) 
	{
		System.out.println("선택된 아이템 = " + ie.getItem());
		if(ie.getStateChange() == ItemEvent.SELECTED) // 학목이 선택되면
			department = Integer.parseInt(ie.getItem().toString()); // 선택된 항목을 정수로 변환 후 저장
	}
}