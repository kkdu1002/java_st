package jang12;
/*
 정렬 : 데이터를 순서대로 나열 (오름차순 , 내림차순 )
 정렬의 목적 : 가독성을 늘리기 위함 --> 보기 좋게 검색하기 쉽게
 정렬의 종료 : 선택 , 버블 , 삽입 , 힙 ,텔 
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
				{// 자리바꾸기
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