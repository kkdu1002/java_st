package jang10;

import java.io.IOException;

public class Ex_10_10 
{
	public static void main(String[] args) throws IOException
	{
		while(true) 
		{
		
		System.out.print("���ĺ� �� ���� �Է� : ");
		int alpa = System.in.read();
		
		System.in.skip(2);
			if(alpa >= 65 && alpa <= 90) //�빮��
			{
				if(alpa == 65 || alpa == 69 || alpa == 73 || alpa == 79 || alpa == 85)
					System.out.print("���� Ok\n");
				else
					System.out.print("�����Դϴ�.\n");
			}
			else if(alpa >= 97 && alpa <= 122) 
			{ //�ҹ���
				if(alpa == 97 || alpa == 101 || alpa == 105 || alpa == 111 || alpa == 117)
					System.out.print("���� Ok\n");
				else
					System.out.print("�����Դϴ�.\n");
			}
			else if(alpa == '0') 
				break;
			else
				System.out.print("�߸��� �Է��Դϴ�.\n");
		}
		System.out.print("��");
	}
}