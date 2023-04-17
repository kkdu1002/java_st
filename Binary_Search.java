package jang12;

public class Binary_Search 
{
	public static void main(String[] args) 
	{
//		�̺� �˻� : ������ �ݵ�� �˻����� ������������ ������ �Ǿ� �־�� ��
//		�߰���ġ�� �������� ã��
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		
		int low = 0;
		int high = arr.length;	// �ǳ� ��ġ
		int mid;
		int index = -1; // ��ã����
		int sd = 70; // ã�� ��
		
		System.out.println("arr.length�� �� : " + arr.length);
		System.out.println("high�� �� : " + (arr.length - 1));
		System.out.println("mid�� �� : " + (low + high) / 2 + "\n");
		
		while(low <= high)
		{
			mid = (low + high) / 2;
			if(sd == arr[mid])
			{	// ã��
				index = mid;
				break;
			}
			else if(sd > arr[mid])
			{	// ã�°� > �߰���ġ ��
				low = mid + 1;	// ã�°��� ũ�� �߰���ġ +1 ��ŭ �ּ���ġ�� ����
			}
			else
			{
				high = mid - 1; // ã�°��� ������ �߰���ġ -1 ��ŭ �ִ���ġ�� ����
			}
		}
		if (index == -1)
		{
			System.out.println("ã�� �����߽��ϴ�.");
		}
		else
		{
			System.out.println("�˻��� 70���� index : " + index);
		}
	}
}