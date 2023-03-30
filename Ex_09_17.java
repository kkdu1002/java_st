package jang9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_09_17 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("===== BufferedReader =====");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		/*
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   --'��'��� ���ڸ� BufferedReader�� ���� �Է¹��� ��� 2����Ʈ�� �����Ǿ� �ֱ� ������ 1����Ʈ�� �ɰ���
	     InpurStreamReader�� ����Ʈ ��Ʈ���� ���� ��Ʈ������ ��ȯ�����ִ� ������ �ϰԵȴ�.
	   --new�� ���� heap�޸� ������ �Ҵ�޾� �ö󰣴� �� ��� in�� reference type �����̴�. 
		  */
		
		String name_b;
		int nKor_b , nMat_b, nEng_b , nTot_b;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name_b = in.readLine();
		System.out.print("���� ���� : ");
		nKor_b = Integer.parseInt(in.readLine());
		System.out.print("���� ���� : ");
		nEng_b = Integer.parseInt(in.readLine());
		System.out.print("���� ���� : ");
		nMat_b = Integer.parseInt(in.readLine());
		
		nTot_b = nKor_b + nMat_b + nEng_b;
		System.out.println("====== [�� ��] ======");
		System.out.printf("�̸� : %s\n",name_b);
		System.out.printf("���� : %d\n",nTot_b);
		
		System.out.println("===== Scanner =====");
		
		Scanner br = new Scanner(System.in);
		
		 String strName;
		 int nKor , nMat, nEng , nTot;
		/* -- String�� ?
		  'A' : ���� stack ������ ����
		  "A" : ���ڿ� Heap ������ ����
		  --String ��ŭ�� new�� ����Ͽ� �޸� ������ �Ҵ� �����ʾƵ� ��� �����ϴ�.
		  int k ,e, m ,t(��,��,��,�� ���� ����) stack�޸� ������ 5����Ʈ�� ��16����Ʈ �ö󰣴�.
		*/
			
		String strData; // ���ڿ� ������ �ӽ�����
		System.out.print("�̸��� �Է��ϼ��� : ");
		strName = br.next(); //readLine();
		/* --����ڰ� �Է��� ��(�ܺ� ������)�� �޾ƿͼ� ������ ��Ƴ���
		 --readLine()�� ?
		 BufferedReader�� �޼ҵ�� ���پ� �Է¹޴´�.
		 ���� �Է��� ���޴´�. ���� ���ڿ� �Է¹޴´�.
		 read() �޼ҵ�� �Է¹��� ���
		 "ȫ�浿"�� 5���� �Է¹޾ƾ��Ѵ�. ????
		*/
		System.out.print("���� ���� : ");
		strData = br.next();//readLine();
		nKor = Integer.parseInt(strData);
		/*	 
		 -- �� ��Ȳ���� ���� ���� 70���� �Է¹޾Ҵٰ� �����Ҷ� readLine()�� ���� �Է¹��� 70��
		 ���ڰ� �ƴ϶� ���ڿ��̴�. ���ڷ� �ٲ��� ������ ��� ������ �Ұ����ϴ�. �� ���������� ���ڸ�
		 ����Ÿ������ �ٲپ��ִ°��̴� Integer.parseInt()�� ���� ������ ���� ��ȯ�Ѵ�.
		 */
		System.out.print("���� ���� : ");
		strData = br.next();//readLine();
		nMat = Integer.parseInt(strData);
		
		System.out.print("���� ���� : ");
		strData = br.next();//readLine();
		nEng = Integer.parseInt(strData);
		
		nTot = nKor + nMat + nEng;
		System.out.println("====== [�� ��] ======");
		System.out.printf("�̸� : %s\n",strName);
		System.out.printf("���� : %d\n",nTot);
	}
}