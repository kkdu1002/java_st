package jang12;
// 1. call by reference = address : ��ȯ
//	  �ּҸ� �����ؼ� �����ϰ� ���ƿͼ� ���������� ��ȭ o
public class array_uesmain6 
{	// ��ȯ x , �Ű����� o 
	public static int[] disp (int[] a) 
	{
		System.out.println("����� disp-------");
		for(int i = 0; i < a.length;i++) 
		{
			System.out.printf("a[%d] = %d\n",i,a[i]);
			a[i] = i;
		}
		int m[] = {5,6,7};
		return m;
	}
	public static void main(String[] args) 
	{	
		int a[] = new int[5]; // �ʱⰪ�� �޼ҵ� ȣ���ؼ� ����ϱ�
		int b[] = disp(a); // �ּ�����

		System.out.println("����� B-------");
		for(int i = 0; i < a.length;i++) 
		{
			System.out.printf("b[%d] = %d\n",i,b[i]);
		}
	}
}