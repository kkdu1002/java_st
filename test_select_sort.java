package jang12;
/*
 ���� : �����͸� ������� ���� (�������� , �������� )
 ������ ���� : �������� �ø��� ���� --> ���� ���� �˻��ϱ� ����
 ������ ���� : ���� , ���� , ���� , �� ,�� 
 */
public class test_select_sort
{
	public static void main(String[] args) 
	{	
		int i , j , temp = 0;
		int a[] = {52,42,12,62,50};
		System.out.print("Source Data : ");
		for (int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		for(i = 0; i < a.length - 1; i++) 
		{
			for( j = i + 1; j <a.length ; j++) 
			{
				if(a[i] > a[j]) 
				{// �ڸ��ٲٱ�
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Sorted Data : ");
		for (int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();
		/*
		for(i = 0; i < a.length - 1; i++) 
		{
			for( j = i + 1; j <a.length ; j++) 
			{
				if(a[i] > a[j]) 
				{
					a[i] = a[i] ^ a[j];
					a[j] = a[i] ^ a[j];
					a[i] = a[i] ^ a[j];
				}
			}
		}
*/
	}
}