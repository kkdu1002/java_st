package jang2;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		String grade; // ������ ""�Ǵ� null
		int score;
		Scanner num = new Scanner(System.in);
		System.out.print("���� : ");
		
		while(num.hasNext()) 
		{
			score = num.nextInt();
			
			if(score > 100 | score < 0) 
			{
				grade = "�߸� �Է�";
				if (score == -1)
					break;
			}
			else if(score <= 100.0 & score >= 90.0)
				grade = "A";
			else if(score < 90.0 & score >= 80.0)
				grade = "B";
			else if(score < 80.0 & score >= 70.0)
				grade = "C";
			else if(score < 70.0 & score >= 60.0)
				grade = "D";
			else
				grade = "F";
			if(grade.equals("�߸� �Է�")) 
			{ 
				//equals() �޼ҵ�� �ݺ������� �ſ� �����ϰ�, ��� �ε����� ���� ������ ����
				//��ü :== �ּҺ�
				System.out.print("�߸� �Է��Ͽ����ϴ�.\n");
			}
			else 
			{
				System.out.print("������ " + grade + "�Դϴ�.\n");
			}
			System.out.print("���� : ");
		}
		System.out.print("�׸�....");
		num.close();
	}

}
