package jang2;

import java.util.Scanner;

public class Grade_Switch {

	public static void main(String[] args) {
		char input_grade;
		Scanner grade1 = new Scanner(System.in);
		
		System.out.print("������ �Է�[A~F] : ");
		//		char grade = 'C';
		/*
		 * switch�� : �پ��� ó������ �ΰ� ���ǰ��� ���� �ϳ��� ó�����̳� �������� ó������ �ѹ��� �����ϴµ� ������ �б�(��)��
		 * 
		 * ������(byte, short , char , int),jdk 1.7���� String���� ����Ѵ�.
		 * long, float , double , boolean�� ���Ұ�.
		 * ���� �� �� ���� , ���� �� �� ����.
		 * byte, short , char , int , String�� �� ����
		 * */
		while(grade1.hasNext()) 
		{
			input_grade = grade1.next().toUpperCase().charAt(0);
//			                           �ҹ��ڸ� �빮�ڷ� ����
			switch (input_grade) 
			{
				case 'A':
				case 'B':
					System.out.println("�� ���Ͽ����ϴ�.");
					break;
				case 'C':
				case 'D':
					System.out.println("�� �� ����ϼ���.");
					break;
				case 'F':
					System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
					break;
				default:
					System.out.println("�߸��� �����Դϴ�.");
			}
			System.out.print("������ �Է�[A~F] : ");
		}
		System.out.print("����Ǿ����ϴ�.");
		grade1.close();
	}

}
