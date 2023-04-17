package jang12;

public class Binary_Search 
{
	public static void main(String[] args) 
	{
//		이분 검색 : 조건이 반드시 검색전에 오름차순으로 정렬이 되어 있어야 함
//		중간위치를 기준으로 찾음
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		
		int low = 0;
		int high = arr.length;	// 맨끝 위치
		int mid;
		int index = -1; // 못찾을때
		int sd = 70; // 찾을 값
		
		System.out.println("arr.length의 값 : " + arr.length);
		System.out.println("high의 값 : " + (arr.length - 1));
		System.out.println("mid의 값 : " + (low + high) / 2 + "\n");
		
		while(low <= high)
		{
			mid = (low + high) / 2;
			if(sd == arr[mid])
			{	// 찾음
				index = mid;
				break;
			}
			else if(sd > arr[mid])
			{	// 찾는값 > 중간위치 값
				low = mid + 1;	// 찾는값이 크면 중간위치 +1 만큼 최소위치에 넣음
			}
			else
			{
				high = mid - 1; // 찾는값이 작으면 중간위치 -1 만큼 최대위치에 넣음
			}
		}
		if (index == -1)
		{
			System.out.println("찾기 실패했습니다.");
		}
		else
		{
			System.out.println("검색한 70값의 index : " + index);
		}
	}
}