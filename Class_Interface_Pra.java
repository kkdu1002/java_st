package jang12;
import java.util.Scanner;

// 속성만 존재하는 클래스
class Record
{	// 학생수 저장할 배열로 사용할 예정 
	String name; 
	String[] score = new String[3]; // 수,우,미,양,가 중 하나 넣기
	int[] sco = new int[3];
	int numbel , avg , sum;
}

interface Sung
{
	public void set(); // 인원수 입력
	public void input(); // x번째 학생의 학번 이름 입력(공백구분)
						 // 국 영 수 점수 입력 (공백 구분)
	public void print(); // 학번 이름 국점수 영점수 수점수
						 //          가    가   가
}

class SungImpl implements Sung
{
	int in;	// 인원 입력받음
	Record re[]; // 레코드 갯수
	
	@Override
	public void set() // 인원수 저장
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("인원수 입력 : ");
			in = sc.nextInt();
		}
		while( 1 > in || in > 10);
		re = new Record[in];
	}

	@Override
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < re.length; i++)
		{
			re[i] = new Record();
			System.out.printf("%d번째 학생의 학번 이름 입력(공백구분) : ", i + 1);
			re[i].numbel = sc.nextInt();
			re[i].name = sc.nextLine();
			
			System.out.printf("국어 영어 수학 점수 입력(공백구분) : ");
			re[i].sco[0] = sc.nextInt();
			re[i].sco[1] = sc.nextInt();
			re[i].sco[2] = sc.nextInt();
			
			for(int j = 0; j < re[i].sco.length; j++)
			{
				if(re[i].sco[j] >= 90)
				{
					re[i].score[j] = "수";
				}
				else if(re[i].sco[j] >= 80)
				{
					re[i].score[j] = "우";
				}
				else if(re[i].sco[j] >= 70)
				{
					re[i].score[j] = "미";
				}
				else if(re[i].sco[j] >= 60)
				{
					re[i].score[j] = "양";
				}
				else
				{
					re[i].score[j] = "가";
				}
			}
			re[i].sum = re[i].sco[0] + re[i].sco[1] + re[i].sco[2];
			re[i].avg = re[i].sum / 3;
		}
	}

	@Override
	public void print()
	{
		System.out.printf("\n%s\t%s\t%s\t%s\t%s\t%s\t%s\n","번호","이름","국어","영어","수학","총점","평균");
		System.out.println("----------------------------------------------------");
		for(int i = 0; i < re.length; i++)
		{
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\n",re[i].numbel,
								re[i].name,re[i].sco[0],re[i].sco[1],re[i].sco[2],
								re[i].sum,re[i].avg);
			System.out.printf("\t\t%s\t%s\t%s\n",re[i].score[0],re[i].score[1],re[i].score[2]);
		}	
	}
}

public class Class_Interface_Pra 
{
	public static void main(String[] args)
	{
		SungImpl ob = new SungImpl();
		ob.set();
		ob.input();
		ob.print();
	}
}
