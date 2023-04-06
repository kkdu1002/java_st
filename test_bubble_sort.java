package jang12;

public class test_bubble_sort 
{
	public static void main(String[] args) 
	{
		int i , j , temp;
		int a[] = {52,42,12,62,50};
		System.out.print("Source Data : ");
		for (int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		for(i = 0; i < a.length - 1; i++) 
		{
			for( j = 0; j <a.length - 1 - i; j++) 
			{
				if(a[j] > a[j + 1]) 
				{ // 자리바꾸기
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.print("Sorted Data : ");
		for (int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}