package jang12;
import java.util.Scanner;

// �Ӽ��� �����ϴ� Ŭ����
class Record
{	// �л��� ������ �迭�� ����� ���� 
	String name; 
	String[] score = new String[3]; // ��,��,��,��,�� �� �ϳ� �ֱ�
	int[] sco = new int[3];
	int numbel , avg , sum;
}

interface Sung
{
	public void set(); // �ο��� �Է�
	public void input(); // x��° �л��� �й� �̸� �Է�(���鱸��)
						 // �� �� �� ���� �Է� (���� ����)
	public void print(); // �й� �̸� ������ ������ ������
						 //          ��    ��   ��
}

class SungImpl implements Sung
{
	int in;	// �ο� �Է¹���
	Record re[]; // ���ڵ� ����
	
	@Override
	public void set() // �ο��� ����
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο��� �Է� : ");
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
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���鱸��) : ", i + 1);
			re[i].numbel = sc.nextInt();
			re[i].name = sc.nextLine();
			
			System.out.printf("���� ���� ���� ���� �Է�(���鱸��) : ");
			re[i].sco[0] = sc.nextInt();
			re[i].sco[1] = sc.nextInt();
			re[i].sco[2] = sc.nextInt();
			
			for(int j = 0; j < re[i].sco.length; j++)
			{
				if(re[i].sco[j] >= 90)
				{
					re[i].score[j] = "��";
				}
				else if(re[i].sco[j] >= 80)
				{
					re[i].score[j] = "��";
				}
				else if(re[i].sco[j] >= 70)
				{
					re[i].score[j] = "��";
				}
				else if(re[i].sco[j] >= 60)
				{
					re[i].score[j] = "��";
				}
				else
				{
					re[i].score[j] = "��";
				}
			}
			re[i].sum = re[i].sco[0] + re[i].sco[1] + re[i].sco[2];
			re[i].avg = re[i].sum / 3;
		}
	}

	@Override
	public void print()
	{
		System.out.printf("\n%s\t%s\t%s\t%s\t%s\t%s\t%s\n","��ȣ","�̸�","����","����","����","����","���");
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
