package jang12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_calendar01 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		// �ֿ� ���� ���� 
		int year , month , day , nal;
		// �迭 ���� �� �ʱ�ȭ , �� ���� ����ִ� ������ ��¥
		int mon_len []= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		do 
		{
		System.out.print("[�⵵]�� �Է��ϼ���");
		year = Integer.parseInt(input.readLine());
		}
		while(year < 1);
		
		do 
		{
			System.out.print("[��]�� �Է��ϼ���");
			month = Integer.parseInt(input.readLine());
		}
			while(month < 1 || month > 12);
		
		// 1�� 1�� 1�� ~ �Է¹��� �⵵ ���� �⵵�� 12�� 31�� ������ �� �� ���
		// 4�� ���� ���� �̹Ƿ� + 1 / 100�� �ϰ�� ������ �ƴϹǷ� - 1 / 400���ϰ�� �����̹Ƿ� + 1 �ؼ� ��¥�� ����
 		nal = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year-1) / 400;

		// �Է¹��� �⵵�� 2���� ������ �� ���
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) //����
			mon_len[1] = 29;
		
		//�ش� �⵵ 1������ �Է¹��� �� ���� ���� ������ ��¥������ �� �� ���� ����
		for(int i = 0; i < (month - 1); i++) 
		{
			nal += mon_len[i];
		}
		// �Է¹��� ���� 1�� , ����ϼ� = ������ ����
		nal += 1;

		// ���� ���� : �Է¹��� ���� 1���� ���� �������� Ȯ���ϱ� ���� ���� / 0 : �Ͽ��� , 1 : ������
		day = nal % 7;
		
		// �޷� �׸���(���)
		System.out.println();
		System.out.print("\t[" + year + "�� " + month + "�� ]\n");
		System.out.println();
		System.out.println("   ��  ��   ȭ   ��   ��  ��   ��");
		System.out.println("=================================");
		
		// Ư�� ���Ϻ��� 1���� ����� �� �ֵ��� ���� �߻�(����)
		for(int i = 1; i <= day; i++) 
		{
			System.out.print("    "); // ���� 4ĭ
		}
		
		// �ش� ���� ��¥�� ��µ� �� �ֵ��� �ݺ��� ����
		for(int i = 1; i <= mon_len[month - 1]; i++) 
		{
			System.out.printf("%4d", i);
			day++; // ��¥�� �����ϴ� ��ŭ ���ϵ� ����
			
			//�Ͽ��� ����� �� ���� �ٹٲ��ϰ� ����� �� �ֵ��� ó��
			if(day % 7 == 0) 
			{
				System.out.println();
			}
		}
		// ���� ������ ��¥�� ��������� ��� ä���� ���
		// �̹� �Ͽ��� �ٹٲ��� �̷������ ������ �����ʵ��� ó��
		if(day % 7 != 0) 
		{
			System.out.println();
		}
		System.out.println("=================================");
	}
}