package jang3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_05_999 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{			
		BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
		// 2�� ��Ʈ�� : 1����Ʈ�� 2����Ʈ�� �����ϴ� Ŭ���� (1����Ʈ�� : 1����Ʈ) System.in => Ű����
		// InputStreamReader => 1����Ʈ 2����Ʈ�� ���� ���� BufferedReader ==> ���ۿ� ����
		int input_num;
		System.out.printf("1 ~ 4 �߿� �����ϼ���. [0�̰ų� 0���� ������ ����] : ");
		input_num = Integer.parseInt(z.readLine()); // ���Ͱ� ������ ������ ����
		
		//input_num = z.read(); // '0' --> ���ڸ� �о ������(�ƽ�Ű �ڵ尪)
		//input_num = input_num - '0'; // ������ ������ ����
		
		// readLine() => ������ String���� ����
		while(input_num > 0) 
		{
			switch(input_num) 
			{
				case 1:
					System.out.printf("%d�� �����ߴ�.\n",input_num);
					break;
				case 2:
					System.out.printf("%d�� �����ߴ�.\n",input_num);
					break;
				case 3:
					System.out.printf("%d�� �����ߴ�.\n",input_num);
					break;
				case 4:
					System.out.printf("%d�� �����ߴ�.\n",input_num);
					break;
				default:
					System.out.printf("�̻��Ѱ��� �����ߴ�.\n");
			}
			System.out.printf("1 ~ 4 �߿� �����ϼ���. [0�̰ų� 0���� ������ ����] : ");
			input_num = z.read();
			input_num = input_num - '0';
			z.skip(2);
		}
		System.out.printf("----- ���� -----");
	}
}