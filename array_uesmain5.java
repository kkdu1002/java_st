package jang12;
// 1. call by reference = address : 반환
//	  주소를 복사해서 전달하고 돌아와서 원래변수에 변화 o
public class array_uesmain5 
{	// 반환 o , 매개변수 o 
	public static int[] disp(int a[]) 
	{
		System.out.println("여기는 disp-------");
		int m[] = {5,6,7};
		return m;
	}
	public static void main(String[] args) 
	{	
		int a[] = new int[5]; // 초기값을 메소드 호출해서 출력하기
		int b[] = disp(a); // 주소전달
		System.out.println("\n여기는 main-------");
		for(int i = 0; i < b.length;i++) 
		{
			System.out.printf("b[%d] = %d\n",i,b[i]);
		}
	}
}