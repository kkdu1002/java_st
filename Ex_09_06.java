package jang9;

public class Ex_09_06 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int max = -1; // �ʱⰪ�� ���� ������ , ������ ���۰�
		int min = 10; // �ʱⰪ�� ���� ū�� , ������ ���۰�
		for(int i = 1; i <= 10; i++) 
		{
			System.out.printf("%d\t",i);
			sum += i;
			if(i%5 == 0)
				System.out.printf("\n");
			if(max < i) //  �ִ밪
				max = i;
			if(min > i) // �ּҰ�
				min = i;
		}
		System.out.printf("�հ� : %d\n",sum);
		System.out.printf("max : %d\n",max);
		System.out.printf("min : %d\n",min);
	}
}