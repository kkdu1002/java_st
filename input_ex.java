package jang2;

import java.io.*;

public class input_ex {

	public static void main(String[] args) {
//		�Է� ��Ʈ�� ��ü ���� 2byte <- 1byte
		InputStreamReader rd = new InputStreamReader(System.in);
//		ǥ�� �Է� ��ġ : System.in , Ű����
//		ǥ�� ��� ��ġ : System.out , �����
		try { // ���� �˻縦 �ؼ� ������ ������ �Ʒ������� ó����
			//catch���� ó������ �ʰ� ����.
			//������ ������ �Ʒ����� ó������ �ʰ� catch������ ó����
			while (true) {
				int a = rd.read();
				if(a == -1) // cnt z -- > ������ �� EOF == -1
					break; //�ݺ���(while) Ż��
				System.out.println((char)a);
			}
		}
		catch(IOException e) {
			System.out.println("�Է� ���� �߻�" + e.getStackTrace());
		}
	}
}
