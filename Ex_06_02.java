package jang6;

public class Ex_06_02 
{
	public static void main(String[] args) 
	{
		int i;
		
		System.out.println("for��");
		for (i = 0; i < 3 ;i++)
		{
			System.out.println("�ȳ��ϼ���?");
			System.out.println("##�� �ȳ��ϼ���?##");
		}
		System.out.println("while��");
		
		i = 0;
		while(i < 3) 
		{
			System.out.println("�ȳ��ϼ���?");
			System.out.println("##�� �ȳ��ϼ���?##");
			i++;
		}
		System.out.println("do while��");
		i = 0;
		do  
		{
			System.out.println("�ȳ��ϼ���?");
			System.out.println("##�� �ȳ��ϼ���?##");
			i++;
		}
		while(i < 3);
	}
}