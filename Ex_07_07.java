package jang7;

public class Ex_07_07 
{
	public static void main(String[] args) 
	{
		int hap = 0 , i;
		
		for(i = 1; i <= 100; i++)
			hap += i;

		System.out.printf("1���� 100������ ���� %d �Դϴ�\n",hap);

		if (hap > 5000)
			return;
		
		System.out.printf("���α׷��� ���Դϴ�.");
	}
}