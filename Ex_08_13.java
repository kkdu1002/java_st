package jang8;

public class Ex_08_13 {

	public static void main(String[] args) {
		int charCode = 'A'; // 65
		// 65 >= 65   and   65 <= 90  ( true = true and true)
		if((charCode >= 65) & (charCode <= 90))
		{	// ���� �� �˻�
			System.out.println("�빮�� �̱���");
		}
		// 65 >= 97   and   65 <= 122  ( false = false and true)
		if((charCode >= 97) && (charCode <= 122))
		{ // ���ʸ� �˻� false �� ȿ������
			System.out.println("�ҹ��� �̱���");
		}
		// !(65 >= 48)   and   !(65 <= 57)  !(false) == true and !(true) == false
		if(!(charCode < 48) && !(charCode > 57))
		{
			System.out.println("0~9 ���� �̱���");
		}
		
		int value = 6;
		
		if((value  % 2 == 0) | (value % 3 == 0))
		{
			System.out.println("2�Ǵ� 3�� ��� �̱���");
		}
		if((value  % 2 == 0) || (value % 3 == 0))
		{ // ���ʸ� true �˻�
			System.out.println("2�Ǵ� 3�� ��� �̱���");
		}
	}

}
